package Project.Project;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExcelDate {
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		SimpleDateFormat s = new SimpleDateFormat("MM-DD-YY");
		String name = s.format(d);
		System.out.println(name);
	}

}
