package selenium;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class TakesScreenshot {
	@Test
	public static void main(String[] args) throws IOException, AWTException {

//		WebDriver driver=new ChromeDriver();

		/*   1.Select TAKESSCREENSHOT As Interface. It takes partial Screenshot only

		org.openqa.selenium.TakesScreenshot screenShot=(org.openqa.selenium.TakesScreenshot) driver;
		File sourceFile = screenShot.getScreenshotAs(OutputType.FILE);
		File destinationFile=new File("D://img.png");
		FileHandler.copy(sourceFile, destinationFile);*/

		/*   2.Take ScreenShot using Robot Class. By using robot class we can take full page screenshot

		Robot robot=new Robot();
		Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rect=new Rectangle(screenSize);
		BufferedImage sourceFile1=robot.createScreenCapture(rect);
		File destinationFile1=new File("D://img1.png");
		ImageIO.write(sourceFile1, "png", destinationFile1);
		*/
		
		BufferedImage robot=new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
		ImageIO.write(robot, "png", new File("D://img3.png"));
		
		




	}
}
