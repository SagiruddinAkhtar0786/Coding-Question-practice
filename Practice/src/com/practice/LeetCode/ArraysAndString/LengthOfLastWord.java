package com.practice.LeetCode.ArraysAndString;

public class LengthOfLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "   fly me   to   the moon  ";
		String strArr[] = str.split("\\s+");
		
		String LastWord = strArr[strArr.length-1];
		System.out.println(LastWord.length());

	}

}
