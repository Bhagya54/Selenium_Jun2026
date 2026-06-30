package testngTestcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Parameterization_DataProvider {
	
	WebDriver driver;
	
	
	@BeforeMethod
	public void launchBrowser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://facebook.com");
	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
	
	@Test(dataProvider = "dp")
	public void doLogin(String uname,String password) {
		driver.findElement(By.name("email")).sendKeys(uname);
		driver.findElement(By.name("pass")).sendKeys(password);
	}
	
	@DataProvider(name="dp")
	public Object[][] getData(){
		Object[][] data = new Object[3][2];
		data[0][0]="username1";
		data[0][1]="password1";
				
		data[1][0]="username2";
		data[1][1]="password2";
		
		data[2][0]="username3";
		data[2][1]="password3";
		
		return data;
	}
	
	
}
