package com.practice.LeetCode.ArraysAndString;

public class IntegerToRoman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intCode[] = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		String code[] = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		
		int num = 1994; //MCMXCVI
		
		String roman = intToRoman(intCode,code,num);
		
		System.out.println(num +"::"+roman );
		
	}

	private static String intToRoman(int[] intCode, String[] code, int num) {
		// TODO Auto-generated method stub
		StringBuilder sb =new StringBuilder();
		for(int i = 0 ; i <intCode.length ;i++) {
			while(num >= intCode[i]) {
				sb.append(code[i]);
				num -= intCode[i];
			}
		}
		return sb.toString();
	}

}
