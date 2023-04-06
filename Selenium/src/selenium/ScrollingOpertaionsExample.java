package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ScrollingOpertaionsExample {

	public static void main(String[] args) throws AWTException {

		/*1.Scroll using JavaScriptExecutor
		2.Scroll using Robot Class  */


		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://artoftesting.com/difference-between-assert-and-verify");

		JavascriptExecutor executor=(JavascriptExecutor) driver;
		//Scroll Down
		executor.executeScript("window.scroll(0,450)","");
		//Scroll UP
		executor.executeScript("window.scroll(0,-450)","");
		//Scroll To Bottom
		executor.executeScript("window.scrollTo(0,document.body.scrollHeight)","");
		//Scroll To Top
		executor.executeScript("window.scrollTo(0,0)","");

		//ROBOT Class
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_UP);
		robot.keyRelease(KeyEvent.VK_PAGE_UP);
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);


		//Scroll To Particular Element
		WebElement link=driver.findElement(By.xpath("//*[@id=\'post-786\']/div/div[2]/p[1]/a[2]")); 
		executor.executeScript("arguments[0].scrollIntoView(true);",link);








	}

}
