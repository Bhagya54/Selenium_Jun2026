package WorkingWithWebElements_2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckboxes {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php");
		WebElement block = driver.findElement(By.xpath("(//div[@class='display'])[1]"));
		
		List<WebElement> checkboxes = block.findElements(By.name("sports"));
		System.out.println(checkboxes.size());//4
		
		for(WebElement ele:checkboxes) {
			if(ele.getAttribute("value").equals("baseball")) {
				ele.click();
			}
			
		}

	}

}
