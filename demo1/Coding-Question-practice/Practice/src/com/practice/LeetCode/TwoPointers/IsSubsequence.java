package com.practice.LeetCode.TwoPointers;

public class IsSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc", t = "ahbgdc";
		boolean chk = IsSubSequesce(s,t);
		if(chk)
			System.out.println("yes");
		else
			System.out.println("No");
	}
	
	public static boolean IsSubSequesce(String s,String t) {
		
		
		int i=0,j=0;
		
		while(i<s.length() && j<t.length()) {
			if(s.charAt(i) == t.charAt(j)) {
				i++;
				j++;
			}
			else
				j++;
				
		}
		
		
		return (i==s.length());
	}

}
