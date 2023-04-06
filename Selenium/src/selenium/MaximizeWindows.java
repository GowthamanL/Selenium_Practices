package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MaximizeWindows {

	public static void main(String[] args) {
		
		
		
//		maximize()		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
//		setSize()
		@SuppressWarnings("unused")
		WebDriver driver2=new ChromeDriver();
		org.openqa.selenium.Dimension windowSize= new org.openqa.selenium.Dimension(1366, 768);
		driver.manage().window().setSize(windowSize);
		
//		Chrome Options
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--start-maximized");
		@SuppressWarnings("unused")
		WebDriver driver1=new ChromeDriver(options);
		
		

	}

}
