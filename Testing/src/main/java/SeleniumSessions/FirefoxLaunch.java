package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class FirefoxLaunch {
	
	public static WebDriver driver = null;//maintain the method outside the main method

	public static void main(String[] args) {
		String browser = "chrome";
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
			@SuppressWarnings("unused")
			WebDriver driver = new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", ".//Drivers//geckodriver.exe");
			@SuppressWarnings("unused")
			WebDriver driver = new FirefoxDriver();
		}
	
		//don't the type casting for firefox
        //set the property for firefox and download geckdriver for the firefox
		// the driver and browser version has to match all the time or else the browser wonnt launch
		driver.get("https://mvnrepository.com/");
		String title = driver.getTitle();
		System.out.println("page title is:" + title);

//verification or a check point:actual versus expected

		if (title.equals("Maven Repository")) {
			System.out.println("true title");

		} else {
			System.out.println("false title");
		}

		System.out.println(driver.getCurrentUrl());

		// System.out.println(driver.getPageSource()); gets pagesource all html and JSscript
		driver.quit();
		/* driver.close(); */ 
	}
	}


