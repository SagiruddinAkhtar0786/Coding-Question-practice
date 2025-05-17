package com.practice.LeetCode.ArraysAndString;

import java.util.Arrays;

public class H_Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int H_index[] = {1,0,1};
		
		int findHidx = finding_HIndex(H_index);
		System.out.println("H Index :: "+findHidx);
		
	}

	private static int finding_HIndex(int[] citations) {
		// TODO Auto-generated method stub
		
		int bhucket[] = new int[citations.length+1];
		int count = 0;
		for(int i = 0 ; i <citations.length ;i++) { // finding frequency of each citations paper
			if(citations[i] > citations.length)
				bhucket[citations.length-1]++;
			else
				bhucket[citations[i]]++;

		}
		System.out.println("bhucket :: "+Arrays.toString(bhucket));
		for(int i = bhucket.length-1 ; i>=0 ; i--) {
			count += bhucket[i];
			
			if( count >=i)
				return i;
		}
		
		return 0;
	}

}
