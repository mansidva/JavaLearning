package com.week2.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElements {
	public static void main(String[] args) {
		//find elements
		//find out total number of links on the page
		//print the text of each list
		//ignore bloank text links
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.com");
		List<WebElement> linkLists = driver.findElements(By.tagName("a"));
		
		System.out.println(linkLists.size());
		for(int i=0; i<linkLists.size(); i++) {
		String text =	linkLists.get(i).getText();
			//System.out.println(text);
			if(!text.isEmpty()) {
				System.out.println(i+"----->" +text);
				System.out.println(linkLists.get(i).getAttribute("href"));
			}
		}
		
		driver.quit();
		
	}

}
