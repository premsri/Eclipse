package org.mv.seleni.MavenPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {
	public void method() throws Throwable {

		

	File fileExcel =new File("C:\\Users\\ELCOT\\eclipse-workspace\\MavenPackage\\excel\\DataDriven.xlsx");
	FileInputStream stream= new FileInputStream(fileExcel);
	Workbook wbook =new XSSFWorkbook(stream);
	Sheet sheet = wbook.getSheet("Demo");
	Row row = sheet.getRow(1);
	Cell cell = row.getCell(1);
	System.out.println(cell);
	String s1 = cell.getStringCellValue();
	System.out.println(s1);
	int irow = sheet.getPhysicalNumberOfRows();
	Row row2 = sheet.getRow(0);
	int icell = row2.getPhysicalNumberOfCells();
	System.out.println(irow);
	System.out.println(icell);
	for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
		Row row3 = sheet.getRow(i);
		for (int j = 0; j < row3.getPhysicalNumberOfCells(); j++) {
			Cell cell2 = row3.getCell(j);
			System.out.println(cell2);
		}
	}
	/*for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
		Row row4 = sheet.getRow(i);
		for (int j = 1; j < row4.getPhysicalNumberOfCells(); j++) {
			Cell cell2 = row4.getCell(j);
			try {
				String ss = cell2.getStringCellValue();
				System.out.println(ss);
			} catch (Throwable e) {
					double d = cell2.getNumericCellValue();
					System.out.println(d);
			}
			}*/
	for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
		Row row3 = sheet.getRow(i);
		for (int j = 0; j < row3.getPhysicalNumberOfCells(); j++) {
			Cell cell2 = row3.getCell(j);
			int cellType = cell2.getCellType();
			if (cellType==0) {
				double d = cell2.getNumericCellValue();
				long l =(long) d;
				String string = String.valueOf(l);
				System.out.println(string);
			}else if (cellType==1) {
				String string = cell2.getStringCellValue();
				System.out.println(string);
				
			}
		}
	}
	}
	

public static void main(String[] args) throws Throwable {
	DataDriven dc =new DataDriven();
	dc.method();
}	
}

