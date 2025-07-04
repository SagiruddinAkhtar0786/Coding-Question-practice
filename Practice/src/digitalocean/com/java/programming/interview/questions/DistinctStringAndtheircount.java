package digitalocean.com.java.programming.interview.questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DistinctStringAndtheircount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fruits[] = { "banana", "grapes", "abnana", "banana", "Orange", "Orange", "abnana" };
		System.out.println("=======charcterCountUsingJavaNormalmethod I ========");

		countFruitsByNormalmethod(fruits);
		System.out.println("=======charcterCountUsingJavaNormalmethod II ========");

		countFruitsByNormalmethodII(fruits);
		
		System.out.println("=======charcterCountUsingJavaNormalmethod ========");

		countFruitsByjava8(fruits);

	}

	private static void countFruitsByjava8(String[] fruits) {
		// TODO Auto-generated method stub
		Map<String, Long> fruitCount = Arrays.stream(fruits)
								.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(fruitCount);
		
	}

	private static void countFruitsByNormalmethodII(String[] fruits) {
		// TODO Auto-generated method stub
		Map<String, Integer> fruitCount = new HashMap<>();

		for(String f : fruits) {
			fruitCount.put(f, fruitCount.getOrDefault(f, 0)+1);
		}
		System.out.println(fruitCount);
	}

	private static void countFruitsByNormalmethod(String[] fruits) {
		// TODO Auto-generated method stub
		Map<String, Integer> fruitCount = new HashMap<>();

		for (String str : fruits) {
			if (fruitCount.containsKey(str))
				fruitCount.put(str, fruitCount.get(str) + 1);
			else
				fruitCount.put(str, 1);
		}

		System.out.println(fruitCount);
	}

}
