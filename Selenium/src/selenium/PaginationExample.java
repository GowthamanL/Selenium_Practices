package selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PaginationExample {

	public static void main(String[] args) {

		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://mdbootstrap.com/docs/b4/jquery/tables/pagination/");

		List<String> nameList=new ArrayList<String>();

		int sizeOfPG=driver.findElements(By.xpath("//*[@id='dtBasicExample_paginate']//a")).size();
		System.out.println(sizeOfPG);

		if (sizeOfPG>0){
			do{
				List<WebElement> names=driver.findElements(By.xpath("//td[@class='sorting_1']"));
				for (WebElement name: names) {
					nameList.add(name.getText());
				}
				WebElement nextButt=driver.findElement(By.id("dtBasicExample_next"));
				String nxtClassName=nextButt.getAttribute("class");
				if(!nxtClassName.contains("disabled")) {
					nextButt.click();
				}else {
					break;
				}
			}
			while (true);	
		}else{
			System.out.println("NO Pagination");
		}
		for (String name1 : nameList){
			System.out.println(name1);	
		}
	}

}
