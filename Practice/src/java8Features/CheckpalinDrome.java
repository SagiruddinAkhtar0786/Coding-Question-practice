package java8Features;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CheckpalinDrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 1234321;
		
		checkPalindrome(n);

	}
	private static void checkPalindrome(int num) {
		String str = String.valueOf(num);
		
	/*	String ModifiedStr = IntStream.range(0, str.length())
							.mapToObj(x -> str.charAt(str.length()-1-i))
							//.map(String :: valueOf) // converts each Character to String
							.map(x -> Strign.valueOf(x))
							.collect(Collectors.joining());*/
		
		String ModifiedStr = IntStream.range(0, str.length())
				.mapToObj(i -> str.charAt(str.length()  - 1 - i))
				.map(String :: valueOf)
				.collect(Collectors.joining());
		
		System.out.println(str.equals(ModifiedStr));
				
							
		
		
	}

}
