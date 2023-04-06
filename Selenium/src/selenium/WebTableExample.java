package selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableExample {

	public static void main(String[] args) {

	/*	System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\JarviZ\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");*/
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/table");

		WebElement shoppingTable = driver.findElement(By.xpath("//table[@id='shopping']"));
		
		List<WebElement> headers = shoppingTable.findElements(By.tagName("th"));
		int columnSize=headers.size();
		System.out.println("Total Columns : "+columnSize);
		
		List<WebElement> allRows=shoppingTable.findElements(By.xpath("//table[@id='shopping']/tbody/tr/td[1]"));
		int rowSize=allRows.size();
		System.out.println("Total Rows : "+rowSize);
		
		for (WebElement header : headers) 
		{
			String headerTitle=header.getText();
			System.out.println(headerTitle);
		}
		
		for (WebElement row : allRows)
		{
			String rowsTitles=row.getText();
			System.out.println(rowsTitles);			
		}
		List<WebElement> itemsPrice=shoppingTable.findElements(By.xpath("//table[@id='shopping']/tbody/tr/td[2]"));
		
		//For Storing the wrote price Elements
		
		List<Integer> priceList= new ArrayList<Integer>();
		
		for (WebElement price : itemsPrice)
		{	
			String individualPrice=price.getText();
			priceList.add(Integer.parseInt(individualPrice));	
		}
		System.out.println(priceList);
		
		
		int sum=0;
		for (int i = 0; i < priceList.size(); i++)
		{
			sum+=priceList.get(i);
		}
		System.out.println(sum);
		
		WebElement total=driver.findElement(By.xpath("//table[@id='shopping']//td/b"));
		String totalValue=total.getText();
	    int totalAsInteger=Integer.valueOf(totalValue);
		//System.out.println(totalAsInteger);
		
		if (sum==totalAsInteger)
		{
		System.out.println("Total is Equal");	
		} else {
			System.out.println("Total is Not Equal");
		}
		
		WebElement secondTable=driver.findElement(By.id("simpletable"));
		List<WebElement> allRows1=secondTable.findElements(By.cssSelector("tbody tr"));
		int sTRowSize=allRows1.size();
		System.out.println(sTRowSize);
		
		for (int i = 0; i < sTRowSize; i++)
		{
			List<WebElement> rowsOnly=allRows1.get(i).findElements(By.tagName("td"));
			WebElement lastName=rowsOnly.get(1);
			String text=lastName.getText();
			System.out.println(text);
			
			if (text.equals("Man"))
			{
				WebElement input=rowsOnly.get(3).findElement(By.xpath("input"));
				input.click();
			}
		}
		
		
		
		
		
		
		
		
		//driver.quit();
	}

}
