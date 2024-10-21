package selenium4_features;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeLoc2 {

	public static void main(String[] args) throws IOException{
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/manik/OneDrive/Desktop/mani/BrowserExtensions/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		driver.switchTo().newWindow(WindowType.WINDOW);
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> itr = handles.iterator();
		String ParentWindow = itr.next();
		String ChildWindow = itr.next();
		//Switching Window
		driver.switchTo().window(ChildWindow);
		driver.get("https://rahulshettyacademy.com");
		String linktext = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1).getText();
		System.out.println(linktext);
		driver.switchTo().window(ParentWindow);
		WebElement nameBox = driver.findElement(By.cssSelector("[name='name']"));
		nameBox.sendKeys(linktext);
		
		//Screenshot
		File file = nameBox.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("logo.png"));
		//driver.quit();
		//Get Height & Width
		System.out.println(nameBox.getRect().getDimension().getHeight());
		System.out.println(nameBox.getRect().getDimension().getWidth());
	}

}
