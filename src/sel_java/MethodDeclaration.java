package sel_java;

public class MethodDeclaration {

	public static void main(String[] args) {
		
		MethodDeclaration b = new MethodDeclaration();
		String methodtext = b.method1();//calling same class normal method
		System.out.println(methodtext);
		String method2text = method2();//calling same class static method
		System.out.println(method2text);
		ExcliplicitMethodClass c = new ExcliplicitMethodClass();
		c.explicitmethod();//calling outside class normal method
		method3();//calling same class static method
		ExcliplicitMethodClass.exmethod2();//calling outside class static method
	}
	
	public String method1() {
		System.out.println("hello world");
		return "rahul shetty";
	}
	public static String method2(){
		System.out.println("static method output");
		return "selenium";
	}
	public static void method3() {
		System.out.println("method 3");
	}
}
