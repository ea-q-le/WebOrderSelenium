package testNew;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public abstract class MyBrowsers {
	
	static WebDriver driver;
	
	public static WebDriver browserSelection (String browser) {
		String browserChrome = "chrome";
		String browserFireFox = "firefox";
		//WebDriver driver;
		if (browser.equals(browserChrome)) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();		}
		return driver;
	}
	
	
}