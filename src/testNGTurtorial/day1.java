package testNGTurtorial;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day1 {
	@AfterTest
	public void lastExecution() {
		System.out.println("I will execute Last");
	}
  @Test
  public void demo() {
	  System.out.println("hello");
  }
  
  @AfterSuite
  public void aftSuite() {
	  System.out.println("I am the No.1 from the Last");
  }
  
  @Test
  public void secondTest() {
	  System.out.println("bye");
  }
}
