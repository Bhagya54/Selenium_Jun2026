package SeleniumBasics_01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumBasicCompatibility {

	public static void main(String[] args) {
		String browser = "edge";
		WebDriver driver=null;
		if(browser.equals("chrome")){
			driver = new ChromeDriver();
			
		}
		else if(browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		
		else if(browser.equals("edge")) {
			driver= new EdgeDriver();
		}
				
		driver.get("https://google.com");
		String expectedTitle="Google";
		
		String actualTitle=driver.getTitle();
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Title matches and test case is pass");
		}
		else {
			System.out.println("Title mismatch");
		}
		
		System.out.println("URL of the page: " + driver.getCurrentUrl());
		System.out.println("Page Source: " + driver.getPageSource());
		//driver.quit();
		//driver.close();

	}

}
