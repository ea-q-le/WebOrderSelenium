package webOrderAssignment;

import org.openqa.selenium.WebDriver;

public class StartingPoint {

	
	public static void run (String str) {
		new MyBrowsers();
		WebDriver driver = MyBrowsers.browserSelection(str);

		
		driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
		LoggingIn.LogIn(driver);
		
		
		//To delete the order, please enter the number of it
		//DeleteOrder.deleteSelectedOrder(driver, 1);
		
		//to edit the order
		EditOrder.editSelectedOrder(driver, 3);
		
		//to view all products
		ViewAllProducts.viewAll(driver);
		
		//to start a new order
		NewOrder.startNewOrder(driver);
	}
	
}
