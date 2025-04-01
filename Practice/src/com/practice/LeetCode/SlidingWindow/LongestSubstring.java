package com.practice.LeetCode.SlidingWindow;

import java.util.HashMap;

public class LongestSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "abcabcss";
		HashMap<Character,Integer> map = new HashMap<>();
		int left=0,maxLength=0,start=0;
		String longestSubsttring="";
		for(int right=0;right < s.length() ;right++) {
			char ch = s.charAt(right);
					
			if(map.containsKey(ch) && map.get(ch) >= left) {
				left = map.get(ch)+1;
			}
			
			map.put(ch, right);
			
			if (right - left + 1 > maxLength) {
                maxLength = right - left + 1;
                start = left;
            }
		}
		
		System.out.println(s.substring(start,start+maxLength));

	}

}
