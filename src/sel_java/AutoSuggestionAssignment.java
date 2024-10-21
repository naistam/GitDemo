package sel_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class AutoSuggestionAssignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/manik/OneDrive/Desktop/mani/BrowserExtensions/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("uni");
		String country = "United States (USA)";
		Actions act = new Actions(driver);
		Thread.sleep(3000);
		act.moveToElement(driver.findElement(By.xpath("//ul[@id='ui-id-1']/li/div[text()='"+country+"']"))).click().build().perform();
		
		String selectedCountry = driver.findElement(By.id("autocomplete")).getText();
		System.out.println(selectedCountry);
		Assert.assertEquals(selectedCountry,country);
	}

}
