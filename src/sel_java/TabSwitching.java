package sel_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabSwitching {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/manik/OneDrive/Desktop/mani/BrowserExtensions/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		//Count of the Link in the Entire Page
		//System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement FooterSection = driver.findElement(By.xpath("//div[@id='gf-BIG']"));
		//Count of links in the footer section of the page
		//System.out.println(FooterSection.findElements(By.tagName("a")).size());
		WebElement col = FooterSection.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[4]/ul"));
		System.out.println("Links in the second column");
		System.out.println(col.findElements(By.tagName("a")).size());
		String BeforeClicking = null;
		String AfterClicking;
		for(int i=0;i<col.findElements(By.tagName("a")).size();i++) {
			if(col.findElements(By.tagName("a")).get(i).getText().equals("Policies")) {
				BeforeClicking = driver.getTitle();
				col.findElements(By.tagName("a")).get(i).click();
				break;
			}
		}
		AfterClicking = driver.getTitle();
		if(BeforeClicking!=AfterClicking) {
			if(driver.getPageSource().contains("Policies")) {
				System.out.println("PASS");
			}
		}
		else {
			System.out.println("FAIL");
		}
	}

}
