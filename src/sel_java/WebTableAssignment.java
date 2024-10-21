package sel_java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableAssignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/manik/OneDrive/Desktop/mani/BrowserExtensions/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		int rowcount = driver.findElements(By.xpath("//div[@class='left-align']/fieldset/table[@id='product']/tbody/tr")).size();
		System.out.println("rowcount of the table:"+rowcount);
		int colcount = driver.findElements(By.xpath("//div[@class='left-align']/fieldset/table[@id='product']/tbody/tr[2]/td")).size();
		System.out.println("columncount of the table:"+colcount);
		List<WebElement> colValues = driver.findElements(By.xpath("//div[@class='left-align']/fieldset/table[@id='product']/tbody/tr[3]/td"));
		for(int i=0;i<colValues.size();i++) {
			System.out.println("Text of Column Number in 2nd row:"+(i+1));
			System.out.println(colValues.get(i).getText());
		}
	}

}
