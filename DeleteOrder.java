package testNew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeleteOrder extends MyBrowsers{

	public static void main(String[] args) {
		
	}
	
	
	public static void deleteSelectedOrder (Integer orderNumber) {
		
		orderNumber = 1+ orderNumber;
		String orderID = "ctl00_MainContent_orderGrid_ctl0" + orderNumber +"_OrderSelector";
		
	
		driver.findElement(By.id(orderID)).click();
		driver.findElement(By.id("ctl00_MainContent_btnDelete")).click();;
	}
}