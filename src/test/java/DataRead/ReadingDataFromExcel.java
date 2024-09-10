package DataRead;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class ReadingDataFromExcel {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();

		

		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+ "\\TestDataFolder\\data.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		//	workbook.getSheetAt(1); extracted using index number
		
		int totalrows =	sheet.getLastRowNum();
		int totalcells = sheet.getRow(1).getLastCellNum();
		System.out.println("numb of row - " + totalrows);
		System.out.println("numb of cells - " + totalcells);
		
		for(int r = 0;r<=totalrows;r++) {
			XSSFRow currentrow =sheet.getRow(r);
			for(int c=0;c<totalcells;c++ ) {
				XSSFCell cell = currentrow.getCell(c);
				System.out.print(cell.toString()+"\t");
				
			}
			
		}
		workbook.close();
		file.close();
		
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File srcfile = screenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyDirectory(srcfile, srcfile);
	}

}
