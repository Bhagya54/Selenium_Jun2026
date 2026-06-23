package WorkingWithWebElements_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.wikipedia.org/");
		WebElement dropDownEle = driver.findElement(By.id("searchLanguage"));
		Select dropDown = new Select(dropDownEle);
		
		dropDown.selectByValue("et");
		Thread.sleep(2000);
		//dropDown.selectByContainsVisibleText("Bahasa Indonesia");
		dropDown.selectByIndex(5);
		
		
		
	}

}
