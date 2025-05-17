package com.practice.LeetCode.HashMap.repeatLeatzcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {11,15,2,7,2};
		int target = 9;
		
		int indexArr[] = findTargetIndex(arr,target);
		System.out.println(Arrays.toString(indexArr));
		

	}
	
	private static int[] findTargetIndex(int arr[] ,int target) {
		
		Map<Integer,Integer> map = new HashMap<>();
		int index[] = new int[2];
		
		for(int i = 0 ; i < arr.length; i++) {
			if(map.containsKey(target-arr[i])) {
				index[0] = map.get(target-arr[i]);
				index[1] = i;
				return index;
			}
			
			map.put(arr[i], i);
		}
		
		return new int[] {};
	}

}
