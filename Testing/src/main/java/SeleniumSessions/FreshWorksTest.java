package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FreshWorksTest {
	public static void main(String[] args) {
		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.init_driver("chrome");
		br.launchUrl("https://www.freshworks.com");
		String title = br.getPageTitle();
		System.out.println(title);

		By header = By.tagName("h1");
		By platform_link = By.linkText("platform");
		By getStarted_button = By.xpath("get absolute xpath");
		By header_h2 = By.tagName("h2");
		By contactUs_link = By.linkText("Contact us");

		ElementUtil ele = new ElementUtil(driver);

		String headerText = ele.doGetText(header);
		System.out.println(headerText);
		System.out.println(ele.doGetText(platform_link));
		System.out.println(ele.doGetText(header_h2));
		System.out.println(ele.doGetText(contactUs_link));
		System.out.println(ele.doGetText(getStarted_button));
		System.out.println(br.getPageTitle());
		br.closeBrowser();

	}
}
