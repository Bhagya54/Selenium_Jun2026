package SeleniumBasics_01;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

		Thread.sleep(2000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("pencil");
		
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		Thread.sleep(2000);
		//tagName[contains(text(), 'substring')]
		
		WebElement ele=driver.findElement(By.partialLinkText("Doms Black Dooms Karbon"));
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ele);
	
		ele.click();
		//driver.findElement(By.xpath("//img[contains(@alt,'Kokuyo Enpitsu ')])")).click();
		



	}

}
