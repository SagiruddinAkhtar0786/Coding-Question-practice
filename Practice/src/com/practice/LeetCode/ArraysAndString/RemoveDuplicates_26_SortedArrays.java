package com.practice.LeetCode.ArraysAndString;

import java.util.Arrays;

public class RemoveDuplicates_26_SortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {1,2,2,2,3,4,5,5,6,7,8,8,9};
		int count = removeDublicates(nums);
		System.out.println("count : "+count);
		//System.out.println(Arrays.toString(nums));
		int nums1[] = {1,2,2,2,3,4,5,5,6,7,8,8,9};

		int count1 = removeDublicates1(nums1);
		System.out.println("count 1 : "+count1);
		
		
		
	}
//123345
	//11123
	private static int removeDublicates1(int[] nums) {
		// TODO Auto-generated method stub
		int count = 0;
		int j = 0;
		for(int i = 1 ; i<nums.length ; i++) {
			if(nums[i] != nums[j]) {				
				nums[++j] = nums[i];
			}
		}
		
		System.out.println(Arrays.toString(nums));
		return j+1;
	}

	private static int removeDublicates(int[] nums) {
		// TODO Auto-generated method stub
		int count = 0,j;
		for(int i = 0 ; i<nums.length-1 ; i++) {
			j = i+1;
			if(nums[i] != nums[j]) {
				nums[count++] = nums[i];
				//j++;
			}
		}
		
		nums[count++] = nums[nums.length-1];
		System.out.println(Arrays.toString(nums));

		return count;
	}

	

}
