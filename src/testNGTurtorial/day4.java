package testNGTurtorial;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {
  @Parameters({"URL"})
  @Test
  public void Webloginhomeloan(String urlname) {
	  //Selenium
	  System.out.println("WebLoginHomePersonalLoan");
	  System.out.println(urlname);
  }
  
  @Test(groups={"Smoke"})
  public void MobileloginHomeLoan() {
	  //Appium
	  System.out.println("MobileloginHome");
  }
  
  @Test
  public void LoginAPIHomeLoan() {
	  //RestAssuredAPI
	  System.out.println("APILoginHome");
  }
}
