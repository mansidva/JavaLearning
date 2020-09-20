package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadLessBrowser {
	public static void main(String[] args) {

		// no browser is launched
		// testing happening in background
		// slightly faster
		//sightly used may be for headless browser
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions co =new ChromeOptions();//created an object of chrome options to launch headlessbrowser
		co.addArguments("--headless");//all lowercase 
		
		WebDriver driver = new ChromeDriver(co);//constructor with param

		driver.get("http://www.amazon.com");
		System.out.println(driver.getTitle());
		driver.quit();

		
	}

}
