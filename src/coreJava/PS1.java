package coreJava;

import org.testng.annotations.Test;

public class PS1 extends PS{
	
	@Test
	public void testrun() {
		PS2 ps2 = new PS2(3);//Parameterized constructor
		//int a=3;
		doThis();
		System.out.println(ps2.increment());
		System.out.println(ps2.decrement());
		
		System.out.println(ps2.multiplyThree());
		
		
	}

}
