package com.eu.controlls;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingDragAndDrop {


		public static WebDriver driver =null;
		public static WebDriverWait wait = null;
		

		public static void main(String[] args) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			wait = new WebDriverWait(driver, 10);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
			Thread.sleep(3000);
			WebElement src =driver.findElement(By.xpath("//h1[text()='Block 1']"));
			WebElement dest = driver.findElement(By.id("column-3"));
			
			Actions action = new Actions(driver);
			action.dragAndDrop(src, dest).perform();
			
			Thread.sleep(3000);
			WebElement src1 =driver.findElement(By.xpath("//h1[text()='Block 2']"));
			WebElement dest1 = driver.findElement(By.id("column-3"));
			
	Actions action1 = new Actions(driver);
	action1.dragAndDrop(src1, dest1).perform();

	Thread.sleep(3000);
	WebElement src2 =driver.findElement(By.xpath("//h1[text()='Block 3']"));
	WebElement dest2 = driver.findElement(By.id("column-3"));

	Actions action11 = new Actions(driver);
	action11.dragAndDrop(src2, dest2).perform();
		
	driver.close();
		
		}


	}


