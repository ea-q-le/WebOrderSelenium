package webOrderAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoggingIn {

	
	public static void LogIn(WebDriver driver) {
		String username = "Tester";
		String password = "test";
		
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys(username);
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys(password);
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
	}
}
