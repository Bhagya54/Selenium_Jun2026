package testngTestcases;

import org.testng.annotations.Test;

public class Priority {
//Default priority = 0
	
	
	@Test(groups = {"smoke"})
	public void doUserReg() {
		System.out.println("Registration Successful");
	}
	
	@Test(priority= 0)
	public void doLogin() {
		System.out.println("Login Successful");
	}
}
