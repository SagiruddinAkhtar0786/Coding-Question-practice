package com.practice.LeetCode.HashMap;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "ab", t = "a";
		
		boolean isAnagram = chkValidAnagram(s,t);
		if(isAnagram)
			System.out.println("true");
		else
			System.out.println("false");
		
		boolean checkAnagram = chkValidAnagramUsingmap(s,t);
		if(checkAnagram)
			System.out.println(" >>>true");
		else
			System.out.println(">>> false");
		
	}

	private static boolean chkValidAnagramUsingmap(String s, String t) {
		// TODO Auto-generated method stub
		Map<Character,Integer> map = new HashMap<>();
		if(s.length() != t.length())
            return false;
		for(char ch : s.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		for(char ch : t.toCharArray()) {
			if(!map.containsKey(ch) || map.get(ch) == 0) {
				return false;
			}
			map.put(ch, map.get(ch)-1);
				
		}
		
		return true;
	}

	private static boolean chkValidAnagram(String s, String t) {
		// TODO Auto-generated method stub
		
		  if(s.length() != t.length())
	            return false;
		
		int arr[] = new int[26];
		for(int i = 0 ; i < s.length();i++) {
			char ch = s.charAt(i);
			arr[ch-'a']++;
		}
		for(int i = 0 ; i < t.length();i++) {
			char ch = t.charAt(i);
			arr[ch-'a']--;
			if(arr[ch-'a'] < 0)
				return false;
		}

		
		return true;
	}

}
