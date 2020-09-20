package com.eu.controlls;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseOverEvent {
	public static WebDriver driver = null;
	public static WebDriverWait wait = null;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 10);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.craftsvilla.com/");

		/*
		 * WebElement sareesLink = driver .findElement(By.xpath(
		 * "//a[@href='/womens-clothing/sarees/?MID=megamenu_sarees_seeall']")); Actions
		 * action = new Actions(driver);
		 * 
		 * action.moveToElement(sareesLink).perform();
		 * 
		 * Thread.sleep(3000); WebElement georgettSarees =
		 * driver.findElement(By.linkText("Georgette Sarees")); georgettSarees.click();
		 * 
		 * System.out.println(driver.getTitle());
		 */

		
		  Thread.sleep(3000); WebElement searchBox = driver.findElement(By.name("q"));
		  Actions action= new Actions(driver);
		  
		  Action searchString = action.keyDown(searchBox,
		  Keys.SHIFT).sendKeys("sarees").keyUp(searchBox,
		  Keys.SHIFT).doubleClick(searchBox).build();
		  
		  searchString.perform();
		  
		  // build declare as action//
		 
		/*
		 * Action select = action.keyDown(Keys.CONTROL+"a").build(); //will select all//
		 * Action select1 = action.keyDown(Keys.CONTROL+"v").build(); // wii paste//
		 */	}

}
