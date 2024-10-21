package testNGTurtorial;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {
  @Test(groups= {"Smoke"})
  public void plan() {
	  System.out.println("good");
  }
  @BeforeTest
  public void prerequisite() {
	  System.out.println("I will execute it first");
  }
}
