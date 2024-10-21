package sel_java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/manik/OneDrive/Desktop/mani/BrowserExtensions/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input#autosuggest")).sendKeys("ind");
		Thread.sleep(3000);
		List<WebElement> cityList = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
		for(WebElement city: cityList) {
			//System.out.println(city.getText());
			if(city.getText().equalsIgnoreCase("india")) {
				city.click();
				break;
			}
		}
		
	}

}
