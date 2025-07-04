package com.practice.LeetCode.HashMap.repeatLeatzcode;

import java.util.HashMap;
import java.util.Map;

/*
  	Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
	You must write an algorithm that runs in O(n) time.
 */

public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int arr[] = {100,4,200,1,3,2};
	//	int arr[] = {0,3,7,2,5,8,4,6,0,1};
		int arr[] = {1,0,1,2};
		
		int len = longestConsecutiveLength(arr);
		
		System.out.println(len);

	}

	private static int longestConsecutiveLength(int[] arr) {
		// TODO Auto-generated method stub
		
		Map<Integer,Boolean> exploredInt = new HashMap<>();
		int longestLength= 0;
		for(int i : arr)
			exploredInt.put(i, false);
		
		System.out.println(exploredInt);
		
		for(int num : arr) {
			
			if(exploredInt.get(num)) continue;			
			
			int nextNum = num+1;					
			int currentLength = 1;
			while(exploredInt.containsKey(nextNum) && exploredInt.get(num) == false ) {
					
				exploredInt.put(nextNum, true);
				currentLength++;
				nextNum++;
				
			}
			
			int prevNum = num-1;
			
			while( exploredInt.containsKey(prevNum) && exploredInt.get(prevNum)  == false) {
				exploredInt.put(prevNum, true);
				prevNum--;
				currentLength++;
			}
			System.out.println("=== "+exploredInt);
			
			longestLength =Math.max(currentLength, longestLength);
		}
		
		return longestLength;
	}

}
