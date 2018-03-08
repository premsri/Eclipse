package org.demo.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.text.Element;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

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

	public static void clear(WebElement element) {
		element.clear();

	}

	public static void click(WebElement element) {

		if (displayText(element)) {
			element.click();
		}
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

	public static void moveOver(WebElement element) {

		Actions ac = new Actions(driver);
		ac.moveToElement(element).build().perform();
	}

	public static void javascript(WebDriver driver) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scroll(0, 250);");
		/*
		 * try { JavascriptExecutor js = (JavascriptExecutor) driver;
		 * js.executeScript("arguments[0].scrollIntoView(true);", element); try {
		 * JavascriptExecutor js1 = (JavascriptExecutor) driver;
		 * js1.executeScript("arguments[0].scrollIntoView(false);", element); } catch
		 * (Exception e) { // TODO: handle exception } } catch (Exception e) { // TODO:
		 * handle exception }
		 */
	}

	public static void fluent(WebElement element) {
		FluentWait<WebDriver> f = new FluentWait<WebDriver>(driver);
		f.withTimeout(30, TimeUnit.SECONDS);
		f.pollingEvery(1, TimeUnit.SECONDS);
		f.ignoring(NoSuchElementException.class);
		f.until(ExpectedConditions.visibilityOf(element)).click();
		;

	}

	public static void selectVisible(WebElement element, String val) {

		Select sc = new Select(element);
		sc.selectByVisibleText(val);
		element.click();
	}

	public static void explicit(WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf((element)));

	}

	public static String getDataExcel(int row, Object cell) throws Throwable {
		List<LinkedHashMap<String, String>> mapdatalist = new ArrayList<LinkedHashMap<String, String>>();
		File loc = new File("C:\\\\Users\\\\ELCOT\\\\eclipse-workspace\\\\MavenPackage\\\\excel\\\\DataDriven.xlsx");
		FileInputStream stream = new FileInputStream(loc);
		Workbook book = new XSSFWorkbook(stream);
		Sheet sheet = book.getSheet("good");
		Row headerrow = sheet.getRow(0);
		for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
			LinkedHashMap<String, String> mapdata = new LinkedHashMap<String, String>();
			Row currentrow = sheet.getRow(i);
			for (int j = 0; j < currentrow.getPhysicalNumberOfCells(); j++) {
				Cell cell1 = currentrow.getCell(j);
				int cellType = cell1.getCellType();
				if (cellType == 0) {
					String key = headerrow.getCell(j).getStringCellValue();
					double d = cell1.getNumericCellValue();
					long l = (long) d;
					String string = String.valueOf(l);
					mapdata.put(key, string);

				} else {
					String key = headerrow.getCell(j).getStringCellValue();
					String string = cell1.getStringCellValue();
					mapdata.put(key, string);

				}
			}
			mapdatalist.add(mapdata);

		}
		return mapdatalist.get(row).get(cell);

	}

	private static Workbook XSSFWorkbook(FileInputStream stream) {
		// TODO Auto-generated method stub
		return null;
	}

	public static WebDriver launchBrowser(String browser, String url) {
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\ELCOT\\eclipse-workspace\\MavenPackage\\target\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\ELCOT\\javapracctise\\SeleniumPractise\\lib\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browser.equals("ie")) {
			System.setProperty("webdriver.ie.driver",
					"C:\\Users\\ELCOT\\javapracctise\\SeleniumPractise\\lib\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}
}
