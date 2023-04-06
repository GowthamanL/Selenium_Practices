package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkAndImage {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\\\PRog\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/broken_images");
		
		WebElement validImage=driver.findElement(By.xpath("//*[@id=\"content\"]/div/img[1]"));
		WebElement brokenImage=driver.findElement(By.xpath("//*[@id=\"content\"]/div/img[2]"));
		WebElement brokenImage1=driver.findElement(By.xpath("//*[@id=\"content\"]/div/img[3]"));
		
		if (brokenImage1.getAttribute("naturalWidth").equals("0")) {
			System.out.println("Image is Broken");
			
		}else {
			System.out.println("Valid Image");
		}
		if (brokenImage.getAttribute("naturalWidth").equals("0")) {
			System.out.println("Image is Broken");
		}else {
			System.out.println("Valid Image");
		}
		if (validImage.getAttribute("naturalWidth").equals("0")) {
			System.out.println("Image is Broken");
		}else {
			System.out.println("Valid Image");
		}
	}

}
