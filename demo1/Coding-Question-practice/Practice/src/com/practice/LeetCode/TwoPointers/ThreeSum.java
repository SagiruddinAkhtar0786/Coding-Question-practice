package com.practice.LeetCode.TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<List<Integer>> listt =takeList();		
		System.out.println("Testing either set is converted to List or not : "+listt);
		
		// start 3sum Problem
		int nums[] = {-1,0,1,2,-1,-4};
		List<List<Integer>> list = find3Sum(nums);
		System.out.println("List triplets :: "+list);
		

	}

	public static List<List<Integer>> find3Sum(int nums[]){
		
		int sum = 0;
		//int left = 
		Arrays.sort(nums);
		Set<List<Integer>> result = new HashSet<>();
		for(int i = 0 ; i<nums.length-2;i++) {
			int left = i+1, right = nums.length-1;
			while(left < right) {
				sum = nums[i]+nums[left]+nums[right];
				if(sum == 0) {
					result.add(Arrays.asList(nums[i],nums[left],nums[right]));
					left++;
					right--;
				}
				else if(sum < 0)
					left++;
				else
					right--;
			}
		}
		return new ArrayList<>(result);
	}
	
	private static List<List<Integer>> takeList() {
		// TODO Auto-generated method stub
		
		List<List<Integer>> list = new ArrayList<>();
		Set<List<Integer>> set= new HashSet<>();
		
		List<Integer> lst = Arrays.asList(1,2,3,4);
		List<Integer> lst1 = Arrays.asList(1,2,3,4);

		List<Integer> lst2 = Arrays.asList(1,2,3,4,5);

		/*
		 * list.add(lst); list.add(lst2); list.add(lst1); System.out.println(list);
		 */
		set.add(lst2);
		set.add(lst1);
		set.add(lst);
		System.out.println(set);

		return new ArrayList<>(set);
	}

}
