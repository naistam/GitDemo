package sel_java;

public class StringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String is an object//String literal
		String s5="hello";
		
		//new
		String s2=new String("Welcome");
		String s3=new String("Welcome");
		
		String s="Rahul Shetty Academy";
		String[] splittedstring = s.split("Shetty");
		System.out.println(splittedstring[0]);
		System.out.println(splittedstring[1]);
		System.out.println(splittedstring[1].trim());
		
		for(int i=s.length()-1;i>=0;i--) {
			System.out.println(s.charAt(i));
		}
	}

}
