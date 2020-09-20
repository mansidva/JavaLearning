package com.week2.selenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWaitConcept {

	static WebDriver driver;
	static WebDriverWait wait;
//wait applicable only for webelements----
	//find element and find elements-- 
	//global wait--- its applicable for all webelements during the driver session
	//doesnt wait with non webelement
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://app.hubspot.com/login");
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS); //nullify imp wait

		driver.findElement(By.id("username")).sendKeys("143vmis@gmail.com");
		driver.findElement(By.id("password")).sendKeys("somepassword");
	}
}
