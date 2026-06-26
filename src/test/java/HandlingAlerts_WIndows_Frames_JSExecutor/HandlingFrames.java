package HandlingAlerts_WIndows_Frames_JSExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_submit_get");
	//driver.switchTo().frame("iframeResult");//Using name or id
	//Using WebElement
	//	WebElement frameEle=driver.findElement(By.cssSelector("iframe#iframeResult"));
	//	driver.switchTo().frame(frameEle);
	
	
	
	//Using index
	driver.switchTo().frame(0);
	driver.findElement(By.xpath("//button[text()='Try it']")).click();
	
	//come out of the frame
	driver.switchTo().defaultContent();
	driver.findElement(By.cssSelector("div.trytopnav>div>a:nth-child(2)")).click();
	
	


}
}
