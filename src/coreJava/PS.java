package coreJava;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class PS {

	public void doThis() {
		System.out.println("I am here");
		System.out.println("I am also here");
		System.out.println("I am also here");
		
		System.out.println("I am always here");
		System.out.println("I am always here");
		System.out.println("I am always here");
		
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
