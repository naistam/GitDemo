package sel_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/manik/OneDrive/Desktop/mani/BrowserExtensions/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		//int framesize = driver.findElements(By.tagName("iframe")).size();
		//System.out.println(framesize);
		//driver.switchTo().frame(0);
		driver.switchTo().frame(frameElement);
		WebElement src = driver.findElement(By.cssSelector("div[id='draggable']"));
		WebElement tgt = driver.findElement(By.cssSelector("div[id='droppable']"));
		Actions a = new Actions(driver);
		a.dragAndDrop(src, tgt).build().perform();
		driver.switchTo().defaultContent();
		 

	}

}
