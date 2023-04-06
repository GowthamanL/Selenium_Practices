package selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWaits {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("www.google.com");
		
//		DON'T USE BOTH WAITS IN SINGLE PROGRAM, IT CONSUMES TIME
		
		
		
		WebElement bar=driver.findElement(By.id("q"));
		
		/*WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(3000));
		wait.until(ExpectedConditions.elementToBeClickable(bar));*/
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		/*FluentWait<WebDriver> wait=new FluentWait<>(driver).withTimeout(Duration.ofSeconds(30))
											.pollingEvery(Duration.ofSeconds(3))
											.ignoring(Exception.class);
		WebElement bar=wait.until(new Function<WebDriver, WebElement>() {
			
			@Override
			public WebElement apply(WebDriver driver) {
				
				return driver.findElement(By.id("q"));
			}
		});			*/
		
		
		bar.sendKeys("Java"+Keys.ENTER);
		
		
		
		

	}

}
