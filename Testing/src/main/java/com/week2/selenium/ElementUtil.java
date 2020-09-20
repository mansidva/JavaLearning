package com.week2.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtil {
	WebDriver driver;
	public ElementUtil(WebDriver driver) {
		this.driver = driver;
			
	}
	public WebElement getElement(By locator) {
	      return driver.findElement(locator);

		}
		public void doSendKeys(By locator, String value) {
			getElement(locator).sendKeys(value);
				
		}
		public void doClick(By locator) {
			getElement(locator).click();
		}
		public By doGetText(By header_h1) {
			return doGetText(header_h1);
		}
		
		public  void doDropDownSelectByVisibleText(By locator, String value) {
			Select select = new Select(getElement(locator));
			select.selectByVisibleText(value);
		}
		public  void doDropDownSelectByValuet(By locator, String value) {
			Select select = new Select(getElement(locator));
			select.selectByValue(value);
		}
		public  void doDropDownSelectByIndext(By locator, int index) {
			Select select = new Select(getElement(locator));
			select.selectByIndex(index);
		}
		
		public WebElement waitForElementToBeLocated(By locator, int timeOut){
			WebDriverWait wait = new WebDriverWait(driver, timeOut);
			return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		}
		public WebElement waitForElementToBeVisible(By locator, int timeOut){
			WebElement element = getElement(locator);
			WebDriverWait wait = new WebDriverWait(driver, timeOut);
			return wait.until(ExpectedConditions.visibilityOf(element));
		}
		public  String waitForPageTitlePresent(String titleValue, int timeOut){
			WebDriverWait wait = new WebDriverWait(driver, timeOut);
			wait.until(ExpectedConditions.titleContains(titleValue));
			return driver.getTitle();
		}
		
		public  Alert waitForAlertToBEPresent(int timeOut) {
			WebDriverWait wait = new WebDriverWait(driver, 10);
		return  wait.until(ExpectedConditions.alertIsPresent());	
		}
		
		public boolean waitForUrl(String url, int timeOut) {
			WebDriverWait wait = new WebDriverWait(driver, timeOut);	
			return wait.until(ExpectedConditions.urlContains(url));
		}
		
		public void clickWhenReady(By locator, int timeOut) {
			WebDriverWait wait = new WebDriverWait(driver, timeOut);
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
			element.click();
		}
		
	
}
