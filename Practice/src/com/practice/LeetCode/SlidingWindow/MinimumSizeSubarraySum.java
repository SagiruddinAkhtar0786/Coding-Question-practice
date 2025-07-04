package com.practice.LeetCode.SlidingWindow;

public class MinimumSizeSubarraySum {
	public static void main(String[] args) {
		int nums[] = {1,4,4};
		int target = 1;
		
		int count = MinimumSizeSubarraySum(nums,target);
		
		System.out.println("MinimumSizeSubarraySum :: "+count);
	}

	private static int MinimumSizeSubarraySum(int[] nums,int target) {
		// TODO Auto-generated method stub
		
		int minLenWindow= Integer.MAX_VALUE;
		int high=0;
		int low = 0;
		int currentSum = 0;
		while(high < nums.length) {
			currentSum += nums[high];
			high++;
			while(currentSum >= target) {
				int curretnSizeWindow = high - low;
				minLenWindow = Math.min(minLenWindow, curretnSizeWindow);
				
				currentSum -= nums[low];
				low++;
			}
		}
		return minLenWindow == Integer.MAX_VALUE ? Integer.MAX_VALUE:minLenWindow;
	}
}
