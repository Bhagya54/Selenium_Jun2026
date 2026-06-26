package HandlingAlerts_WIndows_Frames_JSExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ExecutingJSCode_ScrollToView {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.redbus.com/");

		WebElement blogEle = driver.findElement(By.partialLinkText("Blog"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", blogEle);
		// driver.findElement(By.xpath("//button[text()='Try it']")).click();
		blogEle.click();

	}
}
