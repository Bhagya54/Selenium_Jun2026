package testngTestcases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DependsOn {
//Default priority = 0
	@Test(groups = {"smoke"})
	public void doopenBrowser() {
		System.out.println("Open Browser Successful");
		//Assert.fail("Intentional Failure");
	}
	
	
	@Test
	public void doUserReg() {
		System.out.println("Registration Successful");
		Assert.fail("Intentional Failure");
	}
	
	@Test(dependsOnMethods = {"doUserReg","doopenBrowser"} )
	public void doLogin() {
		System.out.println("Login Successful");
	}
}
