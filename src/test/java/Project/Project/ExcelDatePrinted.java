package Project.Project;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDatePrinted {
	public static void main(String[] args) throws IOException {
		File loc = new File("C:\\Users\\Bharath Koye\\eclipse-workspace\\New folder (2)\\Project\\lib\\DataExel.xlsx");
		FileInputStream stream = new FileInputStream(loc);
		Workbook w = new XSSFWorkbook(stream);
		Sheet s = w.getSheet("Sheet1");
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row r = s.getRow(i);
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				Cell c = r.getCell(j);
				int type = c.getCellType();
				if (type==1) {
					String name = c.getStringCellValue();
					System.out.println(name);
				}
			    if (type==0) {
					if (DateUtil.isCellDateFormatted(c)) {
						String name = new SimpleDateFormat("DD-MM-YYYY").format(c.getDateCellValue());
						System.out.println(name);
						
					}else {
						String name = String.valueOf((long)c.getNumericCellValue());
						System.out.println(name);
					}
					
				}
			}
			
		}
		
	}

}
