package com.practice.LeetCode.HashMap.repeatLeatzcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[] = {"eat","tea","tan","ate","nat","bat"};
		
		
		List<List<String>> list = groupAnagrams(str);
		System.out.println(list);
	}

	private static List<List<String>> groupAnagrams(String[] str) {
		// TODO Auto-generated method stub
		
		Map<String , List<String>> map = new HashMap<>();
		for(int i = 0 ; i < str.length ;i++) {
			String freqStr = getFreqOfString(str[i]);
			System.out.println(freqStr);
			
			if(map.containsKey(freqStr)) {
				map.get(freqStr).add(str[i]);
			}
			else {
				List<String> lst = new ArrayList<>();
				lst.add(str[i]);
				map.put(freqStr, lst);
			}
			
		}
		return new ArrayList<>(map.values());
	}
	
	private static String getFreqOfString(String s) {
		
		int arr[] = new int[26];
		
		
		
		for(int i = 0 ; i < s.length(); i++) {
			char ch = s.charAt(i);
			arr[ch-'a']++;
		}
		StringBuilder sb = new StringBuilder();
		char c = 'a';
		for(int i = 0 ; i < arr.length ; i++) {
			//char ch = s.charAt(i);
			sb.append(c++);
			sb.append(arr[i]);
		}
		return sb.toString();
	}

}
