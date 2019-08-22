package Project.Project;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WHandle {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharath Koye\\eclipse-workspace\\New folder (2)\\Project\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com");
		driver.manage().window().maximize();
		String pId = driver.getWindowHandle();
		System.out.println("parent window id is "+pId);
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println("child window id is "+allWindows);
		for (String v : allWindows) {
			if (!v.equals(pId)) {
				WebDriver window = driver.switchTo().window(v);
				String title = window.getTitle();
				System.out.println("child title is "+title);
				driver.close();
			}
		}
		driver.switchTo().window(pId);
		driver.quit();
	}

}
