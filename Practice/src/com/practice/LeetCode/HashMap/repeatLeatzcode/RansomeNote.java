package com.practice.LeetCode.HashMap.repeatLeatzcode;

import java.util.HashMap;
import java.util.Map;

public class RansomeNote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ransomeNote = "aabad" , magazine="aabad";
		
		Map<Character,Integer> count = new HashMap<>();
		
		for(char ch : magazine.toCharArray())
			count.put(ch, count.getOrDefault(ch ,0)+1);
		
		for(char ch : ransomeNote.toCharArray()) {
			if(!count.containsKey(ch) || count.get(ch) == 0 ) {
				System.out.println("word can not be prepared ... ");
				return;
			}
			
			count.put(ch, count.get(ch)-1);
		}
		
		System.out.println("words can be prepared...");
	}

}
