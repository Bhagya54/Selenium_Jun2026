package mouse_keyboardActions_3;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseOver_Mouse {

	public static void main(String[] args) {
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2); 
		prefs.put("translate_allow_in_model", false);
        prefs.put("translate", "{'enabled': false}");
        
        ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.carwale.com/");
		Actions act  =  new Actions(driver);
		WebElement newCar=driver.findElement(By.xpath("//div[text()='NEW CARS']"));
		act.moveToElement(newCar).perform();
		
		driver.findElement(By.xpath("//div[text()='Find New Cars']")).click();
		if(driver.getCurrentUrl().contains("new-cars/")) {
			System.out.println("Pass! Successfully navigated to new cars page");
		}
		
	}

}
