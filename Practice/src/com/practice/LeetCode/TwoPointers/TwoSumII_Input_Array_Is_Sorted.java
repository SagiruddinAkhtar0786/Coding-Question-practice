package com.practice.LeetCode.TwoPointers;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumII_Input_Array_Is_Sorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int [] {1,2,7,11,15};
		int target=9;
		int []IndexArr = twoSumOrderOfn2(arr,target);
		System.out.println("found indexs ::"+Arrays.toString(IndexArr));
		int []Index = twoSumOrderOfN(arr,target);
		System.out.println("found indexs using order of n ::"+Arrays.toString(Index));
		int []idx = twoSumusingMap(arr,target);
		System.out.println(Arrays.toString(idx));
		for(int i :idx)
			System.out.println(i+1);
		//System.out.println(idx[0]+1+", "+idx[1]+1);
	}

	private static int[] twoSumOrderOfN(int[] arr, int target) {
		// TODO Auto-generated method stub
		int left = 0,right=arr.length-1;
		int sum = 0;
		while(left <= right) {
			if(arr[left] + arr[right] == target)
				return new int[] {left+1,right+1};
			else if(arr[left] + arr[right] < target)
				left++;
			else
				right--;
		}
		return new int[] {};
	}

	private static int[] twoSumOrderOfn2(int[] arr, int target) {
		// TODO Auto-generated method stub
		
		for(int i = 0 ; i <arr.length-1 ;i++) {
			for(int j = i+1;j < arr.length ; j++) {
				if(arr[i] + arr[j] == target)
					return new int[] {i+1,j+1};
			}
		}
		return new int [] {};
	}
	
	private static int[] twoSumusingMap(int arr[],int target) {
		HashMap<Integer,Integer>map=new HashMap<>();
	       int [] result=new int[2];
	       for(int i=0;i<arr.length;i++)
	       {
	           if(map.containsKey(target-arr[i]))
	           {
	               result[0]=i;
	               result[1]=map.get(target-arr[i]);
	           }
	           map.put(arr[i],i);
	       }
	       return result;
	}

}
