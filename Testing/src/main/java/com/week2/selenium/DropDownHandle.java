package com.week2.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandle {
	public static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");

//	WebElement industry=driver.findElement(By.id("Form_submitForm_Industry"));
//	WebElement country=driver.findElement(By.id("Form_submitForm_Country"));
//	//drop down with select html tag---have to use select class in selenium
//	
//	Select select_ind = new Select(industry);
//	select_ind.selectByIndex(5);
//	select_ind.selectByValue("media");
//	select_ind.deselectByVisibleText("Education");
//	
//	Select select_country = new Select(country);
//	select_country.selectByVisibleText("Belgium");
		ElementUtil ele = new ElementUtil(driver);
		By industry = By.id("Form_submitForm_Industry");
		By country = By.id("For_submit_Form_Country");
		ele.doDropDownSelectByVisibleText(industry, "Healthcare");
		ele.doDropDownSelectByVisibleText(country, "India");

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	
}
