package webOrderAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class NewOrder {

	public static void startNewOrder(WebDriver driver) {
		driver.findElement(By.linkText("Order")).click();
		enterOrderDetails(driver, "FamilyAlbum", "2", "23.5", "Parker Jonhson", "Qara Qarayev", "Houston", "Texas", "77055", "Visa", "4400112233445566", "11/22");
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton")).click();
		driver.findElement(By.linkText("View all orders")).click();
	}

	public static void enterOrderDetails(WebDriver driver, String product, String quantity,
			String discount, String fullName, String address, String city, String state, String zip, String ccType,
			String ccNumber, String expirationDate) {

		Select selectProduct = new Select(driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct")));
		selectProduct.selectByValue(product);

		driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity")).sendKeys(quantity);
		WebElement discountField = driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtDiscount"));
		discountField.clear();
		discountField.sendKeys(discount);

		driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName")).sendKeys(fullName);
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2")).sendKeys(address);
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3")).sendKeys(city);
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4")).sendKeys(state);
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5")).sendKeys(zip);

		{
			// Payment
			Integer creditSelection;
			String creditID;
			if (ccType == "Visa") {
				creditSelection = 0;
			} else if (ccType == "MasterCard") {
				creditSelection = 1;
			} else {
				creditSelection = 2;
			}

			creditID = "ctl00_MainContent_fmwOrder_cardList_" + creditSelection;

			driver.findElement(By.id(creditID)).click();
			
			driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6")).sendKeys(ccNumber);
			driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1")).sendKeys(expirationDate);
		}
		
		

	}

}
