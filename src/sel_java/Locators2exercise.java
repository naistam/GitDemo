package sel_java;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2exercise {

	public static void main(String[] args) throws InterruptedException {
		String name = "mani";
		System.setProperty("webdriver.chrome.driver", "C:/Users/manik/OneDrive/Desktop/mani/BrowserExtensions/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String password = getPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		String suctext = driver.findElement(By.tagName("p")).getText();
		Assert.assertEquals(suctext, "You are successfully logged in.");
		String requser = driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText();
		Assert.assertEquals(requser, "Hello "+name+",");
		driver.findElement(By.xpath("//*[text()='Log Out']")).click();
		driver.close();
	}
	
	public static String getPassword(WebDriver driver) throws InterruptedException {
		
		driver.get("https://rahulshettyacademy.com/locatorspractice");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String pwdmsg=driver.findElement(By.cssSelector("p.infoMsg")).getText();
		//Please use temporary password 'rahulshettyacademy' to Login.

		String pwd1[]=pwdmsg.split("'");//
		
		String pwd2 = pwd1[1].split("'")[0];//rahulshettyacademy
	
		return pwd2;
		//0th index - Please use temporary password
		//1st index - rahulshettyacademy' to Login.

		//0th index - rahulshettyacademy
		//1st index - to Login.

		
	}
}
