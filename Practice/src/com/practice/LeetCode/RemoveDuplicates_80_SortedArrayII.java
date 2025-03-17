package com.practice.LeetCode;

import java.util.Arrays;

public class RemoveDuplicates_80_SortedArrayII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {0,0,1,1,1,1,2,3,3,8};
		
		
		int count = RemoveDuplicatesyII(arr);
		System.out.println("count :: "+count);
		
		System.out.println(Arrays.toString(arr));
	}

	private static int RemoveDuplicatesyII(int[] arr) {
		// TODO Auto-generated method stub
		int j = 0;
		for(int i = 0 ; i <arr.length ;i++) {
			int n = arr[i];
			if(i <2 || n != arr[j-2]) {
				arr[j++] = n;
			}
		}
		
		return j;
	}

}
