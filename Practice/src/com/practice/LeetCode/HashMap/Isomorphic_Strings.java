package com.practice.LeetCode.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Isomorphic_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "paper", t = "title";
		
		boolean chk = IsomorphicString(s,t);
		if(chk)
			System.out.println("true");
		else
			System.out.println("false");
		
		
 
	}

	private static boolean IsomorphicString(String s, String t) {
		// TODO Auto-generated method stub
		Map<Character,Character> char_map1 = new HashMap<>();
		Map<Character,Character> char_map2 = new HashMap<>();
		
		if(s.length() != t.length())
			return false;
		for(int i = 0 ; i < s.length() ;i++) {
			
			char ch1 = s.charAt(i);
			char ch2 = t.charAt(i);
			
			if(!char_map1.containsKey(ch1)) {
				if(!char_map2.containsKey(ch2)) {
					char_map1.put(ch1, ch2);
					char_map2.put(ch2, ch1);
				}
				else
					return false;
			}else {
				char mappedChar= char_map1.get(ch1);
				if(mappedChar != ch2)
					return false;
					
			}
		}
		return true;
	}

}
