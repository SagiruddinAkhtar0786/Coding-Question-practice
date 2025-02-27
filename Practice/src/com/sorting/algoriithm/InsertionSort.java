package com.sorting.algoriithm;

import java.util.Arrays;

public class InsertionSort {	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//🔹 Time Complexity: O(n²) (Good for small or nearly sorted arrays)
		//🔹 How It Works: Builds the sorted array one element at a time
		
		int arr[] = {1, 4, 2, 6, 1, 8};
		
		for(int i = 1 ; i <arr.length ; i++) {
			int key = arr[i];
			int j = i-1;
			
			while(j >=0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j--;
			}
			
			
			arr[j+1] = key;
		}
		
		
		System.out.println("Insertion Sort :: "+Arrays.toString(arr));
		

	}

}
