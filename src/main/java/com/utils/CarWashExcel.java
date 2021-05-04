package com.utils;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CarWashExcel {

	static FileOutputStream fout;

	public static void WriteToExcel(String item[], String phoneNumber[], int n) {

		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet Sheet = workbook.createSheet("Car Wash Details");
		
		

		Row FirstRow = Sheet.createRow(1);
		Cell cell0 = FirstRow.createCell(0);
		cell0.setCellValue("Car Wash Options");

		for (int i = 2; i <= (n+1); i++) {

			Row rows = Sheet.createRow(i);

			Cell col1 = rows.createCell(0);
			col1.setCellValue(item[i - 1]);

			Cell col2 = rows.createCell(1);
			col2.setCellValue(phoneNumber[i - 1]);

		}
		String path = System.getProperty("user.dir");

		try {
			fout = new FileOutputStream(path + "\\OutputData\\CarWashOptions.xlsx");
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
