package com.practice.LeetCode.SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "pwwkew";
		
		int maxLength = LongestSubstringWithoutRepeatingCharactersLength(str);
		System.out.println("MaxLength :: "+maxLength);
		

	}
	
	private static int LongestSubstringWithoutRepeatingCharactersLength(String str) {
		
		int low =0;
		int high = 0;
		int maxLength=Integer.MIN_VALUE;
		
		Set<Character> set = new HashSet<>();
		int currentLength=0;
		while(high < str.length()) {
			//high++;
			//currentLength = high- low;
			while(set.contains(str.charAt(high))) {
				set.remove(str.charAt(low++));
			}
			
			set.add(str.charAt(high));
			
			
			maxLength = Math.max(maxLength, high-low+1);
			high++;
			
		}
		System.out.println(set);
		return maxLength;
	}

}
