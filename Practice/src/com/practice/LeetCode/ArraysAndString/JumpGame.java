package com.practice.LeetCode.ArraysAndString;
/*
 Input: nums = [2,3,1,1,4]
Output: true
Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
 */
public class JumpGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] { 2, 3, 1, 1, 4 };

		boolean reached = reachToEndPoints(arr);
		if (reached)
			System.out.println("yes given arr will reach to end");
		else
			System.out.println("No given arr will not reach to end");

	}

	private static boolean reachToEndPoints(int[] arr) {
		// TODO Auto-generated method stub
		int reach = 0;
		for (int i = 0; i <= reach; i++) {
			reach = Math.max(reach, i + arr[i]);
			System.out.println("reach >> "+reach);
			
			if (reach >= arr.length-1) {
				return true;
			}
		}

		return false;
	}

}
