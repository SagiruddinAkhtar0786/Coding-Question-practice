package com.practice.LeetCode.ArraysAndString;

public class FindIndexOTheFirstOccurrenceinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String haystack = "asadbutsad", needle = "sad";
		
		int chk = findIndexOffirstOccurencesOfString(haystack,needle);
		if(chk != -1)
			System.out.println("index of String"+needle +" found at :: "+chk);
		else
			System.out.println("index not found :: ");


	}

	private static int findIndexOffirstOccurencesOfString(String s1, String s2) {
		// TODO Auto-generated method stub
		 if(s1.contains(s2))
			 return s1.indexOf(s2);
		
		return -1;
	}

}
