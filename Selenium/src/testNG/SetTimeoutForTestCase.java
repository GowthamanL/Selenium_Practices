package testNG;

import org.testng.annotations.Test;

public class SetTimeoutForTestCase {

	@Test(timeOut=2000)
	public void testCase() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("Roger");
	}
	
//	SomeTimes it throws ArrayIndexOutOFBoundException
	
}
