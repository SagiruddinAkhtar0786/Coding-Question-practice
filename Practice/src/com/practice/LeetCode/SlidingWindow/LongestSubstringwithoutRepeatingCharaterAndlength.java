package com.practice.LeetCode.SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringwithoutRepeatingCharaterAndlength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "dabcabcdebd";
		
		int left = 0;
		int start = 0;
		int maxLength = 0;
		
		
		Map<Character,Integer> map = new HashMap<>();
		for(int right  = 0 ; right < s.length() ; right++) {
			char ch = s.charAt(right);
			
			if(map.containsKey(ch) && map.get(ch) >= left)
				left = map.get(ch) + 1;
			
			
			map.put(ch, right);
			if(right - left + 1 > maxLength)
			{
				maxLength = right - left + 1;
				start = left;
			}
		}
		
		System.out.println("MaxLenght : "+maxLength + "substring :: "+s.substring(start,start+maxLength));
	}

}
