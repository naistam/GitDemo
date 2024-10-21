package sel_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Enable_DisableExercise {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/manik/OneDrive/Desktop/mani/BrowserExtensions/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		System.out.println(driver.findElement(By.cssSelector("input#ctl00_mainContent_view_date2")).isEnabled());
		driver.findElement(By.cssSelector("input#ctl00_mainContent_rbtnl_Trip_1")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("display: block; opacity: 1;")) {
			System.out.println("To date is enabled");
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
			System.out.println("To date is disabled");
		}
	}

}
