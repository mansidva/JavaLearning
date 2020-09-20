package com.casestudies.eu;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CaseStudy1 {
	public static WebDriver driver = null;
	public static WebDriverWait wait = null;

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 10);

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com");
		driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Mansi");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Dandaleon");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("5169785232");
		driver.findElement(By.id("userName")).sendKeys("143vmis@gmail.com");
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("3220,  hill");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Ashburn");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Virginia");
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("20148");
		driver.findElement(By.id("email")).sendKeys("143vmis@gmail.com");
		driver.findElement(By.name("password")).sendKeys("EdurekaCasestudy");
		driver.findElement(By.name("confirmPassword")).sendKeys("EdurekaCasestudy");
		driver.findElement(By.xpath("//input[@name='register']")).click();
		driver.findElement(By.xpath("//a[text()='Flights']")).click();
		driver.findElement(By.name("tripType")).click();
		System.out.println("Login successful");

		WebElement country = driver.findElement(By.name("fromPort"));
		Select fromport = new Select(country);
		fromport.selectByVisibleText("Paris");

		WebElement date = driver.findElement(By.name("fromMonth"));
		Select fromMonth = new Select(date);
		fromMonth.selectByVisibleText("August");

		WebElement toPort = driver.findElement(By.name("toPort"));
		Select toPort1 = new Select(toPort);
		toPort1.selectByVisibleText("Seattle");

		WebElement Rdate = driver.findElement(By.name("toMonth"));
		Select toMonth = new Select(Rdate);
		toMonth.selectByVisibleText("December");
		driver.findElement(By.xpath("//select[@name = 'toDay']")).click();
		driver.findElement(By.xpath("//option[@value = '14']")).click();

		driver.findElement(By.name("findFlights")).click();
		// group and indexes when values are there: (//a[text()='5'])[2]; the 2 is a
		// value here//
		System.out.println("Booked ticket");

		driver.findElement(By.name("reserveFlights")).click();
		System.out.println("Selected Flight");
		Thread.sleep(2000);
		driver.findElement(By.name("passFirst0")).sendKeys("Mansi");
		driver.findElement(By.name("passLast0")).sendKeys("Dandaleon");
		driver.findElement(By.xpath("//select[@name='pass.0.meal']")).click();
		driver.findElement(By.xpath("//option[text()='Low Calorie']")).click();
		driver.findElement(By.name("creditnumber")).sendKeys("40025651525");
		driver.findElement(By.name("cc_exp_dt_mn")).click();
		driver.findElement(By.xpath("//option[contains(text(),'02')]")).click();
		driver.findElement(By.name("cc_exp_dt_yr")).click();
		driver.findElement(By.xpath("//option[contains(text(),'2009')]")).click();

		driver.findElement(By.name("cc_frst_name")).sendKeys("Mansi");
		driver.findElement(By.name("cc_last_name")).sendKeys("Dandaleon");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.name("buyFlights")).click();
		System.out.println("Itenary has been booked successfully");

		 driver.close(); 

	}
}