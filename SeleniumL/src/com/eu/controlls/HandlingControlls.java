package com.eu.controlls;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingControlls {

	public static WebDriver driver = null;
	public static WebDriverWait wait = null;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 10);

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Register.html");

		WebElement FName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		FName.sendKeys("Amerdam");

		WebElement LName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		LName.sendKeys("Damo");

		WebElement RadioBttn = driver.findElement(By.xpath("//input[@value='Male']"));
		RadioBttn.click();

		WebElement chk_Cricket = driver.findElement(By.id("checkbox1"));
		chk_Cricket.click();
		WebElement chk_Movies = driver.findElement(By.xpath("//input[@value ='Movies'] "));
		chk_Movies.click();

		WebElement country = driver.findElement(By.id("countries"));
		Select osel = new Select(country);
//Select class take the input//
		// osel.selectByIndex(5);
		// osel.selectByValue("Chile");

		osel.selectByVisibleText("India");
		driver.findElement(By.id("firstpassword")).sendKeys("Mypassword");

		driver.findElement(By.id("msdd")).click();
		driver.findElement(By.linkText("Dutch")).click();
		driver.findElement(By.linkText("English")).click();
		driver.findElement(By.id("submitbtn")).click();
	
	System.out.println("done");
		 driver.close(); 
	
	}

}
























