package mouse_keyboardActions_3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://deluxe-menu.com/popup-mode-sample.html");
		Actions act = new Actions(driver);
		WebElement ele=driver.findElement(By.xpath("//p[2]/img"));
		act.contextClick(ele).perform();
		act.moveToElement(driver.findElement(By.id("dm2m1i1it"))).perform();
		act.moveToElement(driver.findElement(By.id("dm2m2i1it"))).perform();
		act.click(driver.findElement(By.id("dm2m3i1it"))).perform();
	}

}
