package com.practice.hashMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int arr[] = {2,7,11,15};
	int target = 9;
	
	int index[] = findTwoSum(arr,target);
	if(index.length != 0) {
		System.out.println(index[0]+","+index[1]);
	}else {
		System.out.println("No index found");
	}
	
	// if not sorted
	
	int indexArr[] = findTwoSumUsingMap(arr,target);
	System.out.println("indexArr :: "+Arrays.toString(indexArr));
	for(int i = 0 ; i < indexArr.length;i++) {
		System.out.println("right >> "+indexArr[i]);
		
	}
	if(indexArr.length != 0) {
		System.out.println("wrong >> "+index[0]);
		System.out.println("wrong >> "+index[1]);
	}else {
		System.out.println("No index found");
	}
	
	}

	private static int[] findTwoSumUsingMap(int[] arr, int target) {
		// TODO Auto-generated method stub
		Map<Integer,Integer> map = new HashMap<>();
		int indexArr[] = new int[2];
		for(int i = 0 ; i < arr.length ; i++) {
			if(map.containsKey( target- arr[i])) {
				indexArr[0] = map.get(target-arr[i]);
				indexArr[1] = i;
				
			}
			
			map.put(arr[i], i);
		}
		return indexArr;
	}

	private static int[] findTwoSum(int[] arr, int target) {
		// TODO Auto-generated method stub
		
		int left = 0;
		int right = arr.length-1;
		
		while(left < right) {
			int sum = arr[left]+arr[right];
			if(sum == target) {
				return new int[] {left+1,right+1};
			}else if(sum< target ) {
				left++;
			}
			else
				right--;
		}
		return new int [] {};
	}

}
