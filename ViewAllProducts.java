package webOrderAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ViewAllProducts {

	
	public static void viewAll (WebDriver driver) {
		driver.findElement(By.linkText("View all products")).click();
		
	}
}
