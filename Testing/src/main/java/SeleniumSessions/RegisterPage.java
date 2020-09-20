package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RegisterPage {
	static WebDriver driver = null;
	WebDriverWait wait = null;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		driver.findElement(By.name("FirstName")).sendKeys("Mansi");
		driver.findElement(By.name("LastName")).sendKeys("D");
		driver.findElement(By.name("Email")).sendKeys("143vmis@gmail.com");

	}
	public static void getElement(By locator) {
		
		
	}

}
