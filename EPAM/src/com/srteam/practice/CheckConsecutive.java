package com.srteam.practice;

import java.util.HashSet;
import java.util.Set;

public class CheckConsecutive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	int arr[] = {5,2,6,4,3,9};
		int arr[] = {6,5,3,5};
		boolean check = isConsecutive(arr);
		System.out.println(check);
	}
	
	
	public static boolean isConsecutive(int nums[]) {
		
		if (nums == null || nums.length == 0) return false;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);

            // Check for duplicates
            if (!set.add(num)) return false;
        }

        return max - min + 1 == nums.length;
		//return false;
		
	}

}


/*
 private static boolean checkElementsConsecutive(int[] a, int n) {
		Arrays.sort(a);//33,44,45,46,47,48
		for(int i =1; i<n; i++) {
			if(a[i] != a[i-1]+1) {
				return false;
			}
		}
		return true;
	}
 */
