package com.practice.LeetCode.TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoSumReapeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int [] nums = {2,7,11,15};
		int [] nums = {2,3,4};
		int index[] = SumTwo(nums,6);
		System.out.println(Arrays.toString(index));
	}

	private static int[] SumTwo(int[] nums,int target) {
		// TODO Auto-generated method stub
		int left = 0 ,right = nums.length-1;
		
		while(left < right) {
			int sum = nums[left] + nums[right];
			
			if(sum == target) {
				return new int[] {left+1,right+1};
			}else if(sum < target) {
				left++;
			}
			else {
				right--;
			}
		}
		
		return new int[] {};
	}

}
