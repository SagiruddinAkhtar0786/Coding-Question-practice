package com.sorting.algoriithm;

import java.util.Arrays;

public class bubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 2, 5, 1, 4, 3, 9 };

		for (int i = 0; i < arr.length - 1; i++) {
			for(int j = i+1 ; j<arr.length ; j++) {
				if(arr[j] < arr[i]) {
					int temp = arr[j];
					arr[j]= arr[i];
					arr[i] = temp;
				}
			}
		}
		
		System.out.println("Sorting using buuble Sort ::: "+Arrays.toString(arr));
	}

}
