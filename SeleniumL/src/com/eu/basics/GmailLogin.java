package com.eu.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailLogin {

	public static WebDriver driver = null;
	public static WebDriverWait wait = null;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");


		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 30);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.gmail.com");

		WebElement login = driver.findElement(By.id("identifierId"));
		login.sendKeys("143vmi@gmail.com");

		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.findElement(By.name("password")).sendKeys("Ayaan0118");
		driver.findElement(By.xpath("//span[text()='Next']")).click();

		wait.until(ExpectedConditions.titleContains("Inbox"));
		String title = driver.getTitle();
		if (title.contains("Inbox")) {
			System.out.println("Login Successful");
		} else {
			System.out.println("Login Failed");

		driver.close();
		}
	}

}
