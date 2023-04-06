package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametrizationCase {
 
	@Test
	@Parameters("Name")
	public void printName(String user) {
		System.out.println("Name is "+user);
	}
	
}
