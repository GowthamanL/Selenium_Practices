package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BeforeAndAfterSuiteCase {
	
	long startTime;
	WebDriver driver;
	long endTime;
	
	@BeforeSuite
	public void openBrowser() {
		startTime=System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\JarviZ\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	@Test
	public void openGoogle() {
		driver.get("https://www.google.com");
	}
	
	@Test
	public void openBing() {
		driver.get("https://www.bing.com");
	}

	@AfterSuite
	public void closeBrowser() {
		driver.quit();
		endTime=System.currentTimeMillis();
		long totalTime=endTime-startTime;
		System.out.println(totalTime);

	}

}
