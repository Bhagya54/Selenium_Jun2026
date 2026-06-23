package synchronization_4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronizationDemo {

	public static void main(String[] args) throws InterruptedException {
		//Thread.sleep(2000) - java - not idle
		//implicit wait - NoSuchElement  - Presence condition
		//explicit wait - clickInterceptable -
		
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("java@way2automation.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		//Thread.sleep(5000);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Passwd"))).sendKeys("abc12333");
		
		//driver.findElement(By.name("Passwd")).sendKeys("abc12333");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		//Thread.sleep(3000);
		
		WebElement errorMessage=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@jsname='B34EJ']/span")));
		//WebElement errorMessage=driver.findElement(By.xpath("//div[@jsname='B34EJ']/span"));
		System.out.println(errorMessage.getText());
	
	}

}
