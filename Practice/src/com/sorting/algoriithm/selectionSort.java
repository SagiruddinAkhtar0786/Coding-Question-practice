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


/*

import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int arr[], int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    public static void merge(int arr[], int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int leftArr[] = new int[n1];
        int rightArr[] = new int[n2];

        for (int i = 0; i < n1; i++) leftArr[i] = arr[left + i];
        for (int j = 0; j < n2; j++) rightArr[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) arr[k++] = leftArr[i++];
            else arr[k++] = rightArr[j++];
        }

        while (i < n1) arr[k++] = leftArr[i++];
        while (j < n2) arr[k++] = rightArr[j++];
    }

    public static void main(String[] args) {
        int arr[] = {1, 4, 2, 6, 1, 8};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}


 */
