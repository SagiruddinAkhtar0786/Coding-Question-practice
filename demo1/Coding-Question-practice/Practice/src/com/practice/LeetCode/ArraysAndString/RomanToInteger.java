package com.practice.LeetCode.ArraysAndString;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Character, Integer> romanPairs = new HashMap<Character, Integer>();
		romanPairs.put('I', 1);
		romanPairs.put('V', 5);
		romanPairs.put('X', 10);
		romanPairs.put('L', 50);
		romanPairs.put('C', 100);
		romanPairs.put('D', 500);
		romanPairs.put('M', 1000);
		String s = "MCDXLIV"; // output :1444
		// String s = "MCMXCIV"; // output : 1994
		int intValue = romanToInt(romanPairs, s);

		System.out.println(s + " :: " + intValue);

	}

	public static int romanToInt(Map<Character, Integer> romanPairs, String s) {
		int result = romanPairs.get(s.charAt(s.length() - 1));

		for (int i = s.length() - 2; i >= 0; i--) {
			if (romanPairs.get(s.charAt(i)) > romanPairs.get(s.charAt(i + 1)))
				result += romanPairs.get(s.charAt(i));
			else
				result -= romanPairs.get(s.charAt(i));
		}

		return result;
	}

}
