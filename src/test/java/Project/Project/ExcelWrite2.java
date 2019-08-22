package Project.Project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite2 {
	public static void main(String[] args) throws IOException {
		File loc = new File("C:\\Users\\Bharath Koye\\eclipse-workspace\\New folder (2)\\Project\\lib\\DataExel.xlsx");
		FileInputStream stream = new FileInputStream(loc);
		Workbook w = new XSSFWorkbook(stream);
		Sheet s = w.getSheet("Sheet1");
		Row r = s.getRow(2);
		Cell c = r.getCell(2);
		String name = c.getStringCellValue();
		if (name.equals("Sql")) {
			c.setCellValue("UNIX");
			
		}
		FileOutputStream o = new FileOutputStream(loc);
		w.write(o);
		System.out.println("Done-------------------");
		
	}

}
