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

	public static void WriteToExcel(List <String> options, int n) {

		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet Sheet = workbook.createSheet("Gym Details");

		Row FirstRow = Sheet.createRow(0);
		Cell cell0 = FirstRow.createCell(0);
		cell0.setCellValue("Gym Page Options");
		//System.out.println("options size:"+options.size());
		//int j=0;
		int optionSize=options.size();

		for (int i = 1; i <(optionSize+1);i++) {

			Row rows = Sheet.createRow(i+2);

			Cell cell = rows.createCell(0);
			cell.setCellValue(options.get(i-1));
			//FirstRow=Sheet.createRow(i+2);
			 //cell0=FirstRow.createCell(0);
			//cell0.setCellValue(options.get(i));
			
			

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


