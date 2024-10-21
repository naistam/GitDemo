package sel_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class PracticeAssignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/manik/OneDrive/Desktop/mani/BrowserExtensions/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input#checkBoxOption2")).click();
		String ReqElement = driver.findElement(By.xpath("//input[@id='checkBoxOption2']/parent::label")).getText();
		// System.out.println(ReqElement);
		Select st = new Select(driver.findElement(By.cssSelector("select#dropdown-class-example")));
		st.selectByVisibleText(ReqElement);
		driver.findElement(By.cssSelector("input#name")).sendKeys(ReqElement);
		driver.findElement(By.cssSelector("input#alertbtn")).click();
		String alertText = driver.switchTo().alert().getText();
		String splittext1 = alertText.split(",")[0];
		String splittext2 = splittext1.split(" ")[1];
		Assert.assertEquals(splittext2, ReqElement);

	}

}
