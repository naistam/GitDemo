package sel_java;

public class Exercise {

	public static void main(String[] args) {
		int a[]={11,12,13,14,15};
        System.out.println("First Number: "+a[0]);
        System.out.println("Last number: "+a[a.length-1]);
        System.out.println("Reverse order of an array: ");
       for(int i=a.length-1;i>=0;i--){
           System.out.println(a[i]);
       }
      System.out.println("total numbers: "+a.length);

	}

}
