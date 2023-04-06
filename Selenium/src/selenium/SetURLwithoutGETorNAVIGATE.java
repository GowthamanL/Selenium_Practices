package selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SetURLwithoutGETorNAVIGATE {

	public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		String url="https://www.google.com/";
		JavascriptExecutor execute=(JavascriptExecutor) driver;
		execute.executeScript("window.location=\'"+url+"\'");

	}

}
