package org.mv.seleni.MavenPackage;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

class app{
	
	public static void main(String[] args) throws Throwable {
		getDataforAdactin();
	}
	
public static void getDataforAdactin() throws Throwable {
	List<HashMap<String, String>> mapDatasList = new ArrayList<HashMap<String, String>>();
	File excelLocaltion = new File("C:\\Users\\ELCOT\\eclipse-workspace\\MavenPackage\\excel\\Adactin.xlsx");

	String sheetName = "demo";

	FileInputStream f = new FileInputStream(excelLocaltion);
	Workbook w = new XSSFWorkbook(f);
	Sheet sheet = w.getSheet(sheetName);
	Row headerRow = sheet.getRow(0);
	for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
		Row currentRow = sheet.getRow(i);
		HashMap<String, String> mapDatas = new HashMap<String, String>();
		for (int j = 0; j < headerRow.getPhysicalNumberOfCells(); j++) {
			Cell currentCell = currentRow.getCell(j);
			int cellType = currentCell.getCellType();
			if (cellType == 1) {
				String column = headerRow.getCell(j).getStringCellValue();
				mapDatas.put(column, currentCell.getStringCellValue());
			} else if (cellType == 0) {
				String column = headerRow.getCell(j).getStringCellValue();
				double d = currentCell.getNumericCellValue();
				long l = (long) d;
				String string = String.valueOf(l);
				mapDatas.put(column, string);

			}
		}

		mapDatasList.add(mapDatas);
	}}}