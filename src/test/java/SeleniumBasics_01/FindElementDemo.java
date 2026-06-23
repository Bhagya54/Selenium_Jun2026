package SeleniumBasics_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		
//		WebElement aboutEle=driver.findElement(By.linkText("About"));
//		aboutEle.click();
		
		driver.findElement(By.linkText("About")).click();
		
		if(driver.getTitle().contains("About Google")) {
			System.out.println("You have successfully navigated to About page");
		}
		//
		
	}

}
