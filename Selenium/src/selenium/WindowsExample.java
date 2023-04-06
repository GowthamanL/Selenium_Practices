package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\JarviZ\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/windows");
		
		String primaryWindow=driver.getWindowHandle();
		
		WebElement homeWindow=driver.findElement(By.id("home"));
		homeWindow.click();
		
		Set<String> allWindows=driver.getWindowHandles();
		for (String newWindow : allWindows) {
			
			driver.switchTo().window(newWindow);
			
		}
		WebElement editButtonBox=driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[2]/div/div/div/div[1]/app-menu/div/footer/a"));
		editButtonBox.click();
		driver.close();
		
		driver.switchTo().window(primaryWindow);
		
		WebElement multiHandleButton=driver.findElement(By.id("multi"));
		multiHandleButton.click();
		
		int numberOfWindows=driver.getWindowHandles().size();
		System.out.println("Opened Windows: "+numberOfWindows);
		
		Set<String> multiHandles=driver.getWindowHandles();
		for (String allHandles : multiHandles) 
		{
			if (!allHandles.equals(primaryWindow))
			{
				driver.switchTo().window(allHandles);
				driver.close();
			}
			
		}
	    driver.switchTo().window(primaryWindow);
	    
	    
	}

}
