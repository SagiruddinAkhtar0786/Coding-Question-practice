package com.practice.hashMap;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int arr[] = {2,7,11,15};
	int target = 9;
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
	}

}
