package WorkingWithWebElements_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxes {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("_R_1h6kqsqppb6amH1_")).sendKeys("testuser1@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("password123");
		driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[1]/div/div[3]/div/div/div/div[1]/div/span/span")).click();
//		WebElement errorMessageEle=driver.findElement(By.cssSelector("#_R_1hmkqsqppb6am_ > div > div.x9f619.x1n2onr6.x1ja2u2z.x78zum5.xdt5ytf.x2lah0s.x193iq5w.xeuugli.xamitd3.xyiysdx.x19se09i > span > span"));
//		String actualErrorMessage=errorMessageEle.getText();
//		if(actualErrorMessage.contains("password you've entered is incorrect")) {
//			System.out.println("Got the error message");
//		}
//		else {
//			System.out.println("Something Went Wrong");
//		}

		Thread.sleep(3000);
		if(driver.getCurrentUrl().contains("two_step_verification")) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
	}

}
