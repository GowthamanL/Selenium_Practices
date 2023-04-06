package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\JarviZ\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/buttons");
		
		WebElement locatebutton = driver.findElement(By.id("position"));
		Point xypoint =  locatebutton.getLocation();
	    int xvalue=xypoint.getX();
	    int yvalue=xypoint.getY();
	    System.out.println("X value is : "+ xvalue + "Y value is : "+yvalue);
	    
	    WebElement getColorButton=driver.findElement(By.id("color"));
	    String color=getColorButton.getCssValue("background-color");
	    System.out.println("Color of the Button is : "+color);
	    
	    WebElement getsizebutton=driver.findElement(By.id("property"));
	    int tall =getsizebutton.getSize().getHeight();
	    int fat= getsizebutton.getSize().getWidth();
	    System.out.println("Height is : "+tall+"Width is : "+fat);
	    
	    WebElement homeButton=driver.findElement(By.id("home"));
	    homeButton.click();
	   
	    
		
		
		
	}

}
