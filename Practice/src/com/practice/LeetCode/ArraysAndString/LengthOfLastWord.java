package com.practice.LeetCode.ArraysAndString;

public class LengthOfLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "   fly me   to   the moon  ";
		int len = lengthOfLastWord(str);
				System.out.println("length of String " +len);


	}

	private static int lengthOfLastWord(String str) {
		// TODO Auto-generated method stub

		String strArr[] = str.split("\\s+");

		String LastWord = strArr[strArr.length - 1];
		System.out.println(LastWord.length());
		return LastWord.length();
	}

}
