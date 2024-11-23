package com.utility;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;




public class ReadExcelData {
	
      public static String readParticularCellData (String sheetName, int rowNum, int columnNum ) throws InvalidFormatException, IOException {
	  File file = new File("C:\\Users\\stami\\Desktop\\TAMIL.XL.xlsx");
	       Workbook book = new XSSFWorkbook(file);
	     
		  Sheet sheet =book.getSheet(sheetName);
		   
	      Row row = sheet.getRow(rowNum);
	      
	      Cell cell = row.getCell(columnNum);
	      
	      DataFormatter dataformat = new DataFormatter();
	      
	      String data = dataformat.formatCellValue(cell);
	      
	      System.out.println(data);
	      
	      return data;
        
         
      }	
			
}
   
	private static void  readAllCellData() throws InvalidFormatException, IOException {
    	 File file = new File("C:\\Users\\stami\\Desktop\\TAMIL.XL.xlsx");
	       Workbook book = new XSSFWorkbook(file);
	     
		  Sheet sheet =book.getSheet("sheet1");
		   
	      Row row = sheet.getRow(1);
	     short lastCellNum = row.getLastCellNum();
	      
	      
	      for (int i = 0; i < lastCellNum; i++) {
			Cell cell = row.getCell(i);
			DataFormatter dataformat = new DataFormatter();
			String data = dataformat.formatCellValue(cell);
			System.out.println(data);
		}
	      
	}



private static  void getAllData() {
	File file = new File("C:\\Users\\stami\\Desktop\\TAMIL.XL.xlsx");
    Workbook book = new XSSFWorkbook(file);
  
	  Sheet sheet =book.getSheet("sheet1");
	   
   Row row = sheet.getRow(1);
  short lastCellNum = row.getLastCellNum();
   
   
   for (int i = 0; i < lastCellNum; i++) {
		Cell cell = row.getCell(i);
		DataFormatter dataformat = new DataFormatter();
		String data = dataformat.formatCellValue(cell);
		System.out.println(data);
}
}