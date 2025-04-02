package com.practice.LeetCode.HashMap;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String pattern = "abba", s="dog cat cat dog";
		
		boolean chk = checkingPattern(pattern,s);
		if(chk)
			System.out.println("true");
		else
			System.out.println("false");

	}

	private static boolean checkingPattern(String pattern, String s) {
		// TODO Auto-generated method stub
		Map<Character,String> char_map = new HashMap<>();
		Map<String,Character> word_map = new HashMap<>();
		
		String words[] = s.split(" ");
		if(pattern.length() != words.length)
			return false;
		
		for(int i = 0 ; i<words.length;i++) {
			char ch = pattern.charAt(i);
			String word = words[i];
			
			if(!char_map.containsKey(ch)) {
				if(!word_map.containsKey(word)){
					char_map.put(ch, word);
					word_map.put(word, ch);
				}else {
					return false;
				}
			}else {
				String mappedStr = char_map.get(ch);
				if (!mappedStr.equals(word))
                    return false;
			}
		}
		return true;
	}

}
