package HandlingAlerts_WIndows_Frames;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.cssSelector("div.tabpane.pullleft>ul>li:last-child>a")).click();
		driver.findElement(By.xpath("//button[contains(text(),'prompt box')]")).click();
		Alert al=driver.switchTo().alert();
		System.out.println("Alert Text: " + al.getText());
		String value="testing123";
		al.sendKeys(value);
		//Thread.sleep(2000);
		al.accept();
		
		String msg = driver.findElement(By.cssSelector("p#demo1")).getText();
		
		if(msg.contains(value)) {
			System.out.println("Pass");
		}
		

	}

}
