package com.selenium.suit.saucelabs;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileReading {

	public static void main(String[] args) throws IOException {
		// Create a FilePath Variable to Store File Name or File Path
		String filePath = "SampleExcelFile.xlsx";

		// Create a File Object to Get the Access of File Name or File Path
		File file = new File(filePath);

		// Create a FileInputStream Object to Get the File Read Access
		FileInputStream inputStream = new FileInputStream(file);

		// Create a Workbook Object to Access Workbook from InputStream
		Workbook workbook = new XSSFWorkbook(inputStream);

		// Create a Sheet Object to Access to Sheet By Index from Workbook
		Sheet sheet = workbook.getSheetAt(0);

		// Create a Row Iterator on Sheet to get Rows
		Iterator<Row> rowIterator = sheet.iterator();

		// Create a While loop to Iterate all the Rows
		while (rowIterator.hasNext()) {
			// Get the Current Row using next() Method
			Row currentRow = rowIterator.next();

			// Create a Cell Iterator on Current Row to get Cells
			Iterator<Cell> cellIterator = currentRow.iterator();
			// Create a While loop to Iterate all the Cells
			while (cellIterator.hasNext()) {
				// Get the Current Cell using next() Method
				Cell currentCell = cellIterator.next();

				// Check for Cell Type to get the Cell Data
				if (currentCell.getCellType()==Cell.CELL_TYPE_STRING)
					System.out.print(currentCell.getStringCellValue());
				else if (currentCell.getCellType()==Cell.CELL_TYPE_NUMERIC)
					System.out.print(currentCell.getNumericCellValue());
				else if (currentCell.getCellType()==Cell.CELL_TYPE_FORMULA)
					System.out.print(currentCell.getNumericCellValue());
				}
			System.out.println("");
			}
		}
	}
