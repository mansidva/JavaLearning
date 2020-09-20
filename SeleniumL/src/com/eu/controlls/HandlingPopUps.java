package com.eu.controlls;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingPopUps {

	public static WebDriver  driver= null;
	public static WebDriverWait wait = null;
	
	
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 10);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.popuptest.com/");
		driver.findElement(By.linkText("Multi-PopUp Test")).click();
		
		Thread.sleep(3000);
		String parentwindow = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();
	
		for (String handle : handles) {
			
			if (handle.equals(parentwindow)) {
			continue;	
			}
			else {
				
			}

			driver.switchTo().window(handle);
			driver.manage().window().maximize();
			System.out.println(driver.getCurrentUrl());
			driver.close();
			System.out.println("Popups Closed");

		}

	}



	}

