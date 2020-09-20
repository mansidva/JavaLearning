package com.week2.selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownOptions {
	public static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		@SuppressWarnings("unused")
		By industry = By.id("Form_submitForm_Industry");
		@SuppressWarnings("unused")
		By country = By.id("For_submit_Form_Country");

//		WebElement industry = driver.findElement(By.id("Form_submitForm_Industry"));
//		WebElement country = driver.findElement(By.id("Form_submitForm_Country"));

//		Select industry_select = new Select(industry);
//		List<WebElement> industry_option_list = industry_select.getOptions();
//		System.out.println(industry_option_list.size());
//
//	for(WebElement ele: industry_option_list) {
//		String text = ele.getText();
//		System.out.println(text);
//	}

//		for (int i = 0; i < industry_option_list.size(); i++) {
//			String text = industry_option_list.get(i).getText();
//			System.out.println(text);
//			if (text.contentEquals("Automotive")) {
//				industry_option_list.get(i).click();
//				break;
//			}

		// }

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void getAllDropDownOptions(By locator) {
		WebElement element = getElement(locator);
		@SuppressWarnings("unused")
		List<String> OptionsValueList = new ArrayList<String>();
		Select select = new Select(element);
		List<WebElement> OptionsList = select.getOptions();

		for (int i = 0; i < OptionsList.size(); i++) {
			String text = OptionsList.get(i).getText();
			System.out.println(text);
		
		}
	}
}
