package com.practice.LeetCode;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] { 2, 2, 1, 1, 1, 2, 2 };

		findMajorityElementUsingNormalMethod(arr);
		int MajorEle = findMajorityElementUsingLinearTimeAndInO1Space(arr);
		
		System.out.println("Majority Element : "+MajorEle);

	}

	private static int findMajorityElementUsingLinearTimeAndInO1Space(int[] arr) {
		// TODO Auto-generated method stub
		int count = 0;
		int cand = 0;

		for (int i = 0; i < arr.length; i++) {
			if (count == 0)
				cand = arr[i];
			if (arr[i] == cand)
				count++;
			else
				count--;
		}
		return cand;
	}

	private static void findMajorityElementUsingNormalMethod(int[] arr) {
		// TODO Auto-generated method stub
		Map<Integer, Integer> count = new HashMap<Integer, Integer>();

		for (int i : arr) {
			if (count.containsKey(i))
				count.put(i, count.get(i) + 1);
			else
				count.put(i, 1);
		}
		System.out.println(count);

		int maxValue = Integer.MIN_VALUE;
		int key = 0;
		int value = 0;
		for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
			if (entry.getValue() > maxValue) {
				key = entry.getKey();
				value = entry.getValue();
			}

		}
		System.out.println("Majority element : " + key + " and its frequency :: " + value);

	}

}
