
package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

public class SearchBarENTERclickOperations {
	static WebElement q;

	public static void main(String[] args) throws AWTException {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.google.com/");
		
//		ENTER TEXT IN SEARCH BAR WITHOUT USING FIND ELEMENT
		
//		\n for submit
		driver.switchTo().activeElement().sendKeys("Java program \n");
		driver.navigate().back();
		WebElement box=driver.findElement(By.name("q"));
		box.sendKeys("java" + Keys.ENTER);
		
//		submit method
		driver.navigate().back();
		WebElement box1=driver.findElement(By.name("q"));
		box1.sendKeys("java");
		box1.submit();
		driver.navigate().back();
		
//		Robot class
		WebElement box2=driver.findElement(By.name("q"));
		box2.sendKeys("java");
		Robot robo=new Robot();
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		driver.navigate().back();
		
//		TEXT WITHOUT USING FINDELEMENTS
//		1.Declare webelement 'q' as a global variable
//		2.then us pagefactory 
		
		PageFactory.initElements(driver, SearchBarENTERclickOperations.class);
		q.sendKeys("java \n");
		
		
		
		
		
		
		

	}

}
