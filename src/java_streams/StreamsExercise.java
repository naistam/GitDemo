package java_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StreamsExercise {
	@Test
	public void regular() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");
		//Count the numbers of names starting with Alphabet "A"in list.
		int count = 0;
		for(int i=0;i<names.size();i++) {
			String actualName = names.get(i);
			if(actualName.startsWith("A")) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	@Test
	public void StreamsEx() {
		ArrayList<String> names1 = new ArrayList<String>();
		names1.add("Abhijeet");
		names1.add("Don");
		names1.add("Alekhya");
		names1.add("Adam");
		names1.add("Ram");
		long n = names1.stream().filter(s->s.startsWith("A")).count();
		//System.out.println(n);
		
		long num = Stream.of("Abhijeet","Don","Alekhya","Adam","Ram").filter(s->
		{
			s.startsWith("A");
			return true;
		}).sorted().count();
		//System.out.println(num);
		//names1.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		names1.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
	}
	
	@Test
	public void StreamMap() {
		ArrayList<String> names1 = new ArrayList<String>();
	names1.add("Abhijeet");
	names1.add("Don");
	names1.add("Alekhya");
	names1.add("Adam");
	names1.add("Ram");
		//print names which have last letter as "a" with Uppercase
			
		/*Stream.of("Abhjeeth","Don","Alekhaya","Adam","Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
				.forEach(s->System.out.println(s));*/
		//print all names and make it uppercase
		/*Stream.of("Abhjeeth", "Don", "Alekhaya", "Adam", "Rama").map(s->s.toUpperCase()
				).forEach(s->System.out.println(s));*/
		//print names which have first letter as a with uppercase and sorted
		List<String> names3 = Arrays.asList("Azbhijeeth","Don","Alekhya","Adam","Rama");
		names3.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		//Merging 2 different lists		
		Stream<String> newStream = Stream.concat(names1.stream(), names3.stream());
		//newStream.sorted().forEach(s->System.out.println(s));
		boolean flag = newStream.anyMatch(s->s.equalsIgnoreCase("Adam"));
		//System.out.println(flag);
		Assert.assertTrue(flag);
	}
	
	@Test
	public void StreamCollect() {
		
		List<String> l= Stream.of("Abhijeeth","Don","Alekhya","Adam","Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
				.collect(Collectors.toList());
		System.out.println(l.get(0));
		
		
		List<Integer> values = Arrays.asList(3,2,2,7,5,1,9,7);
		//print Unique number from this way
		//sort the array
		//values.stream().distinct().forEach(s->System.out.println(s));
		List<Integer> li = values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(li.get(2));
	}}