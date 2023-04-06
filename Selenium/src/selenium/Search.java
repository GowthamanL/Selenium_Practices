package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//setting the path of the gecko driver executable
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JarviZ\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
		//Launch the firefox browser
		WebDriver driver = new ChromeDriver();
		//Enter the url
		driver.get("http://www.google.com");
		//Get the title of the google page and print it on the console
		String title = driver.getTitle();
		System.out.println("the title of the page is :"+ title);
		//Get the URL of the google page and print it on the console
		String currentUrl = driver.getCurrentUrl();
		System.out.println("the URL of the page is :"+ currentUrl);
		//Get the source code of the google page and print it on the console
		//String pageSource = driver.getPageSource();
		//System.out.println("the source code of the page is :"+ pageSource);
		driver.close();
		
	}

}
