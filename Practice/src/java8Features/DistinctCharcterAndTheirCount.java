package java8Features;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DistinctCharcterAndTheirCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "asdfgASDFGasdfg";

		System.out.println("=======charcterCountUsingJava8 ========");

		charcterCountUsingJava8(str);
		
		int arr[] = {1,2,3,4,5,1,2,62,2,4};
		charcterCountUsingJava8try(arr);
		
		
		int num = 121112345;
		charcterCountUsingJava8tryInt(num);		

	}

	private static void charcterCountUsingJava8tryInt(int num) {
		
		String str = String.valueOf(num);
		
		Map<Character,Long> charCount = str.chars()
										.mapToObj(x -> (char)x) 
										.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(charCount);
	}

	private static void charcterCountUsingJava8try(int[] arr) {
		// TODO Auto-generated method stub
		
		Map<Integer,Long> intCount = Arrays.stream(arr) // returns IntStream
									//.boxed() // converts to Stream<Integer>
								//	.mapToObj(x ->x)
								.mapToObj(Integer :: valueOf)
									.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println("int count "+intCount);
		
		
		 Map<Integer,Long> intCountLinkedHashMap = Arrays.stream(arr) // returns IntStream
									.boxed() // converts to Stream<Integer>
									.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap :: new ,Collectors.counting()));
		
		System.out.println("intCountLinkedHashMap >> "+intCountLinkedHashMap);
		
		
		
		 Map<Integer, Long> frequencyMap = IntStream.of(arr) // creates an IntStream from int[]
            .boxed() // converts IntStream to Stream<Integer>
            .collect(Collectors.groupingBy(
                Function.identity(), // group by the number itself
                Collectors.counting() // count how many times each number appears
            ));

        System.out.println(frequencyMap);
		 
		
		
		 
		
		
		
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
