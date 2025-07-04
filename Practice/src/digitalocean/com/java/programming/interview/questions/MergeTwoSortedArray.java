package digitalocean.com.java.programming.interview.questions;

import java.util.Arrays;

public class MergeTwoSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = new int[]{1,2,3,4,5,6};
		int arr2[] = new int[]{3,4,5,6,7,8,9};
		
		int i= 0,j = 0 , k=0;
		int mergeArray[] = new int[arr1.length + arr2.length];
		while(i < arr1.length && j < arr2.length) {
			if(arr1[i] <= arr2[j])
				mergeArray[k++] = arr1[i++];
			else
				mergeArray[k++] =arr2[j++];
		}
		while(i < arr1.length) {
			mergeArray[k++] =arr1[i++];
		}
		
		while(j < arr2.length) {
			mergeArray[k++] = arr2[j++];
		}
		
		System.out.println("Merged Array :: \n"+Arrays.toString(mergeArray));
		

	}

}
