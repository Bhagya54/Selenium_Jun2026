package WorkingWithWebElements_2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDropdown2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.wikipedia.org/");
		WebElement dropDownEle = driver.findElement(By.id("searchLanguage"));
		
		List<WebElement> dropDownOptions=dropDownEle.findElements(By.tagName("option"));
		System.out.println("No of option: " + dropDownOptions.size());
		
		for(WebElement ele:dropDownOptions) {
			System.out.println("Value:" + ele.getAttribute("value"));
		}
		
		
	}

}
