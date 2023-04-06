package selenium;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver","C:\\Users\\JarviZ\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/test");

		WebElement inputTab=driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[2]/div/div/div/div[1]/app-menu/div/footer/a"));
		inputTab.click();

		//Edit 

		WebElement fullName=driver.findElement(By.id("fullName"));
		fullName.sendKeys("Gowthaman");

		WebElement appendText=driver.findElement(By.id("join"));
		appendText.sendKeys("and Healthy");

		WebElement getText=driver.findElement(By.id("getMe"));
		String copiedtext=getText.getAttribute("value");
		System.out.println(copiedtext);

		WebElement clearText=driver.findElement(By.id("clearMe"));
		clearText.clear();

		WebElement checkDisabledOrNot=driver.findElement(By.id("noEdit"));
		boolean check=checkDisabledOrNot.isEnabled();
		System.out.println(check);

		driver.navigate().back();

		WebElement buttonOperations=driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[2]/div/div/div/div[2]/app-menu/div/footer/a"));
		buttonOperations.click();

		//Buttons

		WebElement findButtonSize=driver.findElement(By.id("position"));
		org.openqa.selenium.Point xypoint=findButtonSize.getLocation();
		int xPoint=xypoint.getX();
		int yPoint=xypoint.getY();
		System.out.println("point X:"+xPoint+"Point Y:"+yPoint);

		WebElement findColor=driver.findElement(By.id("color"));
		String bgColor=findColor.getCssValue("background-color");
		System.out.println("BG color is:"+bgColor);

		WebElement findTallandFat=driver.findElement(By.id("property"));
		int height=findTallandFat.getSize().getHeight();
		int width=findTallandFat.getSize().getWidth();
		System.out.println("Tall:"+height+"Fat:"+width);

		WebElement disableCheck=driver.findElement(By.id("isDisabled"));
		boolean disabledOrNot=disableCheck.isEnabled();
		System.out.println(disabledOrNot);

		WebElement homeButton=driver.findElement(By.id("home"));
		homeButton.click();


		WebElement exploreWorkspace=driver.findElement(By.xpath("/html/body/app-root/app-main/section[2]/div[1]/div[1]/div[1]/div/div/a"));
		exploreWorkspace.click();

		//DropDown

		WebElement dropDown=driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[2]/div/div/div/div[3]/app-menu/div/footer/a"));
		dropDown.click();

		WebElement selectFruit=driver.findElement(By.id("fruits"));
		Select anyoneFruit=new Select(selectFruit);
		anyoneFruit.selectByIndex(1);

		WebElement multipleHeros=driver.findElement(By.id("superheros"));
		Select chooseMultiple=new Select(multipleHeros);
		chooseMultiple.selectByIndex(1);
		chooseMultiple.selectByValue("bw");
		chooseMultiple.selectByVisibleText("Elektra");
		chooseMultiple.deselectAll();

		WebElement proLang=driver.findElement(By.id("lang"));
		Select lastLang=new Select(proLang);
		lastLang.selectByValue("sharp");
		WebElement langName=lastLang.getFirstSelectedOption();
		String options=langName.getText();
		System.out.println(options);

		WebElement selectCountry=driver.findElement(By.id("country"));
		Select totalOptions=new Select(selectCountry);
		totalOptions.selectByIndex(5);
		
		List<WebElement> allOptions=totalOptions.getOptions();
		for (WebElement printalloptions : allOptions)
		{
			System.out.println(printalloptions.getText());	
		}

		driver.navigate().back();

		WebElement radioButtons=driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[3]/div/div/div/div[2]/app-menu/div/footer/a"));
		radioButtons.click();

		//RadioButton

		WebElement selectYes=driver.findElement(By.id("yes"));
		selectYes.click();

		WebElement food=driver.findElement(By.id("foo"));
		WebElement bar=driver.findElement(By.id("notfoo"));
		//boolean fooSelected=food.isSelected();
		//boolean barSelected=bar.isSelected();
		if (food.isSelected()) {
			System.out.println("Food is Selected");

		} else {
			System.out.println("Food is Not Selected");

		}
		if (bar.isSelected()) {
			System.out.println("Bar is Selected");
		}
		else {
			System.out.println("Bar is Not Selected");
		}


		WebElement mayBe=driver.findElement(By.id("maybe"));
		if (mayBe.isEnabled()) {
			System.out.println("Button is Enabled");
		} else {
			System.out.println("Button is Disabled");
		}

		WebElement checkBoxCheck=driver.findElement(By.xpath("/html/body/app-root/app-radio-check/section[1]/div/div/div[1]/div/div/div[6]/label[2]/input"));
		if (checkBoxCheck.isSelected()) {
			System.out.println("Check box is Selected");

		}
		else {
			System.out.println("CheckBox is Not Selected");
		}

		WebElement acceptCheckbox=driver.findElement(By.xpath("/html/body/app-root/app-radio-check/section[1]/div/div/div[1]/div/div/div[7]/label[2]/input"));
		acceptCheckbox.click();


		driver.navigate().back();

		WebElement alert=driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[2]/div/div/div/div[4]/app-menu/div/footer/a"));
		alert.click();

		//Alert

		WebElement acceptAlert=driver.findElement(By.id("accept"));
		acceptAlert.click();
		Alert pressOk=driver.switchTo().alert();
		pressOk.accept();

		WebElement confirmAlert=driver.findElement(By.id("confirm"));
		confirmAlert.click();
		Alert cancelAlert=driver.switchTo().alert();
		cancelAlert.dismiss();

		WebElement promptAlert=driver.findElement(By.id("prompt"));
		promptAlert.click();
		Alert typeName=driver.switchTo().alert();
		typeName.sendKeys("Gowtham");
		typeName.accept();

		driver.navigate().back();

		//WindowsHandling

		WebElement windowsButton=driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[3]/div/div/div/div[3]/app-menu/div/footer/a"));
		windowsButton.click();

		String primaryWindow=driver.getWindowHandle();

		WebElement openHomePageWindow=driver.findElement(By.id("home"));
		openHomePageWindow.click();

		Set<String> allWindowHandles=driver.getWindowHandles();
		for (String newWindowsOnly : allWindowHandles)
		{
			driver.switchTo().window(newWindowsOnly);
		}

		WebElement findingEditBox=driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[2]/div/div/div/div[1]/app-menu/div/footer/a"));
		findingEditBox.click();
		driver.close();

		driver.switchTo().window(primaryWindow);

		WebElement  multiWindowsTab= driver.findElement(By.id("multi"));
		multiWindowsTab.click();

		int openedWindowCount=driver.getWindowHandles().size();
		System.out.println("Opened Windows Count= "+openedWindowCount);

		Set<String> allWindowsInMultiWindows=driver.getWindowHandles();
		for (String everyWindows : allWindowsInMultiWindows) 
		{
			if (!everyWindows.equals(primaryWindow))
			{
				driver.switchTo().window(everyWindows);
				String tabUrl=driver.getCurrentUrl();
				System.out.println(tabUrl);
				driver.close();
			}
		}

		driver.switchTo().window(primaryWindow);

		driver.navigate().back();

		//Frame

		WebElement frameButton=driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[3]/div/div/div/div[1]/app-menu/div/footer/a"));
		frameButton.click();

		//WebElement frame1=driver.findElement(By.xpath("//*[@id=\'firstFr\']"));
		driver.switchTo().frame(0);
		WebElement firstName=driver.findElement(By.name("fname"));
		firstName.sendKeys("Gowtham");

		WebElement lastName=driver.findElement(By.name("lname"));
		lastName.sendKeys("Loganathan");

		driver.switchTo().frame(0);
		WebElement emailBox=driver.findElement(By.name("email"));
		emailBox.sendKeys("gowthamaneeemec@gmail.com");


		driver.switchTo().parentFrame();

		WebElement lName=driver.findElement(By.name("lname"));
		lName.clear();

		driver.switchTo().defaultContent();
		
		
		driver.navigate().back();
		
		//Tool Tip
		
		//WebElement toolTip=driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[6]/div/div/div/div[2]/app-menu/div/footer/a"));
		//toolTip.click();
		//WebElement phnNum=driver.findElement(By.id("phno"));
		//String Num=phnNum.getAttribute("title");
		//System.out.println(title);

		//Drag and Drop
		
		WebElement drop=driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[4]/div/div/div/div[2]/app-menu/div/footer/a"));
		drop.click();
		
		WebElement draggable=driver.findElement(By.xpath("/html/body/app-root/app-dropable/section[1]/div/div/div[1]/div/div/div[1]/div/div[1]/div"));
		WebElement droppable=driver.findElement(By.xpath("/html/body/app-root/app-dropable/section[1]/div/div/div[1]/div/div/div[1]/div/div[2]/div"));
		
		Actions actions=new Actions(driver);
		//actions.clickAndHold(draggable).moveToElement(droppable).release().build().perform();
		actions.dragAndDrop(draggable, droppable).build().perform();


		driver.navigate().back();
		
		//Selectable
		
		/*WebElement selectableButton=driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[4]/div/div/div/div[4]/app-menu/div/footer/a"));
		selectableButton.click();
		
		List<WebElement> multiSelect=driver.findElements(By.xpath("//*[@id=\'container\']/li"));
		int listSize=multiSelect.size();
		System.out.println(listSize);
		
		Actions actions1=new Actions(driver);
		actions1.keyDown(Keys.CONTROL).click(multiSelect.get(0)).click(multiSelect.get(1)).click(multiSelect.get(2)).build().perform();*/
		
		
		
		

























	}

}
