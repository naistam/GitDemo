package testNGTurtorial;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	
	@BeforeClass
	public void befoclas() {
		System.out.println("before executing any method in the class");
	}
	
  @Parameters({"URL","APIKey/usrname"})
  @Test
  public void webloginCarLoan(String Urlname,String Key) {
	  System.out.println("webloginCar");
	  System.out.println(Urlname);
	  System.out.println(Key);
  }
  @BeforeMethod
  public void beforeevrymethod() {
	  System.out.println("I will execute before executing every test method in day3 class");
  }
  @AfterMethod
  public void aftereverymethod() {
	  System.out.println("I will execute after executing every test method in day3 class");
  }
  @AfterClass
  public void aftercls() {
	  System.out.println("After executing all methods in a class");
  }
  @Test(groups= {"Smoke"})
  public void MobileloginCarLoan() {
	  System.out.println("MobileloginCar");
  }
  @Test(enabled=false)
  public void MobileSignInCarLoan() {
	  System.out.println("MobileSignInCarLoan");
  }
  @BeforeSuite
  public void InitialMethodSuite() {
	  System.out.println("I am the No.1");
  }
  @Test(dataProvider = "getData")
  public void MobileSignOutCarLoan(String Username, String Password) {
	  System.out.println("MobileSignOutCarLoan");
	  System.out.println(Username);
	  System.out.println(Password);
  }
  @Test(dependsOnMethods={"webloginCarLoan","MobileSignOutCarLoan"})
  public void APICarLoan() {
	  System.out.println("APICarLoan");
  }
  
  @DataProvider
  public Object[][] getData(){
	  //1st Combination of Username and Password good credit history = row
	  //2nd Combination of Username and Password - no credit history
	  //3rd Combination of Username and Password - Fraudulent Credit History 
	  Object[][] data = new Object[3][2];
	  data[0][0] = "FirstUserName";
	  data[0][1] = "FirstPassword";
		//columns in the row are nothing but values for that particular combination(row)
	  
	  data[1][0] = "SecondUserName";
	  data[1][1] = "SecondPassword";
	  
	  data[2][0] = "ThirdUserName";
	  data[2][1] = "ThirdPassword";
	return data;
	  
  }
}
