package com.readexcel;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheetReading {

	public static Object[][] loadSheet(String fileName, String sheetName) throws IOException {
		Object[][] obj = null;
		FileInputStream fis = new FileInputStream(fileName);
		Workbook book = new XSSFWorkbook(fis);
		Sheet sheet = book.getSheet(sheetName);
		int rows = sheet.getLastRowNum();
		for (int i = 2; i < rows; i++) {
			Row row = sheet.getRow(i);
			int cells = row.getLastCellNum();
			for (int j = 1; j < cells; j++) {
				Cell c = row.getCell(j);
				System.out.print(c.getStringCellValue() + "\t");
			}
			System.out.println();
		}
		return obj;
	}

	public static void main(String[] args) throws IOException {
		loadSheet("E:\\jars\\StudentsData.xlsx", "Students");
	}
}
