package com.practice.LeetCode.HashMap.repeatLeatzcode;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pattern = "abba", s = "dog cat cat dog";

		boolean b = wordPattern(pattern, s);
		
		System.out.println(b);

	}

	private static boolean wordPattern(String pattern, String s) {
		// TODO Auto-generated method stub
		
		
		String words[] = s.split(" ");

		Map<Character, String> map = new HashMap<>();

		for (int i = 0; i < pattern.length(); i++) {
			char ch = pattern.charAt(i);
			String word = words[i];

			if (!map.containsKey(ch)) {
				if (!map.containsValue(word)) {
					map.put(ch, word);
				} else
					return false;
			}
			else {
				String mappedValue = map.get(ch);
				
				if(!mappedValue.equals(word))
					return false;
			}
		}
		return true;
	}

}
