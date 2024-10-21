package sel_java;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class EcommerceMultidataset {

	public static void main(String[] args) throws InterruptedException {
		String items[] = {"Cucumber","Brocolli","Beetroot"};
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/manik/OneDrive/Desktop/mani/BrowserExtensions/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		addItems(driver,items);
	}
		
	public static void addItems(WebDriver driver,String items[]) {
		int j=0;
		
	List<WebElement> productlist = driver.findElements(By.cssSelector("h4.product-name"));
		for(int i=0;i<productlist.size();i++) {
			//Brocolli - 1 Kg
			//Brocolli,    1 kg
			String prod[]=productlist.get(i).getText().split("-");
			String name = prod[0].trim();
			//format it to get actual vegetable name
			//convert array into array list for easy search
			//check whether name you extracted is present in arrayList or not-	
			List itemList = Arrays.asList(items);
			if(itemList.contains(name)) {
				j++;
				//click on Add to cart
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(j==items.length) {
					break;
				}
			}
		}
		
	}

}

