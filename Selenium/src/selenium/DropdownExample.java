package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\JarviZ\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/dropdowns");
		
		WebElement fruit=driver.findElement(By.id("fruits"));
		Select selecting = new Select(fruit);
		selecting.selectByIndex(2);

		WebElement superheroes = driver.findElement(By.id("superheros"));
		Select multiple = new Select(superheroes);
		multiple.selectByIndex(6);
		multiple.selectByValue("aq");
		multiple.deselectByVisibleText("Batman");
		
		WebElement language = driver.findElement(By.id("lang"));
		Select prolang = new Select(language);
		prolang.selectByIndex(4);
		
		List<WebElement> opt= prolang.getOptions();
		int allopt = opt.size();
		System.out.println("numberof options: "+allopt);
		
		WebElement country = driver.findElement(By.id("country"));
		Select myCountry = new Select(country);
		myCountry.selectByVisibleText("India");
		
		
		
		
		driver.quit();
	}

}
