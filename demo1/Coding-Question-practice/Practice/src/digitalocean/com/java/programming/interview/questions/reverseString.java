package digitalocean.com.java.programming.interview.questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class reverseString {
	static String s = "vikas";
	public static void main(String args[]) {
		String str = "welcome";
		StringBuilder sb = new StringBuilder(str);
		System.out.println("******* reverse StringBuilder method 1**************");
		System.out.println(sb.reverse()+" lenght of str = "+str.length());
		 System.out.println();

		System.out.println("******* reverse StringBuilder method , character Array**************");
		StringBuilder sbb = new StringBuilder();
		
		char [] chaArr = str.toCharArray();
		 for(int i = str.length()-1 ; i>=0;  i--) {
			 sbb.append(chaArr[i]);
		 }
		 System.out.println("reversed String >> "+sbb);
		 System.out.println();
		
		System.out.println("******* reverse String Using java 8 features**************");
		
	String sa = IntStream.range(0, str.length()).peek(x->System.out.println(x)) //generates a stream of integers from 0 to str.length() like 0,1,2,3,4,,,,,,17
	.mapToObj(i -> str.charAt(str.length()-1-i)) //each indices converts to Object and returns reverse character r a t h k a......S
	//.map(String :: valueOf) // each charcter converts to String "r" ,"a" ,"t"........."s"
	.map(n->String.valueOf(n))
	.collect(Collectors.joining());// each Strig of Charcter joining "rathkar......s"
	
	System.out.println("reversed String >> "+sa);
	
	//use of convert String
	List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
	List<String> strNumbers = numbers.stream()
	                                 .map(String::valueOf) // Converts Integer to String
	                                 .collect(Collectors.toList());
	System.out.println(strNumbers); // Output: ["1", "2", "3", "4", "5"]

		
		
		
	}
	
	

}
