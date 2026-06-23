package mouse_keyboardActions_3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/resources/demos/resizable/default.html");
		WebElement sliderIcon=driver.findElement(By.xpath("//div[@id='resizable']/div[3]"));
		//WebElement slider=driver.findElement(By.id("slider"));
		Actions act = new Actions(driver);
		act.dragAndDropBy(sliderIcon,50,60).perform();
		//act.dragAndDropBy(sliderIcon,-200, 0).perform();

	}

}
