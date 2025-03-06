package digitalocean.com.java.programming.interview.questions;

/*public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}*/


//package com.sorting.algoriithm;

import java.util.Arrays;
/*
 Merge Sort is a "divide and conquer" algorithm that:  https://www.youtube.com/watch?v=aDX3MFL0tYs

Divides the array into two halves.
Recursively sorts each half.
Merges the two sorted halves to get the final sorted array.
The recursion continues until the subarrays have only one element (base case)
 */

public class MergeSort {

	public static void mergeSort(int arr[], int left, int right) {
		
		System.out.println("mergeSort >> "+Arrays.toString(arr) +" left : "+left+" right : "+right);

		if (left < right) {
			// int mid = left+(right - left)/2;
			int mid = (left + right) / 2;

			mergeSort(arr, left, mid);
			mergeSort(arr, mid + 1, right);

			merge(arr, left, right, mid);

		}
	}

	public static void merge(int arr[], int left, int right, int mid) {

		System.out.println(Arrays.toString(arr) +" left : "+left+" right : "+right+" mid : "+mid);
		int i = left, j = mid + 1, k = 0;
		int mergeArr[] = new int[right - left + 1];
		while (i <= mid && j <= right) {
			if (arr[i] <= arr[j])
				mergeArr[k++] = arr[i++];
			else
				mergeArr[k++] = arr[j++];
		}
		// Copy remaining elements from left subarray (if any)
		while (i <= mid) {
			mergeArr[k++] = arr[i++];
		}

		// Copy remaining elements from right subarray (if any)
		while (j <= right) {
			mergeArr[k++] = arr[j++];
		}
	//	System.out.println("merged Sorted Array :: " + Arrays.toString(mergeArr));

		// Copy merged elements back to the original array
		for (k = 0, i = left; i <= right; i++, k++) {
			arr[i] = mergeArr[k];
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 🔹 Time Complexity: O(n log n)
		// 🔹 How It Works: Recursively splits the array into halves,
		// sorts, and merges them

		int arr[] = { 1, 4, 2, 6, 1, 8 };
		
		mergeSort(arr, 0, arr.length - 1);

		System.out.println("Sorted Array: " + Arrays.toString(arr));

		//System.out.println("merged Sorted Array :: " + Arrays.toString(mergeArr));

	}

}
