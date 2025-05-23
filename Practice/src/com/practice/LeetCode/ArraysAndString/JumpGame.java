package com.practice.LeetCode.ArraysAndString;

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
			if (reach >= arr.length-1) {
				return true;
			}
		}

		return false;
	}

}
