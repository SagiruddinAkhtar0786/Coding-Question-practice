package com.practice.LeetCode.ArraysAndString;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6,7};
		int step = 3;
		//output :: 5671234
		System.out.println("Actual Array :: "+Arrays.toString(arr));

		rotateArrayByStep(arr,step);
		//System.out.println("Rotated Array :: "+Arrays.toString(arr));

	}

	private static void rotateArrayByStep(int[] arr, int k) {
		// TODO Auto-generated method stub
		int start = 0, end = arr.length-1;
		k = k  % arr.length;  // for condition nums = [-1] k =2 now k = will be 1 for this condition

		
		rotatestepWise(arr,start,end);
		rotatestepWise(arr,start,k-1);
		rotatestepWise(arr,k,end);
		
		System.out.println("Rotated Array :: "+Arrays.toString(arr));

	}

	private static void rotatestepWise(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		
		int temp=0;
		//int i = 0 , j = arr.length-1;
		while(start <= end) {
			temp = arr[start];
			arr[start++] = arr[end];
			arr[end--] = temp;
		}
		
	}

}
