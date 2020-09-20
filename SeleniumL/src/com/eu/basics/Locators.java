package com.eu.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Locators {

	public static WebDriver driver = null;
	public static WebDriverWait wait = null;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");

		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 10);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");

		// CSS Selector//

		WebElement email = driver.findElement(By.cssSelector("input[data-testid='royal_email']"));
		email.sendKeys("divya.mansi@gmail.com");
		
		/*
		 * WebElement Username = driver.findElement(By.id("email")); // id locator//
		 * Username.sendKeys("divya.mansi@gmail.com"); // Name attribute locator//
		 * WebElement Password = driver.findElement(By.name("pass"));
		 * Password.sendKeys("Facebook09");
		 */

		/*
		 * below we are taking the CSS text which is _58mg _5dba _2ph- to execute
		 * first_name column as they are many elements which look alike and will be
		 * difficult to differentiate; as the below code wont work by using className
		 * comment below the Fname as it may throw an exception
		 */

		/*
		 * WebElement Fname =
		 * driver.findElement(By.className("inputtext _58mg _5dba _2ph-"));
		 * Fname.sendKeys("Mansi");
		 * 
		 * // always import the LIST from java.util// List<WebElement> allLinks =
		 * driver.findElements(By.tagName("a"));
		 * 
		 * // to print the size or number of all links use the below Syso//
		 * System.out.println(allLinks.size());
		 * 
		 * for (WebElement link : allLinks) { String text = link.getText();
		 * System.out.println(text);
		 * 
		 * }
		 */
		// driver.findElement(By.linkText("Forgot account?")).click();

		/*
		 * WebElement femaleRadioBtn =
		 * driver.findElement(By.xpath("//input[@value = '1']"));
		 * femaleRadioBtn.click();
		 * 
		 * WebElement f_name =
		 * driver.findElement(By.xpath("//input[@name='firstname']"));
		 * f_name.sendKeys("Mansi");
		 */

		WebElement mobile = driver.findElement(By.xpath("(//input[@class=('inputtext _58mg _5dba _2ph-')][3]"));
		mobile.sendKeys("4587455652");

		/*
		 * WebElement giv_email =
		 * driver.findElement(By.linkText("//input[@id='u_0_v']"));
		 * giv_email.sendKeys("divya.mansi@gmail.com");
		 */

		/*
		 * WebElement createAcct =
		 * driver.findElement(By.xpath("//div[contains(text(),'Create a New Account')]")
		 * ); System.out.println(createAcct.getText());
		 */

	}

}
