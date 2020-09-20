package com.week2.selenium;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VisibilityOfElements {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://freshworks.com");
		
		By footerLinks = By.xpath("");
		
//	WebDriverWait wait = new WebDriverWait(driver, 10);
		
//	List<WebElement> footerLinksList = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(footerLinks));
//	    for(WebElement ele: footerLinksList) {
//		System.out.println(ele.getText());
//	}

//footerLinksList.stream().forEach(ele ->System.out.println(ele.getText()));

	}
	public List<WebElement> visiblityOfAllTheElements(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}
	public void getPageLinksText(By locator, int timeOut) {
		visiblityOfAllTheElements(locator, timeOut).stream()
.forEach(ele-> System.out.println(ele.getText()));	
		}
}
