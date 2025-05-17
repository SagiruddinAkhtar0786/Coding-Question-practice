/*
 
 */


package com.practice.LeetCode.TwoPointers;

public class ValidPaalinDromeReapeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String s = "A man, a plan, a canal: Panama";
		String s = "race a car";
		//String s = " ";
		
		boolean check = checkItsValidPalindrome(s);
		System.out.println(check);
	}

	private static boolean checkItsValidPalindrome(String s) {
		// TODO Auto-generated method stub
		String ModifiedStr = s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
		System.out.println("ModifiedStr >> "+ModifiedStr);
		for(int i = 0 , j = ModifiedStr.length()-1 ; i <= j ;i++,j--) {
			if(ModifiedStr.charAt(i) != ModifiedStr.charAt(j))
				return false;
		}
		return true;
	}

}
