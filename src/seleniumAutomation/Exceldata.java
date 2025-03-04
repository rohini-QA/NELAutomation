package seleniumAutomation;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceldata {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("D:\\#Rohini\\Office\\Miscellaneous\\Book1.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);

	}

}
