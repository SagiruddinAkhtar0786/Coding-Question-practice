package com.practice.LeetCode;

import java.util.Arrays;

public class MergeSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums1[] = { 2, 4, 5, 0, 0, 0 };
		int m = 3;
		int nums2[] = { 3, 6, 7 };
		int n = 3;

		mergeSortUsingLoop(nums1, nums2, m, n);

		mergeSort(nums1, nums2, m, n);
	}

	private static void mergeSortUsingLoop(int[] nums1, int[] nums2, int m, int n) {
		// TODO Auto-generated method stub
		// with for loop

		for (int t = 0, p = m; t < n; t++) {
			nums1[p] = nums2[t];
			p++;
		}
		Arrays.sort(nums1);
		System.out.println(Arrays.toString(nums1));
	}

	private static void mergeSort(int nums1[], int nums2[], int m, int n) {
		int i = m - 1, j = n - 1, k = m + n - 1;

		while (i >= 0 && j >= 0) {
			if (nums1[i] <= nums2[j])
				nums1[k--] = nums2[j--];
			else
				nums1[k--] = nums1[i--];
		}

		while (j >= 0)
			nums1[k--] = nums2[j--];

		System.out.println(Arrays.toString(nums1));

	}

}
