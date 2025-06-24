package digitalocean.com.java.programming.interview.questions;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DistinctCharcterAndTheirCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcdABCD";

		char[] ch = str.toCharArray();
		System.out.println("=======charcterCountUsingJavaNormalmethod ========");

		charcterCountUsingJavaNormalmethod(str,ch);
		
		System.out.println("=======charcterCountUsingJavaNormalmethod II ========");

		charcterCountUsingJavaNormalmethodII(str,ch);
		System.out.println("=======charcterCountUsingJava8 ========");

		charcterCountUsingJava8(str);

	}

	private static void charcterCountUsingJavaNormalmethodII(String str, char[] ch) {
		// TODO Auto-generated method stub
		Map<Character,Integer> charCount = new HashMap<>();	
		
		for(char c : ch) {
			charCount.put(c, charCount.getOrDefault(c, 0)+1);
		}
		
		System.out.println(charCount);
		
	}

	private static void charcterCountUsingJavaNormalmethod(String str, char[] ch) {
		// TODO Auto-generated method stub
		Map<Character, Integer> charCount = new HashMap<>();

		for (char c : ch) {
			if (charCount.containsKey(c))
				charCount.put(c, charCount.get(c) + 1);
			else
				charCount.put(c, 1);
		}

		System.out.println(charCount);
	}

	private static void charcterCountUsingJava8(String str) {
		Map<Character, Long> charCount = str.chars() // convert string to intStream which return unicode
				.mapToObj(ch -> (char) ch) // Converts each ASCII value into a Character object.
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		// groupingBy(Function.identity()) → Groups by the character itself.
		// Collectors.counting() → Counts the occurrences of each character.

		System.out.println(charCount);
	}

}
