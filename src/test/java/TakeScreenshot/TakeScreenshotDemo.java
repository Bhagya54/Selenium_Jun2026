package TakeScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TakeScreenshotDemo {
	
	static void getFullPageSCreenshot(WebDriver driver) throws IOException {
		Date d= new Date();
		String fileName="FullPage_"+d.toString().replace(" ","_").replace(":","_")+".png";
		//System.out.println(fileName);
		
		
		File src=((FirefoxDriver)driver).getFullPageScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("./screenshots/"+fileName));
	}
	
	static void getPageScreenshot(WebDriver driver) throws IOException {
		Date d= new Date();
		String fileName=d.toString().replace(" ","_").replace(":","_")+".png";
		//System.out.println(fileName);
		
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("./screenshots/"+fileName));
	}
	
	static void getElementScreenshot(WebElement ele) throws IOException {
		Date d= new Date();
		String fileName="Element_"+d.toString().replace(" ","_").replace(":","_")+".png";
		//System.out.println(fileName);
		
		
		File src=((TakesScreenshot)ele).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("./screenshots/"+fileName));
	}

	public static void main(String[] args) throws IOException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.redbus.com/");
		getPageScreenshot(driver);
		
		getFullPageSCreenshot(driver);
		
		WebElement icon = driver.findElement(By.cssSelector("div.main-header.clearfix.rdc-main-header>a>img"));
		getElementScreenshot(icon);
		
		
		driver.get("https://google.com");
		getPageScreenshot(driver);
		

	}

}
