package com.week2.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForClickableElements{
static 	WebDriver driver;
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://the-internet.herokuapp");
	By signUpLink = By.linkText("Sign Up");
	
//By signUpLink = By.linkText("Sign Up");

//	WebDriverWait wait = new WebDriverWait(driver, 10);
//wait.until(ExpectedConditions.elementToBeClickable(signUpLink)).click();
	
//	ElementUtil ele = new ElementUtil(driver);
//	ele.clickWhenReady(signUpLink, 10);
	
	WebElement signUpElement = driver.findElement(signUpLink);
	WebDriverWait wait = new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.visibilityOf(signUpElement)).click();
	
}


}
