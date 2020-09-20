package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsConcept {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");

		Thread.sleep(5000);
		
//By is a class name
//create a web element + then perform actions(click, sendKeys, getText)

//1. id:
//driver.findElement(By.id("username")).sendKeys("naveenanimation@gmail.com");
//driver.findElement(By.id("password")).sendKeys("Selenium@12345");
//driver.findElement(By.id("loginBtn")).click();
//driver.close();

//2 way of working with elements
//WebElement emailid = driver.findElement(By.id("username"));
//WebElement pwd = driver.findElement(By.id("password"));
//WebElement loginButton = driver.findElement(By.id("loginBtn"));
//
//emailid.sendKeys("test@gmail.com");
//pwd.sendKeys("give password");;
//loginButton.click();

//By is aclass having id and ID is a method
//by locators; 3rd way
		
		//css selector
		driver.findElement(By.cssSelector(" "));

By username = By.id("username");
By pwd = By.id("password");
By loginBtn =By.id("loginBtn");
//
//WebElement emailid = driver.findElement(username);
//WebElement password = driver.findElement(pwd);
//WebElement loginButton = driver.findElement(loginBtn);
//
//emailid.sendKeys("give email id");
//password.sendKeys("send password");
//loginButton.click();

//		getElement(username).sendKeys("something");;
//		getElement(pwd).sendKeys("some password");
//		getElement(loginBtn).click();
doSendKeys(username, "any email id");
doSendKeys(pwd, "give password");
doClick(loginBtn);
	}

	public static WebElement getElement(By locator) {
      return driver.findElement(locator);

	}
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
			
	}
	public static void doClick(By locator) {
		getElement(locator).click();
	}
}
