package sel_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FormAssignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/manik/OneDrive/Desktop/mani/BrowserExtensions/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("manikanta potnuru");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("manikantajk@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Password");
		driver.findElement(By.xpath("//input[@id='exampleCheck1']")).click();
		Select st = new Select(driver.findElement(By.cssSelector("select#exampleFormControlSelect1")));
		st.selectByVisibleText("Male");
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("23-01-1993");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
	}

}
