package ReadExcel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public static void main(String[] args) throws IOException {
		/*
		 * XSSFWorkbook - workbook location
		 * XSSFSheet
		 */
		XSSFWorkbook wb = new XSSFWorkbook("./src/test/resources/excelData/TestData.xlsx");
		XSSFSheet sheet = wb.getSheet("data");
		int noOfRows=sheet.getPhysicalNumberOfRows();
		int noOfCols=sheet.getRow(0).getPhysicalNumberOfCells();
		
		System.out.println("Row Count: " + noOfRows);
		System.out.println("Col Count: " + noOfCols);
		
		for(int rowVal=0;rowVal<noOfRows;rowVal++) {
			for(int colVal=0;colVal<noOfCols;colVal++) {
				System.out.print(sheet.getRow(rowVal).getCell(colVal).getStringCellValue() + " ");
			}
			System.out.println();
		}
	
	}

}
