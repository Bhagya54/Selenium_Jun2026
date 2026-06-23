package mouse_keyboardActions_3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
		WebElement src = driver.findElement(By.id("draggable"));
		WebElement dest = driver.findElement(By.id("droppable"));
		Actions act=new Actions(driver);
		act.dragAndDrop(src, dest).perform();
		
		WebElement result = driver.findElement(By.xpath("//div[@id='droppable']/p"));
		if(result.getText().equals("Dropped!")) {
			System.out.println("Pass");
		}
		
	}

}
