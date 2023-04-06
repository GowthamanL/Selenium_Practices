package testNG;

import org.testng.annotations.Test;

public class DependancyCase {
	
//	Qualification for Engineering
	
	@Test(priority=0,enabled=true)
	public void tenthStandard() {
		System.out.println("Ten'th Passed");
	}
	@Test(priority=1,dependsOnMethods="tenthStandard")
	public void higherSecondary() {
		System.out.println("Hss Passed");
	}
	@Test(priority=2,dependsOnMethods="higherSecondary")
	public void engineering() {
		System.out.println("Engineering Passed");
	}

}


// case cannot be Executed when depending case false