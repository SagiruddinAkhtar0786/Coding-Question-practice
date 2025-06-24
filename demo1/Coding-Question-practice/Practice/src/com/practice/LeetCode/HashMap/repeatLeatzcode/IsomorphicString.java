package com.practice.LeetCode.HashMap.repeatLeatzcode;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "eggeq" , t = "adda";
		
		boolean b = isIsomorphic(s,t);
		System.out.println(b);
	}
	
	public static boolean isIsomorphic(String s, String t) {
		
		
		if(s.length() != t.length()) return false;
		Map<Character,Character> map= new HashMap<>();
		
		for(int i=0; i <s.length() ;i++) {
			char sKey = s.charAt(i);
			char tKey = t.charAt(i);
			if(!map.containsKey(sKey)) {
				if(!map.containsValue(tKey)) {
					map.put(sKey, tKey);
				}
				else
					return false;
			}else {
				char mappedVal = map.get(sKey);
				if(mappedVal != tKey)
					return false;
			}
		}
		return true;
	}

}
