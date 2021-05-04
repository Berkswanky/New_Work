package com.utils;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GymOutputExcel {
	
	static FileOutputStream fout;

	public static void WriteToExcel(List<String> options) {

		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet Sheet = workbook.createSheet("Gym Details");

		Row FirstRow = Sheet.createRow(0);
		Cell cell0 = FirstRow.createCell(0);
		cell0.setCellValue("Gym Page Options");

		for (int i = 1; i <=options.size(); i++) {

			Row rows = Sheet.createRow(i);

			Cell col1 = rows.createCell(0);
			col1.setCellValue(options.get(i));

		}
		String path = System.getProperty("user.dir");
		
		try {
			fout = new FileOutputStream(path + "\\OutputData\\GymPageOptions.xlsx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			workbook.write(fout);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			fout.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			workbook.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}


