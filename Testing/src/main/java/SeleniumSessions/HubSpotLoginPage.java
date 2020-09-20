package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HubSpotLoginPage {

	public static void main(String[] args) throws InterruptedException {
		By username = By.id("username");
		By pwd = By.id("password");

		By loginBtn = By.id("loginBtn");
		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.init_driver("chrome");

		br.launchUrl("http://");
		Thread.sleep(5000);

		System.out.println(br.getPageTitle());
		ElementUtil ele = new ElementUtil(driver);
		ele.doSendKeys(username, "send email id");
		ele.doSendKeys(pwd, "passowrd");
		ele.doClick(loginBtn);
		br.closeBrowser();

	}

}
