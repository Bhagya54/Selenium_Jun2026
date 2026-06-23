package WorkingWithWebElements_2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingRadioButtons {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.tizag.com/htmlT/htmlradio.php");
		WebElement block = driver.findElements(By.cssSelector("div.display")).get(0);
		
		List<WebElement> radio = block.findElements(By.name("food"));
		System.out.println(radio.size());//3
		radio.get(1).click();
		
	}
}
