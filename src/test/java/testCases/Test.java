package testCases;

import org.testng.annotations.BeforeTest;

public class Test {
	
	@BeforeTest
	
	public void car() {
		System.out.println("bTest"); 
		
		
	}

	@org.testng.annotations.Test
	public void car2() {
		System.out.println("Test"); 
		
		
	}
@BeforeTest
	
	public void car1() {
		System.out.println("aTest"); 
		
		
	}

}
