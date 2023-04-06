package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTestingCase {
	@Test
	public void openGoogle() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\JarviZ\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.quit();
	}
	@Test
	public void openBing() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\JarviZ\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bing.com");
		driver.quit();
	}
}
