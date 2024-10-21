package sel_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class EndToEndAutomation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/manik/OneDrive/Desktop/mani/BrowserExtensions/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input#ctl00_mainContent_rbtnl_Trip_0")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(
				By.xpath("//div[@class='search_options_menucontent']//child::li/a[text()=' Bengaluru (BLR)']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//following::li/a[text()=' Delhi (DEL)']"))
				.click();
		/*
		 * if(driver.findElement(By.id("Div1")).getAttribute("style").
		 * contains("display: block; opacity: 1;")) {
		 * System.out.println("To date is enabled"); Assert.assertTrue(true); } else {
		 * Assert.assertTrue(false); System.out.println("To date is disabled"); }
		 */
		driver.findElement(By.cssSelector("input#ctl00_mainContent_view_date1")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight.ui-state-hover")).click();
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		driver.findElement(By.cssSelector("input#ctl00_mainContent_btn_FindFlights")).click();

	}

}
