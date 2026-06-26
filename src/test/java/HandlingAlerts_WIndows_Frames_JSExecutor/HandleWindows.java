package HandlingAlerts_WIndows_Frames_JSExecutor;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindows {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.redbus.com/");
		
		String parentWindow=driver.getWindowHandle();
		System.out.println("Parent Window:" + parentWindow);

		WebElement blogEle = driver.findElement(By.partialLinkText("Blog"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", blogEle);
		// driver.findElement(By.xpath("//button[text()='Try it']")).click();
		blogEle.click();
		
		Set<String> allWindow=driver.getWindowHandles();
		for(String window:allWindow) {
			System.out.println("Window: " + window);
			if(!window.equals(parentWindow)) {
				driver.switchTo().window(window);
				//Thread.sleep(3000);
				driver.findElement(By.xpath("//a[text()='About redBus']")).click();
				System.out.println(driver.getTitle());
			}
		}

	}

}
