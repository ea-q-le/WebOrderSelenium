package testNew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditOrder extends MyBrowsers {

	
	public static void editSelectedOrder(Integer orderNumber) {
		
		orderNumber = 1+ orderNumber;
		String orderID = "//*[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr["+ orderNumber +"]/td[13]/input";
		
		driver.findElement(By.xpath(orderID)).click();
		
		System.out.println("UPdating the order" + (orderNumber - 1));
		
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_UpdateButton")).click();
		
	}
}