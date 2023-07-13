 
package org.test;

import java.io.File;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class NewExcelupdate {
	
public static void main(String[] args) throws IOException {
	
	File f=new File("C:\\Users\\lenovo\\eclipse-workspace\\Maven2023Project\\src\\test\\resources\\Excel\\NewExcelCreation.xlsx");
// we are going to write, so no input stream
	
	
	Workbook w=new XSSFWorkbook();
	//sheet
	Sheet s = w.createSheet("The Rock");
	Row r = s.createRow(3);
	Row r1 = s.createRow(4);
	Row r2 = s.createRow(5);
    
	Cell cellvariable = r.createCell(3);
	
	Cell cellvariable1 = r.createCell(4);
	Cell cellvariable2 = r.createCell(5);
    

    cellvariable.setCellValue("username");
    cellvariable1.setCellValue("Hope");
   cellvariable2.setCellValue("12-07-2023");
    
    
  
    FileOutputStream ot = new FileOutputStream(f);
  
   w.write(ot);
  System.out.println("Done");
  
}
	
}
