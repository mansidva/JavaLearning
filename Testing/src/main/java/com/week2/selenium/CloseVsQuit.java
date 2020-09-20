package com.week2.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CloseVsQuit {
	
	public static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		String title = driver.getTitle();
		System.out.println("page title is: "+ title);
		
		driver.close();
		
		//session ID when the session ID generates
		
	}

}
