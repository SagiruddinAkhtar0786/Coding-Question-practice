package com.sorting.algoriithm;

import java.util.Arrays;

public class selectionSort {

	//Time Complexity: O(n²) (Not the best for large arrays) ...
	//How It Works: Finds the  smallest element() and swaps it with the current index => current index will be first loop -i
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,5,1,4,3,9};
		
		for(int i = 0 ; i < arr.length-1 ; i++) {
			int minIndex = i;
			for(int j = minIndex+1 ; j< arr.length;j++) {
				if(arr[j] < arr[minIndex])
					minIndex=j;
			}
			
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
		System.out.println("sorting using Selection Sort ::: "+Arrays.toString(arr));
		
		

	}

}
