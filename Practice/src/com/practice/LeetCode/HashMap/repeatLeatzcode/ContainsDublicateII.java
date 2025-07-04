package com.practice.LeetCode.HashMap.repeatLeatzcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 
 Given an integer array nums and an integer k, return true if there are
  two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
 
 */
public class ContainsDublicateII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[] = {1,2,3,4,1};
		int k = 3;
		
		boolean check = containsNearByDublicate(nums,k);
		System.out.println(check);
		boolean checkSet = containsNearByDublicateUsingSet(nums,k);
		System.out.println(checkSet);

	}

	private static boolean containsNearByDublicateUsingSet(int[] nums, int k) {
		// TODO Auto-generated method stub
		
		Set<Integer> set = new HashSet<>();
		
		for(int i = 0 ; i < nums.length ; i++) {
			if(set.contains(nums[i]))
				return true;
			
			set.add(nums[i]);
			
			if(set.size() > k)
				set.remove(nums[i - k]);
		}
		return false;
	}

	private static boolean containsNearByDublicate(int [] nums,int k) {
		
		Map<Integer,Integer> map = new HashMap<>();
		
		int index = 0;
		for(int n : nums) {
			if(map.containsKey(n) && Math.abs(index - map.get(n)) <= k)
				return true;
			else {
				map.put(n, index);
				index++;
			}
			
		}
		
		return false;	
	}
}
