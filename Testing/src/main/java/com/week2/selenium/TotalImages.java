package com.week2.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalImages {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	//get total number of images: find elements
	//img tag
	//broken image if the link is not getting in src property
	driver.get("http://www.amazon.com");
	
	
	List<WebElement> imagesList = driver.findElements(By.tagName("img"));
	System.out.println(imagesList.size());
//	for(int i=0; i<imagesList.size(); i++) {
//		String source = imagesList.get(i).getAttribute("src");
//		String altText = imagesList.get(i).getAttribute("alt");
//		System.out.println(source);
//		System.out.println(altText);
		
	//}
	//instead of for we can use foreach loop:
	for(WebElement ele: imagesList) {
		System.out.println(ele.getText());
		for(int i=0; i<imagesList.size(); i++) {
			System.out.println(imagesList.get(i).getAttribute("src"));
			System.out.println( imagesList.get(i).getAttribute("alt"));
		}
		
	}	
	
//streams:
	
	imagesList.stream().forEach(ele-> System.out.println(ele.getText()) );
	
	
	
}
}
