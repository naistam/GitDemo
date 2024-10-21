
package sel_java;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabSwitching2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/manik/OneDrive/Desktop/mani/BrowserExtensions/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		// System.out.println("Display all the links on the entire page");
		// System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement ftrSection = driver.findElement(By.xpath("//div[@id='gf-BIG']"));
		System.out.println(ftrSection.findElements(By.tagName("a")).size());
		WebElement col = ftrSection.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[1]/ul"));
		for (int i = 1; i < col.findElements(By.tagName("a")).size(); i++) {
			String clickonlink = Keys.chord(Keys.CONTROL, Keys.ENTER);
			col.findElements(By.tagName("a")).get(i).sendKeys(clickonlink);
			Thread.sleep(5000);
		}
		Set<String> allwindows = driver.getWindowHandles();
		Iterator<String> itr = allwindows.iterator();
		while (itr.hasNext()) {
			driver.switchTo().window(itr.next());
			System.out.println(driver.getTitle());
		}
	}

}
