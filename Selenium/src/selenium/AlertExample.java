package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\JarviZ\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/alert");
		
		WebElement alertBox=driver.findElement(By.id("accept"));
		alertBox.click();
		Alert pressOk=driver.switchTo().alert();
		pressOk.accept();
		
		WebElement cancelAlert=driver.findElement(By.id("confirm"));
		cancelAlert.click();
		Alert cancel=driver.switchTo().alert();
		cancel.dismiss();
		
		WebElement promptAlert = driver.findElement(By.id("prompt"));
		promptAlert.click();
		Alert typeBox=driver.switchTo().alert();
		typeBox.sendKeys("Gowtham");
		typeBox.accept();
		
		

	}

}
