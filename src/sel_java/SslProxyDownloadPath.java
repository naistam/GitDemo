package sel_java;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SslProxyDownloadPath {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		Proxy proxy = new Proxy();
		proxy.setHttpProxy("192.168.0.100:4444");
		options.setCapability("proxy", proxy);
		Map<String,Object>  prefs = new HashMap<String,Object>();
		prefs.put("download.default_directory","/directory/Path");
		options.setExperimentalOption("prefs", prefs);
		// FirefoxOptions options1 = new FirefoxOptions();
		// options1.setAcceptInsecureCerts(true);
		// EdgeOptions options2 = new EdgeOptions();
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/manik/OneDrive/Desktop/mani/BrowserExtensions/chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://expired.badssl.com/");		
		System.out.println(driver.getTitle());
	}

}
