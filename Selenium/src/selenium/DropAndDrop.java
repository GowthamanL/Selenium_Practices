package selenium;

import org.openqa.selenium.By;
//import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\JarviZ\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/dropable");
		
		WebElement draggable=driver.findElement(By.xpath("/html/body/app-root/app-dropable/section[1]/div/div/div[1]/div/div/div[1]/div/div[1]/div"));
		WebElement droppable=driver.findElement(By.xpath("/html/body/app-root/app-dropable/section[1]/div/div/div[1]/div/div/div[1]/div/div[2]/div"));
		
		//Point dropBoxLoc=droppable.getLocation();
		//int xValue=dropBoxLoc.getX();
		//int yValue=dropBoxLoc.getY();
		
		Actions actions=new Actions(driver);
		//actions.clickAndHold(draggable).moveToElement(droppable).release().build().perform();
		actions.dragAndDrop(draggable, droppable).build().perform();
	}

}
