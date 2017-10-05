package com.selenium.suit.saucelabs;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileWritingClass {

	public static void main(String[] args) throws IOException {
		// Create a FilePath Variable to Store File Name or File Path
		String filePath = "SampleNewExcelFile.xlsx";

		// Create a Workbook Object to Access Workbook
		Workbook workbook = new XSSFWorkbook();

		// Create a Sheet Object From Workbook
		Sheet sheet = workbook.createSheet();

		// Create an Input of Type Two Dimensional Object
		Object[][] datatypes = {
                {"Datatype", "Type", "Size(in bytes)"},
                {"int", "Primitive", 2},
                {"float", "Primitive", 4},
                {"double", "Primitive", 8},
                {"char", "Primitive", 1},
                {"String", "Non-Primitive", "No fixed size"}
        };

		// Initialize the Row Number to ZERO
		int rowNum = 0;

		// Create a For Each loop to Get One Dimension Object i.e Rows
		for (Object[] dataType : datatypes) {

			// Create a Row Object from Sheet with Row Numbers
			Row row = sheet.createRow(rowNum++);
			
			// Initialize the Column Number to ZERO
			int columnNum = 0;
			// Create a For Each loop to Get Object Values i.e Cells
			for (Object field : dataType) {

				// Create a Cell Object from Sheet with Column Numbers
				Cell cell = row.createCell(columnNum++);
				
				// Check for Values Instance to Set the Value in a Cell
				if (field instanceof String)
					cell.setCellValue((String) field);
				else if (field instanceof Integer)
					cell.setCellValue((Integer) field);
			}
			
		}
		
		// Create a FileOutputStream Object to Get the Write Access of File Name or File Path
		FileOutputStream outputStream = new FileOutputStream(filePath);

		// Write all the Data using FileOutputStream Object
		workbook.write(outputStream);
		// Close the Workbook to Save all the Data
		workbook.close();
		}
	}

