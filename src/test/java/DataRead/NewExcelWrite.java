package DataRead;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class NewExcelWrite {

	public static void main(String[] args) throws IOException {
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir") +"\\TestDataFolder\\Writedatapract.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("craate");
		XSSFRow row2 = sheet.createRow(0);
		row2.createCell(0).setCellValue("Iphone");
		row2.createCell(1).setCellValue("600");
		row2.createCell(2).setCellValue("white");
		
		XSSFRow row3 = sheet.createRow(1);
		row3.createCell(0).setCellValue("Samsung");
		row3.createCell(1).setCellValue("500");
		row3.createCell(2).setCellValue("Black");
		
		XSSFRow row4 = sheet.createRow(2);
		row4.createCell(0).setCellValue("Google");
		row4.createCell(1).setCellValue("400");
		row4.createCell(2).setCellValue("Blue");
		
		workbook.write(file);
		

	}

}
