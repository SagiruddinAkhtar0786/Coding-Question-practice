package digitalocean.com.java.programming.interview.questions;

import java.util.Arrays;

public class MergeSort {
	
	
	private static void divideArray(int arr[]  ,int start ,int end) {
		
		if(start < end) {
			int mid = (start+end)/2;
			divideArray(arr,start,mid);
			divideArray(arr,mid+1,end);
			mergeDivdedArray(arr,start,end,mid);
			//System.out.println("merged Array :: "+Arrays.toString(arr));
		}
	}

	private static void mergeDivdedArray(int arr[], int start,int end,int mid) {
		int i = start , j = mid + 1, k = 0;
		int mergeArray[] = new int [end - start +1];
		
		while( i<= mid && j <= end) {
			if(arr[i] <= arr[j])
				mergeArray[k++] = arr[i++];
			else 
				mergeArray[k++] = arr[j++];
		}
		while(i <= mid)
			mergeArray[k++] = arr[i++];
		while(j <= end)
			mergeArray[k++] = arr[j++];
		
		System.out.println("merged Array... :: "+Arrays.toString(arr));
		
		for(int a = 0 , b = start;b <= end ; a++,b++) {
			arr[b] = mergeArray[a];
		}
		

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		///
		/*
		 * Merge sort is one of the most efficient sorting algorithms. It works on the principle of
		 *  “divide and conquer”. It is based on the idea of breaking down a list into several 
		 *  sub-lists until each sub-list consists of a single element, and then merging those 
		 *  sub-lists in a manner that results in a sorted list. The following example code shows one 
		 *  way to use merge sort:*/
		
		
		int arr[] = {6,3,6,2,8,6,0,10,2,4,12};
		
		divideArray(arr,0,arr.length-1);
		 
		System.out.println("Sorted  array >> "+Arrays.toString(arr));


	}

}

