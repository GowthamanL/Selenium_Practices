package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JarviZ\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/radio");
		
		WebElement anyOne=driver.findElement(By.id("yes"));
		anyOne.click();
		
		WebElement foo=driver.findElement(By.id("foo"));
		WebElement bar=driver.findElement(By.id("notfoo"));
		boolean select1=foo.isSelected();
		boolean select2=bar.isSelected();
		System.out.println(select1);
		System.out.println(select2);
		
		WebElement confirmdisable=driver.findElement(By.id("maybe"));
		boolean maybe=confirmdisable.isEnabled();
		System.out.println(maybe);
		
		
		WebElement checkBox1=driver.findElement(By.xpath("/html/body/app-root/app-radio-check/section[1]/div/div/div[1]/div/div/div[6]/label[2]/input"));
		boolean checkedBox=checkBox1.isSelected();
		System.out.println(checkedBox);
		if(checkBox1.isSelected())
		{
			checkBox1.click();
		}
		
		WebElement acceptCheckBox=driver.findElement(By.xpath("/html/body/app-root/app-radio-check/section[1]/div/div/div[1]/div/div/div[7]/label[2]/input"));
		acceptCheckBox.click();

	}

}
