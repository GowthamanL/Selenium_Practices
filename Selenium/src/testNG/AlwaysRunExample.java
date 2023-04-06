package testNG;

import org.testng.annotations.Test;

public class AlwaysRunExample {

	@Test(timeOut=2000)
	public void parentPermission() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("Granted");
	}
	
	@Test(dependsOnMethods="parentPermission",alwaysRun=true)
	public void goingToVacation() {
		System.out.println("Gone");
	}
	
}
