package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsCase {
	String name="Kathir";
	@Test
	public void checkEqual() {
		
		
/*		if (name.equals("Kathir")) {
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}										*/
		
		
//		ONLY USED FOR "UNIT TESTING" FOR QUALITY ASSURANCE(QA) 
		
		Assert.assertEquals(name, "Kathir");
	}	

}
