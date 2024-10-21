package java_streams;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Pagenation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/manik/OneDrive/Desktop/mani/BrowserExtensions/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		// Click on Column
		driver.findElement(By.xpath("//tr/th[1]")).click();

		// Capture All web elements into List
		List<WebElement> elementsList = driver.findElements(By.xpath("//tr/td[1]"));

		// Capture text of all web elements in to new (original) list
		List<String> originalList = elementsList.stream().map(s -> s.getText()).collect(Collectors.toList());

		// sort on the orginal list of step3 -> sortedList
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());

		// Compare originalList vs sortedList
		Assert.assertTrue(originalList.equals(sortedList));
		
		List<String> Price;
		//Scan the name column with get text -> Beans -> Print the price of the Beans
		
		do {
			List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));
			Price = rows.stream().filter(s->s.getText().contains("Beans")).map(s->getPriceVeggie(s)).collect(Collectors.toList());
			Price.forEach(a->System.out.println(a));
			
			if(Price.size()<1) {
				driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
			}
			
		}
		while(Price.size()<1);

	}
	private static String getPriceVeggie(WebElement s) {
		String priceValue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return priceValue;
	}

}
