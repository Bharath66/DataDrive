package Project.Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Allert {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharath Koye\\eclipse-workspace\\New folder (2)\\Project\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.apsrtconline.in/oprs-web/");
		driver.manage().window().maximize();
		driver.findElement(By.id("searchBtn")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Alert ale = driver.switchTo().alert();
		ale.accept();
		driver.close();
	}

}
