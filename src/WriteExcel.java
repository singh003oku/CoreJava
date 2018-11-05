import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	public static void main(String[] args) throws IOException {

		// File path
		String excelFilePath = "C:\\test\\tt.xlsx";
		// To Take Input as file
		FileInputStream file = new FileInputStream(excelFilePath);
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = (XSSFSheet) workbook.getSheetAt(0);

		// Pass the Row Number in GetRow and Cell number in create cell and set the
		// value like "Test"
		sheet.getRow(1).createCell(5).setCellValue("Test");
		// now fileout is used to write into file
		FileOutputStream fileOut = new FileOutputStream(excelFilePath);
//we have the write method of workbook for writting into excel file
		workbook.write(fileOut);
		// here we need to close the connection
		fileOut.close();
		System.out.println("Write has been done");
	}

}
