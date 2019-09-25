package testNew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ViewAllProducts extends MyBrowsers {

	
	public static void viewAll () {
		driver.findElement(By.linkText("View all products")).click();
		
	}
}
