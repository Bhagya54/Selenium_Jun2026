package WorkingWithWebElements_2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingLinks {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.wikipedia.org/");
		WebElement block = driver.findElement(By.xpath("//nav[@class='other-projects']"));
		List<WebElement> allLinks = block.findElements(By.tagName("a"));
		System.out.println("No. of links:" + allLinks.size());
		
		for(int i=0;i<allLinks.size();i++) {
			System.out.println(allLinks.get(i).getAttribute("href"));
		}
		
		driver.close();
	}

}
