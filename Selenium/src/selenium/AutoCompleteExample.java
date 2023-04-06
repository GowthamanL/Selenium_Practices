package selenium;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompleteExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\PRog\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/autocomplete/");
		
		WebElement iframe=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/iframe"));
		driver.switchTo().frame(iframe);
		
		WebElement autoComplete=driver.findElement(By.xpath("//*[@id=\'tags\']"));
		autoComplete.sendKeys("s");
		Thread.sleep(3000);
		List<WebElement> optionsList=driver.findElements(By.xpath("//*[@id=\'ui-id-1\']/li"));
		for (WebElement indvidualOptions : optionsList) {
		
			if (indvidualOptions.getText().equals("Lisp")) {
				indvidualOptions.click();
				String selectedOps=indvidualOptions.getText();
				System.out.println("Selecting : "+selectedOps);
				break;
			}
		}
		
		

	}

}
