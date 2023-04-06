package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class UnderlinedOrNOT {

	public static void main(String[] args) {

		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.google.com/");
		
		WebElement tamil= driver.findElement(By.xpath("//*[@id=\'SIvCob\']/a[5]"));
		String beforeHovering=tamil.getCssValue("text-decoration");
		System.out.println("Before : "+beforeHovering );
		
		Actions action=new Actions(driver);
		action.moveToElement(tamil).build().perform();
		
		String afterHovering=tamil.getCssValue("text-decoration");
		System.out.println("After : "+afterHovering);

	}

}
