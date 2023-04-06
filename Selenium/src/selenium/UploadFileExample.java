package selenium;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFileExample {

	public static void main(String[] args) throws  InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JarviZ\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/upload/");
		
//		WebElement iframe=driver.findElement(By.xpath("//*[@id=\'uploadframe\']"));
//		driver.switchTo().frame(iframe);
		
		WebElement upload=driver.findElement(By.xpath("//*[@id=\'file_wraper0\']"));
		upload.click();		
		
		StringSelection selection=new StringSelection("C:\\Users\\JarviZ\\sample.pdf");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,null);
		
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
