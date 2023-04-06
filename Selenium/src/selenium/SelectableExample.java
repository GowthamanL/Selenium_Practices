package selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class SelectableExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\\\PRog\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-elements/#Multiple%20Selection");
		
		WebElement iframe=driver.findElement(By.xpath("//*[@id=\'post-2649\']/div[2]/div/div/div[1]/p/iframe"));
		driver.switchTo().frame(iframe);
		
		//List<WebElement> categories=driver.findElements(By.xpath("//*[@id=\'post-2649\']/div[2]/div/ul/li"));
		//Actions selectCate=new Actions(driver);
	    //selectCate.click(categories.get(0));
	    
	    List<WebElement> items=driver.findElements(By.xpath("//*[@id=\'selectable\']/li"));
	    int listSize=items.size();
	    System.out.println(listSize);
	    Actions itemSelections=new Actions(driver);
	    itemSelections.keyDown(Keys.CONTROL).click(items.get(0)).click(items.get(2)).click(items.get(5)).build().perform();
	}

}
