package testNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


//Listener should listen sampleTestcase.class,It should mentioned in xml file (Run from xml)


public class ListenersCase implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("start");
	    // not implemented
	  }

	 public void onTestSuccess(ITestResult result) {
		 System.out.println("success");
	    // not implemented
	  }
	 public void onTestFailure(ITestResult result) {
		 System.out.println("fail");
	    // not implemented
	  }

	 public void onTestSkipped(ITestResult result) {
		 System.out.println("skip");
	    // not implemented
	  }

	 public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		 System.out.println("failed within success%");
	    // not implemented
	  }
	 public void onTestFailedWithTimeout(ITestResult result) {
		 
		 System.out.println("failed");
	    onTestFailure(result);
	  }

	 public void onStart(ITestContext context) {
		 System.out.println("ON  start");
	    // not implemented
	  }

	 public void onFinish(ITestContext context) {
		 System.out.println("Finish");
	    // not implemented
	  }
}
