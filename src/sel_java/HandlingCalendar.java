package sel_java;

import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HandlingCalendar {

	public static void main(String[] args) {
		String monthNumber = "6";
		String date = "15";
		String year = "2027";
		String expectedList[] = {monthNumber,date,year};
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/manik/OneDrive/Desktop/mani/BrowserExtensions/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class='react-date-picker__inputGroup']")).click();
		driver.findElement(By.cssSelector("span.react-calendar__navigation__label__labelText--from")).click();
		driver.findElement(By.cssSelector("span.react-calendar__navigation__label__labelText--from")).click();
		driver.findElement(By.xpath("//button[text()='"+year+"']")).click();
		driver.findElements(By.cssSelector("button.react-calendar__year-view__months__month")).get(Integer.parseInt(monthNumber)-1).click();
		driver.findElement(By.xpath("//abbr[text()='"+date+"']")).click();
		List<WebElement> actList= driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
		for(int i=0;i<actList.size();i++) {
			System.out.println(actList.get(i).getAttribute("value"));
			Assert.assertEquals(actList.get(i).getAttribute("value"), expectedList[i]);
			
		}
		//driver.close();
	}

}
