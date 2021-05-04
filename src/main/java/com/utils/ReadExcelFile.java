package com.utils;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {
	
	public static String readExcelData(int rowId, int cellId) throws Exception {
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\com\\datatable\\Test Data.xlsx");
		XSSFWorkbook work = new XSSFWorkbook(fis);
		XSSFSheet sheet = work.getSheet("Testing");

		XSSFRow row;
		XSSFCell cell;

		row = sheet.getRow(rowId);
		cell = row.getCell(cellId);
		DataFormatter f = new DataFormatter();
		String data = f.formatCellValue(cell);
		work.close();
		return data;
	}

}
