package sel_java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitEx {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/manik/OneDrive/Desktop/mani/BrowserExtensions/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.alaskaair.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.cssSelector("input#oneWay")).click();
		driver.findElement(By.cssSelector("#fromCity1")).sendKeys("DEL");
		driver.findElement(By.cssSelector("#fromCity1")).sendKeys(Keys.TAB);
		driver.findElement(By.id("toCity1")).sendKeys("DXB");
		driver.findElement(By.id("toCity1")).sendKeys(Keys.TAB);
		driver.findElement(By.id("departureDate1")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,150)", "");
		Thread.sleep(3000);
		driver.findElement(By.id("day20")).click();
		//Thread.sleep(3000);
		driver.findElement(By.id("departureDate1")).sendKeys(Keys.ENTER);
		//driver.findElement(By.xpath("//*[@id=\"findFlights\"]")).click();
		
		/*WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(30));
		w.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[id='fromCityhotel']")));*/

	}

}
