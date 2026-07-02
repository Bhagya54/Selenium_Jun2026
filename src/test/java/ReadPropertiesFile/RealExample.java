package ReadPropertiesFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utility.ExcelReader;

public class RealExample {
	
WebDriver driver;
WebDriverWait wait;
FileInputStream fis;
Properties config=new Properties();
Properties or=new Properties();
	
	@BeforeMethod
	public void launchBrowser() throws IOException {
		fis=new FileInputStream("./src/test/resources/properties/config.properties");
		config.load(fis);
		
		if(config.getProperty("browser").equals("chrome")) {
			driver=new ChromeDriver();
		}
		else if(config.getProperty("browser").equals("firefox")) {
			driver=new FirefoxDriver();
		}
		else if(config.getProperty("browser").equals("edge")) {
			driver=new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.parseInt(config.getProperty("implicit.wait"))));
		wait =new WebDriverWait(driver, Duration.ofSeconds(Integer.parseInt(config.getProperty("explicit.wait"))));
		driver.get(config.getProperty("testsiteurl"));
		
		fis=new FileInputStream("./src/test/resources/properties/or.properties");
		or.load(fis);
		
	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

	@Test(dataProvider = "dp")
	public void doLogin(String username,String password) {
		driver.findElement(By.name(or.getProperty("email_NAME"))).sendKeys(username);
		driver.findElement(By.xpath(or.getProperty("pswd_XPATH"))).sendKeys(password);
		driver.findElement(By.cssSelector(or.getProperty("loginBtn_CSS")));
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
		
		return data;
	}
	
	
	
}
