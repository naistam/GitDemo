package sel_java;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

public class LocatorsExercise {

	public static void main(String[] args) throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "C:/Users/manik/OneDrive/Desktop/mani/BrowserExtensions/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/locatorspractice");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.findElement(By.id("inputUsername")).sendKeys("rahul");
			driver.findElement(By.name("inputPassword")).sendKeys("hello123");
			driver.findElement(By.className("signInBtn")).click();
			System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
			driver.findElement(By.linkText("Forgot your password?")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("rahul");			
			driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("rahul@src.com");
			driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
			driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("rahul@gmail.com");
			driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("9848022338");
			driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
			System.out.println(driver.findElement(By.cssSelector("form p")).getText());
			driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("#inputUsername")).sendKeys("manikanta");
			driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
			driver.findElement(By.id("chkboxTwo")).click();
			driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
	}

}
