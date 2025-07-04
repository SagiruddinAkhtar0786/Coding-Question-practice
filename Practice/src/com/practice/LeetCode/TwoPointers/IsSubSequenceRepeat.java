package com.practice.LeetCode.TwoPointers;

public class IsSubSequenceRepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String s = "abc", t = "ahbgdc";
		String s = "abk", t = "ahbgdc";
		
		boolean chk = checkSubSequence(s,t);
		System.out.println(chk);
	}

	private static boolean checkSubSequence(String s, String t) {
		// TODO Auto-generated method stub
		int i = 0, j = 0;
		
		while(i< s.length() && j <t.length()) {
			if(s.charAt(i) == t.charAt(i)) {
				i++;
				j++;
			}else
				j++;
			
			if(j == t.length())
				return true;
		}
		
		return false;
	}

}
