package com.utils;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FreeListingOutputExcel {
	
	static FileOutputStream fout;

	public static void WriteToExcel(String msg) {

		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet Sheet = workbook.createSheet("Free Listing Page Output");

		Row FirstRow = Sheet.createRow(0);
		Cell cell0 = FirstRow.createCell(0);
		cell0.setCellValue("Output");
		
		Row thirdRow=Sheet.createRow(2);
		Cell cell1=thirdRow.createCell(0);
		cell1.setCellValue("The error message is: " +msg);
		String path = System.getProperty("user.dir");

		try {
			fout = new FileOutputStream(path + "\\OutputData\\FreeListingOutput.xlsx");
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
