package ImportantConcepts;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelreadwrite1 {
	public static void main(String[] args) {
		getrowcount();
	}
	public static void getrowcount() {
	try {
	FileInputStream file=new FileInputStream("src\\Excelreadwrite\\credentialsbook.xslx");	
	XSSFWorkbook workbook=new XSSFWorkbook(file);
	XSSFSheet sheet=workbook.getSheet("Credentials_Sheet");
	int rowcount=sheet.getPhysicalNumberOfRows();
	System.out.println("row count"+rowcount);
	file.close();
	}
	catch(Exception exp) {
		System.out.println(exp.getMessage());
		System.out.println(exp.getCause());
		exp.printStackTrace();
	}

}
}