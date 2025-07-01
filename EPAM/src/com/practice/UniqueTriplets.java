package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueTriplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {-1,0,1,4,5,-5};
		
		List<List<Integer>> triplets = checkTrplets(arr);
		System.out.println("triplets >> "+triplets);
	}
	
	public static List<List<Integer>> checkTrplets(int nums[]){
		Arrays.sort(nums);

		Set<List<Integer>> set = new HashSet<>();
		for(int i = 0; i < nums.length-2 ; i++) {
			int left = i+1 ,right = nums.length-1;
			
			while(left < right) {
				int sum = nums[left]+nums[right]+nums[i];
				
				if(sum == 0) {
					set.add(Arrays.asList(nums[left],nums[right],nums[i]));
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
