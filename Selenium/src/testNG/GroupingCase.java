package testNG;

import org.testng.annotations.Test;

public class GroupingCase {
	@Test(groups={"Apple"})
	public void apple1() {
		System.out.println("Apple1 Testing");
	}
	@Test(groups={"Apple"})
	public void apple2() {
		System.out.println("Apple2 Testing");
	}
	@Test(groups={"Moto"})
	public void moto1() {
		System.out.println("Moto1 Testing");
	}
	@Test(groups={"Moto"})
	public void moto2() {
		System.out.println("Moto2 Testing");
	}
	@Test(groups={"Vivo"})
	public void vivo1() {
		System.out.println("Vivo1 Testing");
	}
	@Test(groups={"Vivo"})
	public void vivo2() {
		System.out.println("Vivo2 Testing");
	}
	@Test(groups={"Lenovo"})
	public void lenovo1() {
		System.out.println("Lenovo1 Testing");
	}
	@Test(groups={"Lenovo"})
	public void lenovo2() {
		System.out.println("Lenovo2 Testing");
	}

}
