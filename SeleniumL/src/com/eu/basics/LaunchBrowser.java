package com.eu.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LaunchBrowser {

	public static WebDriver driver = null;
	public static WebDriverWait wait = null;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
		
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 10);
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Register.html");
		
		
		driver.close();
	}

}
