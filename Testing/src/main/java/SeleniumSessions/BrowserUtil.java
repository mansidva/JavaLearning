package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {
	WebDriver driver;
/**
 * This method is used to launch the browser
 * @param browser
 * @return this return a driver
 * 
 */
	public WebDriver init_driver(String browser) {
		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		} else {
			System.out.println("Please pass the correct browser" + browser);
		}
		return driver;
	}
	/**
	 * this is used to launch the url
	 * @param url
	 */
public void launchUrl(String url) {
	driver.get(url);
}
/**
 * this is used to get the title of the page
 * @return
 */
public String getPageTitle() {
return 	driver.getTitle();
}
	
	public String getCurrentPageUrl() {
		return driver.getCurrentUrl();
	}
	public void quitBrowser() {
		driver.quit();
	}
	public void closeBrowser() {
		driver.close();
	}

}
