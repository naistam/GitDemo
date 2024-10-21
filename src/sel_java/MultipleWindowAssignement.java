package sel_java;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowAssignement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/manik/OneDrive/Desktop/mani/BrowserExtensions/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		Set<String> windlist = driver.getWindowHandles();
		Iterator<String> it = windlist.iterator();
		String parent = it.next();
		String child = it.next();
		driver.switchTo().window(child);
		String childtext = driver.findElement(By.cssSelector("div.example h3")).getText();
		System.out.println(childtext);
		driver.switchTo().window(parent);
		String parenttext = driver.findElement(By.xpath("//div[@id='content']/div[@class='example']/h3")).getText();
		System.out.println(parenttext);
	}

}
