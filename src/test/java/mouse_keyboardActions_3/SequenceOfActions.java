package mouse_keyboardActions_3;

import java.time.Duration;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SequenceOfActions {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		Actions act = new Actions(driver);
		WebElement ele = driver.findElement(By.name("email"));
		act.keyDown(ele,Keys.SHIFT).sendKeys("bhagya").keyUp(Keys.SHIFT)
		.doubleClick(ele).contextClick(ele).build().perform();

	}

}
