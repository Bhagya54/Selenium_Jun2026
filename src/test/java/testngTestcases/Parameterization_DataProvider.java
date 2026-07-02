package testngTestcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utility.ExcelReader;

public class Parameterization_DataProvider {
	
	WebDriver driver;
	
	
	@BeforeMethod
	public void launchBrowser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://facebook.com");
	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
	
	@Test(dataProvider = "dp")
	public void doLogin(String uname,String password) {
		driver.findElement(By.name("email")).sendKeys(uname);
		driver.findElement(By.name("pass")).sendKeys(password);
	}
	
	@DataProvider(name="dp")
	public Object[][] getData(){
		
		ExcelReader excel = new ExcelReader("./src/test/resources/excelData/TestData.xlsx");
		String sheetName="data";
		int noOfRows=excel.getRowCount(sheetName);
		int noOfCols=excel.getColumnCount(sheetName);
		System.out.println("RowCount: " + noOfRows);//4
		System.out.println("Col Count: " + noOfCols);//2
		Object[][] data = new Object[noOfRows-1][noOfCols];
		
		for(int row=2;row<=noOfRows;row++) {//row=3
			for(int col=0;col<noOfCols;col++) {//col=0
				data[row-2][col]=excel.getCellData(sheetName,col,row);
			}
		}
		
//		data[0][0]=excel.getCellData(sheetName,0,2);
//		data[0][1]=excel.getCellData(sheetName,1,2);
//				
//		data[1][0]=excel.getCellData(sheetName,0,3);
//		data[1][1]=excel.getCellData(sheetName,1,3);
//		
//		data[2][0]=excel.getCellData(sheetName,0,4);
//		data[2][1]=excel.getCellData(sheetName,1,4);
		
		return data;
	}
	
	
}
