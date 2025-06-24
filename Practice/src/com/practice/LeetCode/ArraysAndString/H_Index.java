package com.practice.LeetCode.ArraysAndString;
/*
 Input: citations = [3,0,6,1,5]
Output: 3
Explanation: [3,0,6,1,5] means the researcher has 5 papers in total and 
each of them had received 3, 0, 6, 1, 5 citations respectively.
Since the researcher has 3 papers with at least 3 citations each and the 
remaining two with no more than 3 citations each, their h-index is 3.
 */
import java.util.Arrays;

public class H_Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int H_index[] = {3,7,6,9,5};
		
		int findHidx = finding_HIndex(H_index);
		System.out.println("H Index :: "+findHidx);
		
	}

	private static int finding_HIndex(int[] citations) {
		// TODO Auto-generated method stub
		System.out.println("cittation length :: "+citations.length);
		int bhucket[] = new int[citations.length+1];
		System.out.println("bhucket length :: "+bhucket.length);

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
