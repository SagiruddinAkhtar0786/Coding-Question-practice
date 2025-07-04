package com.practice.LeetCode.HashMap.repeatLeatzcode;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int n = 19;
		//int n =68;
		//int n = 20;
		int n = 4; // repeats
		
		
		boolean one = happyNumber(n);
		
		if(one)
			System.out.println("yes above number is happy number");
		else
			System.out.println("No above number is not a happy number");
	}

	private static boolean happyNumber(int n) {
		// TODO Auto-generated method stub
		
		Set<Integer> usedInteger = new HashSet<>();
		while(true) {
			int sum = 0;
			while(n!=0) {
				sum += Math.pow(n%10, 2.0);
				n /=10;
			}
			if(sum == 1)
				return true;
			
			n = sum;
			
			if(usedInteger.contains(n))
				return false;
			
			usedInteger.add(n);
			System.out.println(usedInteger);

		}
		//return true;
		
	}

}
