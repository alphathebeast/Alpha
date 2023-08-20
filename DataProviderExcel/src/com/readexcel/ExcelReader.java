package com.readexcel;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReader {
	public static void main(String[] args) {
		try {
			// Specify the path to your Excel file
			String excelFilePath = "E:\\jars\\StudentsData.xlsx";

			FileInputStream inputStream = new FileInputStream(new File(excelFilePath));

			// Create a workbook instance for the Excel file
			Workbook workbook = new XSSFWorkbook(inputStream);

			// Get the first sheet in the workbook
			Sheet sheet = workbook.getSheetAt(0);

			// Iterate through rows and columns
			for (Row row : sheet) {
				for (Cell cell : row) {
					switch (cell.getCellType()) {
					case STRING:
						System.out.print(cell.getStringCellValue() + "\t");
						break;
					case NUMERIC:
						System.out.print(cell.getNumericCellValue() + "\t");
						break;
					case BOOLEAN:
						System.out.print(cell.getBooleanCellValue() + "\t");
						break;
					default:
						System.out.print("\t");
					}
				}
				System.out.println();
			}

			// Close the workbook and input stream
			workbook.close();
			inputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
