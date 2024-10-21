package java_streams;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;
import java.util.stream.Collectors;

public class WebTableSorting {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/manik/OneDrive/Desktop/mani/BrowserExtensions/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		//Click on Column
		driver.findElement(By.xpath("//tr/th[1]")).click();
		
		//Capture All webelements into List
		List<WebElement> elementsList = driver.findElements(By.xpath("//tr/td[1]"));
		
		//Capture text of all webelements in to new (original) list
		List<String> originalList = elementsList.stream().map(s->s.getText()).collect(Collectors.toList());
		
		//sort on the orginal list of step3 -> sortedList
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
		
		//Compare originalList vs sortedList
		Assert.assertTrue(originalList.equals(sortedList));
		
	}

}
