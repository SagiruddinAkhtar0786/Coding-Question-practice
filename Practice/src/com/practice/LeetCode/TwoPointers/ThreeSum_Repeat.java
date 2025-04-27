package com.practice.LeetCode.TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum_Repeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int nums[] = {-1,0,1,2,-1,-4};
		int nums[] = {0,1,1};
		
		List<List<Integer>> list =  findThreeSum(nums);
		System.out.println(list);
	}

	private static List<List<Integer>> findThreeSum(int [] nums) {
		// TODO Auto-generated method stub
		
		if(nums.length == 0 || nums.length < 3) return new ArrayList<>();
		
		Arrays.sort(nums);
		
		Set<List<Integer>> set = new HashSet<>();
		
		for(int i = 0 ; i < nums.length-2 ; i++) {
			int left = i+1, right = nums.length-1;
			
			while(left < right) {
				int sum = nums[i] + nums[left] + nums[right];
				
				if(sum == 0) {
					set.add(Arrays.asList(nums[i],nums[left],nums[right]));
					left++;
					right--;
				}else if(sum < 0) {
					left++;
				}else
					right--;
			}
		}
		
		return new ArrayList<>(set);
	}

}
