package com.practice.LeetCode.SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters_repeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcabcbb";
		int len = LongestSubstringWithoutRepeatingCharacters(str);
		System.out.println("lenth :: "+len);
		
	}
	
	private static int LongestSubstringWithoutRepeatingCharacters(String str) {
		int left = 0 ; 
		int right = 0;
		int maxLength = 0;
		Set<Character> charSet = new HashSet<>();
		while(right < str.length()) {
			if(charSet.contains(str.charAt(right))) {
				charSet.remove(str.charAt(left));
				left++;
			}
			charSet.add(str.charAt(right));
			maxLength  =Math.max(maxLength, right-left+1);
			right++;
		}
		System.out.println(charSet);
		return maxLength;
	}

}
