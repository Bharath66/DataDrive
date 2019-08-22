package org.test.task;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	static WebDriver driver;
	public static String getData(int rowNo, int cellNo) throws IOException {
		File loc = new File("C:\\Users\\Bharath Koye\\eclipse-workspace\\New folder (2)\\Project\\lib\\DataExel.xlsx");
		FileInputStream stream = new FileInputStream(loc);
		Workbook w = new XSSFWorkbook(stream);
		Sheet s = w.getSheet("Sheet1");
		Row r = s.getRow(rowNo);
		Cell c = r.getCell(cellNo);
		int type = c.getCellType();
		String name = null;
		if(type==1) {
			name = c.getStringCellValue();
		}
		if (type==0) {
			if (DateUtil.isCellDateFormatted(c)) {
				name = new SimpleDateFormat("DD-MM-YYYY").format(c.getDateCellValue());
			}else {
				name = String.valueOf((long)c.getNumericCellValue());
			}
			
		}
		return name;
	}
	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharath Koye\\eclipse-workspace\\New folder (2)\\Project\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}
	public static void loadUrl(String url) {
		driver.get(url);
	}
	public static void type(WebElement element, String name) {
		element.sendKeys(name);

	}
	public static void btnClick(WebElement element) {
		element.click();
	}
	public static void quitBrowser() {
		driver.quit();
	}

}
