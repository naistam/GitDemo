package coreJava;

public class PS3 {
	int a;
	public PS3(int a) {
		this.a=a;
	}
	
	public int multiplyTwo() {
		a=a*2;
		System.out.println(a);
		return a;
	}
	
	public int multiplyThree() {
		a=a*3;
		return a;
	}
}
