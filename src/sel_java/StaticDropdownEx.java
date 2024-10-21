package sel_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.testng.Assert;

public class StaticDropdownEx {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/manik/OneDrive/Desktop/mani/BrowserExtensions/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://dev.clickntravel.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@class,'traveller-title')]/span/label")).click();
		Thread.sleep(1000);
		int i=1;
		while(i<5) {
		driver.findElement(By.xpath("//ul/li[1]/div[@class='count']/button/span[text()='+']")).click();
		i++;
		}
		driver.findElement(By.xpath("//button/span[text()='Apply']")).click();
		String travcount = driver.findElement(By.xpath("//div[contains(@class,'traveller-title')]/span/label")).getText();
		String count = travcount.split(",")[0];
		System.out.println(count);
		Assert.assertEquals(count, "5 Traveller");
}
		
}