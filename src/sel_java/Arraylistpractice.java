package sel_java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arraylistpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String b[]= {"rahul","shetty","selenium"};
		
		ArrayList<String> name = new ArrayList<String>();
		name.add("rahul");
		name.add("shetty");
		name.add("selenium");
		System.out.println(name.get(1));
		for(int i=0;i<name.size();i++) {
			System.out.println(name.get(i));
		}
		System.out.println("************************");
		for(String t:name) {
			System.out.println(t);
		}
		//Test item present in ArrayList
		System.out.println(name.contains("selenium"));
		List<String> title=Arrays.asList(b);
		System.out.println(title.get(1));
		
	}

}
