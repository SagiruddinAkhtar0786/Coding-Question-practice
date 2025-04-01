package com.practice.LeetCode.HashMap;

import java.util.HashMap;
import java.util.Map;

public class RansomeNote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ransomeNote = "aaba",magazine="aabad";
		
		Map<Character,Integer> count = new HashMap<>();
		
		for(char c : magazine.toCharArray())
			count.put(c, count.getOrDefault(c, 0)+1);
		
		for(char c : ransomeNote.toCharArray()) {
			if(!count.containsKey(c) || count.get(c) == 0) {
				System.out.println(" word can not be prepard");
				return ;
			}
			
			count.put(c, count.get(c)-1);
			
		}
		System.out.println("yes word prepared");

	}

}
