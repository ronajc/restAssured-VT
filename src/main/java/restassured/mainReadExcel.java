package restassured;

public class mainReadExcel {

	public static void main(String[] args) throws Exception {
		String excelpath = "./data/testdata.xlsx";
		String sheetname = "Sheet1";
		
		readExcel re = new readExcel(excelpath, sheetname);
		readExcel.getRowCount();
		readExcel.getRowData(1, 1);
		
	}

}
