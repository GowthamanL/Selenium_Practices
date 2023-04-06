package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserRefreshTypes {

	public static void main(String[] args) throws AWTException {
		

		WebDriver driver=new ChromeDriver();
		
//		if navigate() function is used
		driver.navigate().to("https://www.google.com/");
		driver.navigate().refresh();
		
//		If get() function used
		driver.get(driver.getCurrentUrl());
		
//		JavaScriptExcecutor
		JavascriptExecutor executor=(JavascriptExecutor) driver;
		executor.executeScript("location.reload()");
//						(OR)
		executor.executeScript("history.go(0)");
		
//		Robot Class
		Robot robo=new Robot();
		robo.keyPress(KeyEvent.VK_F5);
		robo.keyRelease(KeyEvent.VK_F5);

	}

}
