package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverBasics {
	public static WebDriver driver = null;
	public static WebDriverWait wait = null;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
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
