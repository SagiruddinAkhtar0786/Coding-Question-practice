package com.sorting.algoriithm;

import java.util.Arrays;

public class bubbleSort {

	/*
	 * Bubble Sort Implementation in Java Bubble Sort is a simple sorting algorithm
	 * that repeatedly steps through the list, compares adjacent elements, and swaps
	 * them if they are in the wrong order.
	 * 
	 * 🔹 Time Complexity:
	 * 
	 * Best Case (Already Sorted): O(n) Worst & Average Case: O(n²) Space
	 * Complexity: O(1) (In-place sorting)
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 2, 5, 1, 4, 3, 9 };

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[i]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}

		System.out.println("Sorting using buuble Sort ::: " + Arrays.toString(arr));
	}

}
