package DemoPakage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readFromExcel {

	public FileInputStream fs;
	public XSSFWorkbook workbook;
	public XSSFSheet sheet;
	public static XSSFRow row;
	public XSSFCell cell;

	public static String excelFilePath = "C:\\test\\testfile.xlsx";

	public static void main(String[] args) throws IOException {

		String pass;
		FileInputStream file = new FileInputStream("C:\\test\\testfile.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(file);

		XSSFSheet sheet = (XSSFSheet) workbook.getSheet("TestCase1");
		// String Value from the excel file
		pass = sheet.getRow(0).getCell(1).toString();

		System.out.println(pass);

		// Numeric Value from the Excel file

		System.out.println(sheet.getRow(0).getCell(0).getNumericCellValue());
		System.out.println((int) sheet.getRow(0).getCell(0).getNumericCellValue());

	}

}
