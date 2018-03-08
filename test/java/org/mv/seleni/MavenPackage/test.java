package org.mv.seleni.MavenPackage;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


	public class test{
		
		public static void test1() throws Throwable {
			List<LinkedHashMap<String, String>> mapdatalist =new ArrayList();
			File loc = new File("C:\\Users\\ELCOT\\eclipse-workspace\\MavenPackage\\excel\\DataDriven.xlsx");
			String sheetname ="demo";
			FileInputStream stream = new FileInputStream(loc.getAbsolutePath());
			Workbook book = new XSSFWorkbook(stream);
			Sheet sheet = book.getSheet(sheetname);
			Row headerrow = sheet.getRow(0);
			for (int i = 1; i <sheet.getPhysicalNumberOfRows(); i++) {
				LinkedHashMap<String, String> mapdata = new LinkedHashMap<String, String>();
				Row currentrow = sheet.getRow(i);
				for (int j = 0; j <currentrow.getPhysicalNumberOfCells() ; j++) {
					Cell cell1 = currentrow.getCell(j);
					int cellType = cell1.getCellType();
					if (cellType==0) {
						String key = headerrow.getCell(j).getStringCellValue();
						double d = cell1.getNumericCellValue();
						long l =(long) d;
						String string1 = String.valueOf(l);
						mapdata.put(key, string1);
						
					} else if (cellType==1){
						String key = headerrow.getCell(j).getStringCellValue();
						String string1 = cell1.getStringCellValue();
						mapdata.put(key, string1);

					}
				}
				mapdatalist.add(mapdata);
				System.out.println(mapdatalist.get(0).get("Email"));
			}
					
			
		}
		public static void main(String[] args) throws Throwable {
			test1();
		}
		
	}
	