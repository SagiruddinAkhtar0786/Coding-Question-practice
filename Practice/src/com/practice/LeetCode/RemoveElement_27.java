package com.practice.LeetCode;

import java.util.Arrays;

public class RemoveElement_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,3,6,4,7,3,1,9,9};
		int val = 3;
		
		removeOccurenceOfVal(arr,val);
	}

	
	private static void removeOccurenceOfVal(int arr[],int val) {
		
		int count= 0;
		for(int i = 0 ; i<arr.length;i++) {
			if(arr[i] != val) {
				arr[count++] = arr[i];
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
