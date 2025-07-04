package com.practice.LeetCode.HashMap.repeatLeatzcode;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "anagramwp" , t="maanargwl";
		boolean b = isAnagram(s,t);
		
		System.out.println("using map "+b);
		boolean k = isAnagramUsingArray(s,t);
		System.out.println("array :: "+k);
		
	}
	private static boolean isAnagramUsingArray(String s, String t) {
		// TODO Auto-generated method stub
		if(s.length() != t.length()) return false;
		
		int[] sfreq = new int[26];
		for(int i = 0 ; i < s.length() ;i++) {
			char ch = s.charAt(i);
			sfreq[ch- 'a']++;
		}
		
		for(int i = 0 ; i < t.length() ;i++) {
			char ch = t.charAt(i);
			sfreq[ch- 'a']--;
			
			if(sfreq[ch- 'a'] < 0)
				return false;
		}
		
		return true;
	}
	private static boolean isAnagram(String s, String t) {
		// TODO Auto-generated method stub
		if(s.length() != t.length()) return false;
		Map<Character,Integer> sMap = new HashMap<>();
		Map<Character,Integer> tMap = new HashMap<>();
		
		for(int i = 0 ; i < s.length() ; i++) {
			char ch1 = s.charAt(i);
			char ch2 = t.charAt(i);
			
			sMap.put(ch1, sMap.getOrDefault(ch1, 0)+1);
			tMap.put(ch2, tMap.getOrDefault(ch2, 0)+1);
			
		}
		return sMap.equals(tMap);

	
	}

}
