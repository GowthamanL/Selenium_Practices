package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAuthenticationPopUp {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
//		It only used for authentication POPUP		
		
		driver.get("https://Username:Password@example.com");

	}

}
