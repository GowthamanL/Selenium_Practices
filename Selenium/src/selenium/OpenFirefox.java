package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","E:\\PRog\\geckodriver-v0.32.0-win32\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("www.google.com");
	}

}
