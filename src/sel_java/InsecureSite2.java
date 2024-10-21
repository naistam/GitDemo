package sel_java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class InsecureSite2 {

	public static void main(String[] args) {
		//This is not working
		//SSl certificates

		//Desired capabilities=
		//general chrome profile
		//DesiredCapabilities ch = DesiredCapabilities.chrome();
		//ch.acceptInsecureCerts();
		//ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		//ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		ChromeOptions c = new ChromeOptions();
		//c.merge(ch);
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/manik/OneDrive/Desktop/mani/BrowserExtensions/chromedriver.exe");
		WebDriver driver = new ChromeDriver(c);
		driver.manage().window().maximize();
		driver.get("https://expired.badssl.com/");		
		System.out.println(driver.getTitle());

	}

}
