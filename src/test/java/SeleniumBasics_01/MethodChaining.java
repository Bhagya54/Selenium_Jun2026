package SeleniumBasics_01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodChaining {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		
//		Options option = driver.manage();
//		Window win = option.window();
//		win.maximize();
		
		String str = "hello world";
		String newValue=str.replace("e","2").toUpperCase();
		System.out.println(newValue);
		
				
		
	}

}
