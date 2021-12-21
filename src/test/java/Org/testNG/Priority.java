package Org.testNG;

import org.testng.annotations.Test;

public class Priority {

	@Test (priority = -8)
	
	private void username() {

		System.out.println("username");
	}
	
	@Test (priority = 7)
	private void password() {
		System.out.println("password");
		
	} 
	
	@Test (invocationCount = 10)
	private void btnlogin() {
System.out.println("btnlogin");
	}
	
	@Test
	private void firstname() {
		System.out.println("firstname");
	}
	@Test
	private void lastname() {
System.out.println();
	}
	
}
