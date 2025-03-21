package com.practice.LeetCode;

public class JUmpGameII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] {2,3,0,1,4};

		int minNumJump = findMinNumOfJump(arr);
		System.out.println(" minNumJump >> "+minNumJump);
	}

	private static int findMinNumOfJump(int[] arr) {
		// TODO Auto-generated method stub

		int reach = 0;
		int totalJump = 0;
		int lastJupIdx = 0;

		for (int i = 0; i <= arr.length; i++) {
			reach = Math.max(reach, i + arr[i]);

			if (i == lastJupIdx) {

				lastJupIdx = reach;
				totalJump++;

				if (reach >= arr.length - 1) {
					return totalJump;
				}
			}

		}
		return totalJump;
	}

}
