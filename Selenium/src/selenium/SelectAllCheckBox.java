package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SelectAllCheckBox {

	public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://demo.automationtesting.in/Register.html");
		
//		XPATH is the KEY for this operation
		
		List<WebElement> boxes=driver.findElements(By.xpath("//*[@type='checkbox']"));
		for (WebElement box : boxes) {
			box.click();
		}

	}

}
