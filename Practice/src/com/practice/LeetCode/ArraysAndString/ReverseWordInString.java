package com.practice.LeetCode.ArraysAndString;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class ReverseWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String str = "the sky is blue";
		String str = "  hello world  ";
		
		String revStr =reverseWords(str);
		
		System.out.println("Modified String :: "+revStr+">>");
		String revStr8 =reverseWordsusingJava8(str);
		System.out.println("Reveresed String using Java 8 :: "+revStr8);
	}

	private static String reverseWordsusingJava8(String str) {
		// TODO Auto-generated method stub
		
		String revStr =Arrays.stream(str.trim().split("\\s+"))
				.collect(Collectors.collectingAndThen(Collectors.toList(), list ->{
					Collections.reverse(list);
					return String.join(" ", list);
				}));
		
		
		return revStr;
	}

	private static String reverseWords(String str) {
		String ModifiedStr = str.trim();
		System.out.println(ModifiedStr);
		// TODO Auto-generated method stub
		String strArr[] = ModifiedStr.split("\\s+");
		
		System.out.println(Arrays.toString(strArr));
		
		StringBuilder revStr = new StringBuilder();
		
		for(int i = strArr.length-1 ; i>=0 ;i--) {
			revStr.append(strArr[i]);
			
			if(i != 0)
				revStr.append(" ");
		}
		
		return revStr.toString();
	}

}
