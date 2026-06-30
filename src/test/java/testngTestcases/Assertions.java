package testngTestcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assertions {

	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test(groups = {"smoke","sanity"})
	public void verifyTitle() {
		driver.get("https://facebook.com");
		String actualTitle=driver.getTitle();//Facebook
		String expectedTitle="Facebook";
		
		Assert.assertEquals(actualTitle, expectedTitle);
		Assert.assertTrue(actualTitle.equals(expectedTitle), "Titles are not matching");
		//Assert.assertFalse(actualTitle.equals(expectedTitle), "Titles are matching");
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
}
