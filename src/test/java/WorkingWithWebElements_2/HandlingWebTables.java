package WorkingWithWebElements_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWebTables {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/indices/nse/nifty-50");
		
		int noOfRows=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr")).size();
		int noOfCols=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td")).size();
		//
		
		for(int i=0;i<noOfRows;i++) {
			for(int j=0;j<noOfCols;j++) {
				WebElement ele= driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+(i+1)+"]/td["+(j+1)+"]"));
				System.out.print(ele.getText() + " ");
				if(ele.getText().equals("")) {
					System.out.println();
					break;
				}
				//System.out.println("hello");
			
			}
			System.out.println();
		}
	}

}
