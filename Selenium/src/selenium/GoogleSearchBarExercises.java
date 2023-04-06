package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleSearchBarExercises {

	public static void main(String[] args) throws InterruptedException {
		//		System.setProperty("webdriver.chrome.driver", "E:\\PRog\\chromedriver.exe");

		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");



		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Java Selenium program");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement suggestionBox = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.className("erkvQe")));
		List<WebElement> suggestions = suggestionBox.findElements(By.tagName("li"));

		//		PRINT ALL SUGGESTIONS

		for (WebElement suggestion : suggestions) {
			System.out.println(suggestion.getText());
		}

		//      PRINT SUGGESTION BY POSITION

		int position=0;
		for (WebElement suggestion1 : suggestions) {
			position++;
			if (position==3) {
				System.out.println(suggestion1.getText());
				//				suggestion1.click();
				break;
			}
		}

		//		CLICK USING 'contains' OR 'equals.to' OR 'equalsIgnoreCase'

		for (WebElement suggestion2 : suggestions) {
			String txt=suggestion2.getText();
			if(txt.contains("for")) {
				System.out.println(txt);
				//				suggestion2.click();
			}
		}

		//		GET ALL HYPERLINKS

		List<WebElement> linktags=driver.findElements(By.tagName("a"));
		for (int i = 0; i < linktags.size(); i++) {
			WebElement tag = linktags.get(i);
			String href=tag.getAttribute("href");
			System.out.println(href);


		}

	}


}

