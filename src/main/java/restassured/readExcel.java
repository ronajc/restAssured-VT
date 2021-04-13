package restassured;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class readExcel {
	
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	
	public readExcel(String excelpath, String sheetname) throws Exception {
		
		 workbook = new XSSFWorkbook(excelpath);
		 sheet = workbook.getSheet(sheetname);
	}

	public static void main(String []args) throws Exception {
		getRowCount();
		getRowData(1,1);
	}
			
	public static void getRowData(int row, int cell) throws Exception {
	//	String excelpath = "./data/testdata.xlsx"; // This is to get excel path
	//	 workbook = new XSSFWorkbook(excelpath);
	//	 sheet = workbook.getSheet("Sheet1");
		
		String value = sheet.getRow(row).getCell(cell).getStringCellValue();
		System.out.println(value);
	}
	
	public static void getRowCount() throws Exception {
		
	//	String excelpath = "./data/testdata.xlsx"; // This is to get excel path
	//	 workbook = new XSSFWorkbook(excelpath);
	//	 sheet = workbook.getSheet("Sheet1");
		
		int rowcount = sheet.getPhysicalNumberOfRows();
		System.out.println("The count of rows in the given sheet is : "+ rowcount);
	}
}
