package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerConcept {
	static WebDriver driver = null;

	public static void main(String[] args) {
		String browser = "chrome";
		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else {
			System.out.println("please pass the correct browser name:" + browser);
		}

		// don't the type casting for firefox
		// set the property for firefox and download geckdriver for the firefox
		// the driver and browser version has to match all the time or else the browser
		// wonnt launch
		driver.get("https://mvnrepository.com/");
		String title = driver.getTitle();
		System.out.println("page title is:" + title);

	}

}
