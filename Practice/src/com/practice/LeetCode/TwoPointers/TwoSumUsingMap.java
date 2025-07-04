package com.practice.LeetCode.TwoPointers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumUsingMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,7,11,15};
		int target = 9;
		
		int index[] = findTarget(arr,target);
		
		System.out.println(Arrays.toString(index));
		for(int i : index) {
			System.out.print(i+1+" ");
			
		}
		
	}

	private static int[] findTarget(int[] arr, int target) {
		// TODO Auto-generated method stub
		Map<Integer,Integer> map = new HashMap<>();
		int idx=0;
		for(int num : arr) {
			
			if(map.containsKey(target-arr[idx])) {
				return new int[] {map.get(target-arr[idx]),idx};
			}
			
			map.put(num, idx);
			idx++;
		}
		
		return new int[] {};
		
	}

}
