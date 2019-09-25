package testNew;

public class StartingPoint extends MyBrowsers {

	
	public static void run (String str) {
		
		driver = MyBrowsers.browserSelection(str);

		LoggingIn.LogIn();
		
		//driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
		//LoggingIn.LogIn(driver);
		
		
		//To delete the order, please enter the number of it
		//DeleteOrder.deleteSelectedOrder(1);
		
		//to edit the order
		EditOrder.editSelectedOrder(3);
		
		//to view all products
		ViewAllProducts.viewAll();
		
		//to start a new order
		NewOrder.startNewOrder();
	}
	
}