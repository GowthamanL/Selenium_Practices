package testNG;

import org.testng.annotations.Test;

public class PriorityCase {
	
	@Test(priority=0)
	public void startTheCar() {
		System.out.println("Start the Car");
	}

//	If test case don't want to tested 
	
	@Test(priority=1)
	public void playSomeMusic() {
		System.out.println("Start Music");
	}
	@Test(priority=2)
	public void putFristGear() {
		System.out.println("First Gear");
	}
	@Test(priority=3)
	public void putSecondGear() {
		System.out.println("Second Gear");
	}
	@Test(priority=4)
	public void putThridGear() {
		System.out.println("Third Gear");
	}
	@Test(priority=5)
	public void putFourthGear() {
		System.out.println("Fourth Gear");
	}
	
}
