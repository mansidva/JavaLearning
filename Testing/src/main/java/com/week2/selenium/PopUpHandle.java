package com.week2.selenium;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PopUpHandle {

	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Good PopUp #3")).click();
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();//fetch helping iterator
		String parentWindowId = it.next();
		System.out.println("parent window id is: " + parentWindowId);
		String childWindowId = it.next();
		System.out.println("child window id is: " + childWindowId);
		driver.switchTo().window(childWindowId);
		System.out.println("child window title is:" + driver.getTitle());
		driver.close();
		driver.switchTo().window(parentWindowId);
		System.out.println("parent window title is:" + driver.getTitle());
	driver.quit();
	}

}
