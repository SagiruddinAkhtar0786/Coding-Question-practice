package java8Features;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DistinctCharcterAndTheirCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "asdfgASDFGasdfg";

		System.out.println("=======charcterCountUsingJava8 ========");

		charcterCountUsingJava8(str);
		charcterCountUsingJava8try(str);

	}

	private static void charcterCountUsingJava8try(String str) {
		// TODO Auto-generated method stub
		
		
		
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
