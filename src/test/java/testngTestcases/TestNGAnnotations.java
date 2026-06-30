package testngTestcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {
	
	//@BeforeSuite
	//@AfterSuite
	//@BeforeTest
	//@AfterTest
	
	/*
	 * BeforeSuite
	 * BeforeTest
	 * BeforeClass
	 * BeforeMethod
	 * TC1
	 * AfterMethod
	 * BeforeMethod
	 * TC2
	 * AfterMethod
	 * AfterClass
	 * AfterTest
	 * AfterSuite
	 */
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Suite Started");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("afterSuite");
	}
	
	@BeforeTest
	public void BeforeTest() {
		System.out.println("BeforeTest");
	}
	
	@AfterTest
	public void AfterTest() {
		System.out.println("AfterTest");
	}
	@BeforeClass
	public void dbSetup() {
		System.out.println("DB Connection established");
	}
	
	@AfterClass
	public void closeDB() {
		System.out.println("DB disconnected");
	}
	@BeforeMethod
	public void openBrowser() {
		System.out.println("Opening the browser");
	}

	@AfterMethod
	public void closeBrowser() {
		System.out.println("Close the browser");
	}
	
	@Test(groups={"smoke"})
	public void doLogin() {
		System.out.println("Login Successful");
	}
	
	@Test(groups= {"sanity"})
	public void doUserReg() {
		System.out.println("Registration Successful");
	}
}
