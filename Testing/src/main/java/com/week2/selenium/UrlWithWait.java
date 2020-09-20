package com.week2.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class UrlWithWait {
	static WebDriver driver;
	
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("http://the-internet.herokuapp");

	WebDriverWait wait = new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Sign Up"))).click();

	if(wait.until(ExpectedConditions.urlContains("signup"))){
		System.out.println("signup page is correct");
	}
	else {
		System.out.println("signup page in not correct");
	}
	
}


}
