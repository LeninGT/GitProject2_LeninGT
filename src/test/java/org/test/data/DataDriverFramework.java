package org.test.data;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class DataDriverFramework {
	
	public static void main(String[] args) throws IOException   {
		
		//1.file location
		File f=new File("C:\\Users\\lenovo\\eclipse-workspace\\Maven2023Project\\src\\test\\resources\\Excel\\datadrivenExcel.xlsx");
		//2.fileinputsteam
		FileInputStream st=new FileInputStream(f);
	     //3.workbook
		Workbook w=new XSSFWorkbook(st);
		
	     //4.sheet
	 Sheet s = w.getSheet("Sheet1");
	 
	 //5.row
	 System.out.println("find the rows in 1");
	  Row  r = s.getRow(6);
	 //6.cell
     Cell cell = r.getCell(1);
     System.out.println(cell);
       String string = cell.toString();
       
       int cellType = cell.getCellType();
       System.out.println("**    CELL TYPE   ***");
       System.out.println(cellType);
       System.out.println("find size");
       
       System.out.println(string);
      //7.row size
       int rowsize = s.getPhysicalNumberOfRows();
       System.out.println(" ....   row sizze ...check");
       System.out.println(rowsize);
      //8.cell size
       int cellsize = r.getPhysicalNumberOfCells();
       
       System.out.println(" ....   column  sizze ...check");
       System.out.println(cellsize);
       
       //get allvalues
       
      for(int i=0; i<s.getPhysicalNumberOfRows(); i++) {
      Row row = s.getRow(i);
      
      for (int j=0; j<row.getPhysicalNumberOfCells();j++) {
      Cell cell2 = row.getCell(j);
      System.out.println(cell2);
      }
	}
      }
}
	
