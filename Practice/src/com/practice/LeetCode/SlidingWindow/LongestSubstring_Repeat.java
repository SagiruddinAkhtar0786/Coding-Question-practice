package com.practice.LeetCode.SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring_Repeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "sbcdeabcdefabs";
		
		String str =findLongestSubsstring(s);
		System.out.println(" non repating characters :: "+str);

	}

	private static String findLongestSubsstring(String s) {
		// TODO Auto-generated method stub
		
		int start = 0;
		int left = 0;
		int maxLength = 0;
		String substring = "";
		
		Map<Character,Integer> map = new HashMap<>();
		for(int right = 0 ; right < s.length() ;right++) {
			char ch = s.charAt(right);
			
			
			if(map.containsKey(ch) && map.get(ch) >=left) {
				left = map.get(ch)+1;
			}
			map.put(ch, right);
			if(right - left+1 > maxLength) {
				maxLength = right - left+1;
				start = left;
			}
		}
		
		System.out.println("lenght of non repating characters :: "+maxLength);
		return s.substring(start,start+maxLength);
	}

}
