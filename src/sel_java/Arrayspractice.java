package sel_java;

public class Arrayspractice {

	public static void main(String[] args) {
		
		int mynum=5;
		String website="rahulshettyacademy.com";
		char letter='r';
		double dec=5.99;
		boolean mycard=true;
		
		System.out.println(mynum+" is the value stored in mynum variable");
		System.out.println(website);
		
		//Arrays
		int a[]=new int[5];
		a[0]=1;
		a[1]=2;
		a[2]=4;
		a[3]=5;
		a[4]=6;
		
		int arr2[]= {1,2,4,5,6};
		System.out.println(arr2[0]);
		
		//for loop arr.length-5
		for(int b:a) {
			System.out.println(b);
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
		String name[]= {"rahul","shetty","selenium"};
		for(int j=0;j<name.length;j++) {
			System.out.println(name[j]);
		}
		for(String s:name) {
			System.out.println(s);
		}
	}

}
