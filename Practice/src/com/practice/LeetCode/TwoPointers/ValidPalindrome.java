package com.practice.LeetCode.TwoPointers;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ValidPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "A man, a plan, a canal: Panama";
		String ModifiedString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		System.out.println("ModifiedString >> "+ModifiedString);
		
		boolean checkvalidPalindrome = checkvalidPalindrome(ModifiedString);
		if(checkvalidPalindrome)
			System.out.println(ModifiedString+" The given String is Palindrome : ");
		else
			System.out.println(ModifiedString+" The given String is Not a Palindrome : ");
		
		boolean checkPaliUSingjava8 = checkPaliUSingjava8(ModifiedString);
		if(checkPaliUSingjava8)
			System.out.println(ModifiedString+" The given String is Palindrome using java 8 : ");
		else
			System.out.println(ModifiedString+" The given String is Not a Palindrome : ");

			
	}

	private static boolean checkPaliUSingjava8(String modifiedString) {
		
		String s = IntStream.range(0, modifiedString.length())
				.mapToObj(i->modifiedString.charAt(modifiedString.length()-1-i))
				.map(String :: valueOf)
				.collect(Collectors.joining());
		// TODO Auto-generated method stub
		return s.equals(modifiedString);
	}

	private static boolean checkvalidPalindrome(String s) {
		// TODO Auto-generated method stub
		int i = 0 , j =s.length()-1;
		while(i<=j) {
			if(s.charAt(i++) != s.charAt(j--))
				return false;
		}
		
		
		return true;
	}

}
