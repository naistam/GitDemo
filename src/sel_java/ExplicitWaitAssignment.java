package sel_java;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitAssignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/manik/OneDrive/Desktop/mani/BrowserExtensions/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.cssSelector("input#username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("learning");
		driver.findElement(By.xpath("//span[text()=' User']//following-sibling::span[@class='checkmark']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button#okayBtn")).click();
		WebElement ddown = driver.findElement(By.cssSelector("select.form-control"));
		Select st = new Select(ddown);
		st.selectByVisibleText("Consultant");
		driver.findElement(By.cssSelector("input#terms")).click();
		driver.findElement(By.xpath("//input[@id='signInBtn']")).click();
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button.btn")));
		List <WebElement> btnlist = driver.findElements(By.cssSelector("button.btn"));
		for(int i=0;i<btnlist.size();i++) {
			btnlist.get(i).click();
		}
		driver.findElement(By.xpath("//a[contains(text(),'Checkout')]")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(@class,'shopping-cart')]//parent::button")));
	   	}

}
