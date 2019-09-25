package testNew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoggingIn extends MyBrowsers {

//	public static void main(String[] args) {
//		StartingPoint.run("chrome");
//		
//		LogIn();
//	}
	
	public static void LogIn() {
		String username = "Tester";
		String password = "test";
		driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys(username);
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys(password);
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
	}
}