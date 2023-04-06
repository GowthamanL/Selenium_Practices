package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\\\PRog\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/slider/");
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		 WebElement handle = driver.findElement(By.xpath("//*[@id='slider']/span")); 
		 WebElement slider = driver.findElement(By.id("slider"));
		 Actions actions = new Actions(driver); 
		 actions.dragAndDropBy(handle, 150, 0).build().perform();
		 String sliderValue = slider.getAttribute("value");
	      System.out.println("Slider value: " + sliderValue);

	}

}
