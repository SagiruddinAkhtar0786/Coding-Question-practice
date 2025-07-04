package java8Features;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DistinctStringAndtheircount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] fruits = {"banana", "grapes", "abnana", "banana", "Orange", "Orange", "abnana"};
		
		fruitsCountByJava8(fruits);

	}

	private static void fruitsCountByJava8(String[] fruits) {
		// TODO Auto-generated method stub
		
		
		Map<String,Long> fruitCount = Arrays.stream(fruits)
									.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
	/*	Collectors.groupingBy(...)
		Groups elements by a classification function, in this case:

		Function.identity() → returns the fruit itself (i.e., grouping by fruit name).

		So: "apple", "banana", "orange" are the group keys.

		Collectors.counting()
		For each group (each fruit name), it counts how many times that fruit appears.*/
		System.out.println(fruitCount);
		
		Map<String,Long> m = Arrays.stream(fruits).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		 System.out.println("map 000 : "+m);
		
	}

}
