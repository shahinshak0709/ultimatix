package logintest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class temp2 {

	public static WebDriver driver;
	
	public static WebDriver launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\cucumber1\\driv\\chromedriver.exe");
		driver = new ChromeDriver();
				return driver;
		}
	
	public static void loadUrl(String url) {
		driver.get(url);
		
	}

	public static void typeValue(WebElement element, String value) {
		element.sendKeys(value);
	}
	
	public static void clickElement(WebElement element) {
		element.click();
	}
	public static void closebrowser() {
		driver.quit();
	}
}
