package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JarviZ\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/frame");
		
		//WebElement frame1=driver.findElement(By.xpath("//*[@id=\'firstFr\']"));
		driver.switchTo().frame(0);
		WebElement firstName=driver.findElement(By.name("fname"));
		firstName.sendKeys("Gowtham");
		
		WebElement lastName=driver.findElement(By.name("lname"));
		lastName.sendKeys("Loganathan");
		
		driver.switchTo().frame(0);
		WebElement emailBox=driver.findElement(By.name("email"));
		emailBox.sendKeys("gowthamaneeemec@gmail.com");
		
		
		driver.switchTo().parentFrame();
		
		WebElement lName=driver.findElement(By.name("lname"));
		lName.clear();
		
		driver.switchTo().defaultContent();
	}

}
