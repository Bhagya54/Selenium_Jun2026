package testngTestcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization_xml {

	WebDriver driver;
	@Parameters({"browserName","url"})
	@Test
	public void openWebSite(String bName,String testSiteUrl) {
		
		if(bName.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}
		else if(bName.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}
		else if(bName.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(testSiteUrl);
		
	}
	
	
}
