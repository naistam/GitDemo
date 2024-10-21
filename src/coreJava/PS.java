package coreJava;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class PS {

	public void doThis() {
		System.out.println("I am here");
	}
	
	@BeforeTest
	public void beforerun() {
		System.out.println("Run this First");
	}
	
	@AfterTest
	public void afterRun() {
		System.out.println("Run this Last");
	}
}