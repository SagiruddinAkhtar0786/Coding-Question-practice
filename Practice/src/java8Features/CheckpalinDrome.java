package java8Features;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
/*
 * A palindrome is a word, number, phrase, or sequence of characters that reads the same
 *  forward and backward, ignoring spaces, punctuation, and capitalization.
 */
public class CheckpalinDrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 1234321;
		
		checkPalindrome(n);
		
		//String str = "asdfgfdsak";
		String str = "kasdfgfdsak";
		checkPalindromeString(str);

	}
	private static void checkPalindromeString(String str) {
		// TODO Auto-generated method stub
		
		String ModifyStr = IntStream.range(0,str.length())
							.mapToObj(x -> str.charAt(str.length()-1-x))
							.peek(x-> System.out.print(x+" "))
							.map(String :: valueOf)
							.collect(Collectors.joining());
		
		System.out.println(str.equals(ModifyStr));

	}
	private static void checkPalindrome(int num) {
		String str = String.valueOf(num);
		
	/*	String ModifiedStr = IntStream.range(0, str.length())
							.mapToObj(x -> str.charAt(str.length()-1-i))
							//.map(String :: valueOf) // converts each Character to String
							.map(x -> Strign.valueOf(x))
							.collect(Collectors.joining());*/
		
		String ModifiedStr = IntStream.range(0, str.length())
				.mapToObj(i -> str.charAt(str.length() - 1 - i))
				.map(String :: valueOf)
				.collect(Collectors.joining());
		
		System.out.println(str.equals(ModifiedStr));
				
							
		
		
	}

}
