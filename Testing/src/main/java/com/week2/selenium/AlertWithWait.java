package com.week2.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertWithWait {
static WebDriver driver;
	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("http://the-internet.herokuapp");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.findElement(By.linkText("//button"));
	Alert alert =waitForAlertToBEPresent(10);
	System.out.println(alert.getText());
	alert.accept();
	driver.switchTo().defaultContent();
	
}
	public static Alert waitForAlertToBEPresent(int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
	return  wait.until(ExpectedConditions.alertIsPresent());
		
	}
}
