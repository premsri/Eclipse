package org.demo.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	public static WebDriver driver;

	public static WebDriver getDriver(String name) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\javapracctise\\SeleniumPractise\\lib\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get(name);
		return driver;
	}

	public static String setText(WebElement element, String name) {

		element.sendKeys(name);
		return name;

	}

	public static Object dataDriven(String sheetname, int rownum, int cellnum) throws Throwable {

		File file = new File("C:\\\\Users\\\\ELCOT\\\\eclipse-workspace\\\\MavenPackage\\\\excel\\\\DataDriven.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook wbook = new XSSFWorkbook(stream);
		Sheet sheet = wbook.getSheet(sheetname);
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		try {
			String string = cell.getStringCellValue();
			return string;
		} catch (Exception e) {
			double d = cell.getNumericCellValue();
			long l = (long) d;
			String string = Long.toString(l);
			return string;
		}

	}

	public static void clear(WebElement element) {
		element.clear();

	}

	public static void click(WebElement element) {
		element.click();
	}

	public static void driverQuit(WebDriver driver) {
		driver.quit();
	}

	public static boolean enableText(WebElement element) {
		boolean b = element.isEnabled();
		return b;
	}

	public static boolean displayText(WebElement element) {
		boolean b1 = element.isDisplayed();
		return b1;

	}

	public void javascript(WebElement element) {

		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", element);
			try {
				JavascriptExecutor js1 = (JavascriptExecutor) driver;
				js1.executeScript("arguments[0].scrollIntoView(false);", element);
			} catch (Exception e) {
				// TODO: handle exception
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public boolean selected(WebElement element) {
		return element.isSelected();
	}

	public void getAttributeValue(WebElement element) {
		element.getAttribute("value");

	}

	public void getext(WebElement element) {
		element.getText();
	}

	public void label(WebElement element) {

		Actions ac = new Actions(driver);
		ac.moveToElement(element).build().perform();
		element.click();
	}

	public void moveOver(WebElement element) {

		Actions ac = new Actions(driver);
		ac.moveToElement(element).build().perform();
	}

	public static void selectVisible(WebElement element, String val) {

		Select sc = new Select(element);
		sc.selectByVisibleText(val);
		element.click();
	}

}
