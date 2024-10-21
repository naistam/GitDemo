package sel_java;

import org.openqa.selenium.chrome.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class SampleDemo {

	public static void main(String[] args) {
		// Selenium Manager
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/manik/OneDrive/Desktop/mani/BrowserExtensions/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// System.setProperty("webdriver.gecko.driver",
		// "C:/Users/manik/OneDrive/Desktop/mani/BrowserExtensions/geckodriver.exe");
		// WebDriver driver = new FirefoxDriver();
		// System.setProperty("webdriver.edge.driver",
		// "C:/Users/manik/OneDrive/Desktop/mani/BrowserExtensions/msedgedriver.exe");
		// WebDriver driver = new EdgeDriver();

		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		// driver.close();
		// driver.quit();
	}

}
