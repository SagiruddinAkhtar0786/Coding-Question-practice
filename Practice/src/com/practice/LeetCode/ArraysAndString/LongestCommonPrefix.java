package com.practice.LeetCode.ArraysAndString;

import java.util.Arrays;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//longestCommonPrefix();
		
		String strArr[] = {"flower","flow","flight"};
		String prefix = longestCommonPrefix(strArr);
		System.out.println("Longest Common prefix :: "+prefix);
		
		
		
		
	}
	private static String longestCommonPrefix(String [] strArr) {
		
		Arrays.sort(strArr);
		
		System.out.println("after sort :: "+Arrays.toString(strArr));
		char [] firstStr = strArr[0].toCharArray();
		char [] lastStr = strArr[strArr.length-1].toCharArray();
		
		StringBuilder prefix = new StringBuilder();
		for(int i = 0 ; i<strArr.length;i++) {
			if(firstStr[i] != lastStr[i])
				break;
			
			prefix.append(firstStr[i]);
		}
		
		return prefix.toString();
	}
}
