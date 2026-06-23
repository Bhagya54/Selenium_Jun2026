package mouse_keyboardActions_3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropBy {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/resources/demos/slider/default.html");
		WebElement sliderIcon=driver.findElement(By.cssSelector("div#slider>span"));
		WebElement slider=driver.findElement(By.id("slider"));
		Dimension dim=slider.getSize();
		int width = dim.getWidth();
		Actions act = new Actions(driver);
		act.dragAndDropBy(sliderIcon,width/2, 0).perform();
		act.dragAndDropBy(sliderIcon,-200, 0).perform();
		
		
	}

}
