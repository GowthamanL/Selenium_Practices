package testNG;

import org.testng.annotations.Test;

public class ExecuteTESTmultipleTimes {
	@Test(invocationCount=3)
	public void testCase() {
		System.out.println("Roger");
	}

}
