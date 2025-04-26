package com.practice.LeetCode.SlidingWindow;

public class MinimumSizeSubArraySum_Repeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr[] = {2,3,1,2,4,3};
		//int target = 7;
		
		int arr[] = {1,4,4};
		int target = 4;
		
		
		int size = minSubArrayLen(arr,target);
		System.out.println("minimm size subAray :"+size);
	}
	
	private static int minSubArrayLen(int [] nums,int target) {
		
		int low = 0;
		int high = 0;
		int minLength = Integer.MAX_VALUE;
		int currentSum = 0;
		//int currentLength = 0;
		for(int i = 0 ; i < nums.length ; i++) {
			currentSum += nums[i]; 
			high++;
			
			while(currentSum >= target) {
				int currentLength = high - low;
				minLength = Math.min(currentLength, minLength);
				currentSum -= nums[low];
				low++;
			}
		}
		return minLength == Integer.MAX_VALUE ? 0 :  minLength;
	}

}
