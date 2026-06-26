package HandlingAlerts_WIndows_Frames_JSExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ExecutingJSCode {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_submit_get");
	
	driver.switchTo().frame(0);
	WebElement tryitButton=driver.findElement(By.xpath("//button[text()='Try it']"));
	((JavascriptExecutor)driver).executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", tryitButton);
	
	
	
	//come out of the frame
	driver.switchTo().defaultContent();
	driver.findElement(By.cssSelector("div.trytopnav>div>a:nth-child(2)")).click();
	
	


}
}
