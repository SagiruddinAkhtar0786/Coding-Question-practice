package com.practice.hashMap;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int arr[] = {2,7,11,15};
	int target = 11;
	
	
	int left = 0;
	int right = arr.length-1;
	int index1,index2;
	while(left < right) {
		int sum = arr[left] +arr[right];
		
		if(sum == target) {
			index1 = left+1;
			index2 = right+1;
			System.out.println(index1+","+index2);
			return;
		}else if(sum < target) {
			left++;
		
		}else {
			right--;
		}
	}
	
	
	int index[] = findTwoSum(arr,target);
	if(index.length != 0) {
		System.out.println(index[0]+","+index[1]);
	}else {
		System.out.println("No index found");
	}
	
	}

	private static int[] findTwoSum(int[] arr, int target) {
		// TODO Auto-generated method stub
		
		int left = 0;
		int right = arr.length-1;
		
		while(left < right) {
			int sum = arr[left]+arr[right];
			if(sum == target) {
				return new int[] {left+1,right+1};
			}else if(sum< target ) {
				left++;
			}
			else
				right--;
		}
		return new int [] {};
	}

}
