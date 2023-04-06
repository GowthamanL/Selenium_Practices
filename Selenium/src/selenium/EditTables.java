package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\JarviZ\\\\Desktop\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/test");
		
		WebElement editPage = driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[2]/div/div/div/div[1]/app-menu/div/footer/a"));
		editPage.click();
		
		WebElement enterYourFullName = driver.findElement(By.id("fullName"));
		enterYourFullName.sendKeys("Gowthaman Loganathan"); 
		
		WebElement appendTheText = driver.findElement(By.id("join"));
		appendTheText.sendKeys("and healthy");
		
		WebElement getValue = driver.findElement(By.id("getMe"));
		String value = getValue.getAttribute("value");
		System.out.println(value);
		
		WebElement clearTheTextBox = driver.findElement(By.id("clearMe"));
		clearTheTextBox.clear();
		
		WebElement confirmBoxisDisabled = driver.findElement(By.xpath("//*[@id=\'noEdit\']"));
		Boolean Disabled = confirmBoxisDisabled.isEnabled();
		System.out.println(Disabled);
		
		//WebElement readonly = driver.findElement(By.id("dontwrite"));
		//String read = readonly.getAttribute("")
		 
	}

}
