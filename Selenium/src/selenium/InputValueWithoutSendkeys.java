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

public class InputValueWithoutSendkeys {

	public static void main(String[] args) throws AWTException {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.google.com/");
		
		WebElement box=driver.findElement(By.name("q"));
		
//		javaScriptExecutor method
		JavascriptExecutor execute=(JavascriptExecutor) driver;
//		execute.executeScript(arguement[0].value="Roger",box);
		execute.executeScript("document.getElementsByName('q')[0].value='Roger' "," ");
		box.clear();
		
		driver.navigate().refresh();
		
		
//		Using Robot Class
		
		driver.switchTo().activeElement();
		
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_R);
		robot.keyRelease(KeyEvent.VK_R);
		robot.keyPress(KeyEvent.VK_O);
		robot.keyRelease(KeyEvent.VK_O);
		robot.keyPress(KeyEvent.VK_G);
		robot.keyRelease(KeyEvent.VK_G);
		robot.keyPress(KeyEvent.VK_E);
		robot.keyRelease(KeyEvent.VK_E);
		robot.keyPress(KeyEvent.VK_R);
		robot.keyRelease(KeyEvent.VK_R);
		

	}

}
