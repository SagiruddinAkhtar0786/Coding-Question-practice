package com.practice.LeetCode.TwoPointers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumUsingHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] {2,3,4,7,11,15};
		int target = 9;
		int result[] = findTwoSum(arr,target);
		for(int i: result)
			System.out.print((i+1)+",");
		//System.out.println(Arrays.toString(result));
	}

	private static int[] findTwoSum(int[] arr, int target) {
		// TODO Auto-generated method stub
		
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			int complement = target-arr[i]; //9-2=7,9-7=2,
			
			if(map.containsKey(complement))
				return new int[] {map.get(complement),i};
			
			map.put(arr[i], i); //(2,0)(3,1),(4,2),()
				
		}
		return new int [] {};
	}

}
