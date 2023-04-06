package selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFileExample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\JarviZ\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/file");

		WebElement xls=driver.findElement(By.id("xls"));
		xls.click();
		/*WebElement pdf=driver.findElement(By.id("pdf"));
		pdf.click();
		WebElement text=driver.findElement(By.id("txt"));
		text.click();*/

		File fileLocation=new File("C:\\Users\\JarviZ\\Downloads");
		File[] allFiles=fileLocation.listFiles();
		for (File singleFile : allFiles) {
			String fileName=singleFile.getName();
			if (fileName.equals("sample.xlsx")) {
				System.out.println("Excel file is downloaded");
				break;
			}
			else{
				System.out.println("File is Not in Downloads");
			}
		 }  

	}

}
