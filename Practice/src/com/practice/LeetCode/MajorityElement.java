package com.practice.LeetCode;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] { 2, 2, 1, 1, 1, 2, 2 };

		findMajorityElementUsingNormalMethod(arr);
		int MajorEle = findMajorityElementUsingLinearTimeAndInO1Space(arr);
		
		System.out.println("Majority Element : "+MajorEle);
		
		findMajorityElementUsingJava8(arr);


	}

	private static void findMajorityElementUsingJava8(int[] arr) {
		// TODO Auto-generated method stub

		Map<Integer,Long> count = Arrays.stream(arr)
				.boxed()
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		//Function.identity() → Groups elements by their own value.
		//Collectors.counting() → Counts occurrences of each element.
		
	     System.out.println("frequency count using java 8 :: "+count);
	     
	     int majorityElement = Collections.max(count.entrySet(), Map.Entry.comparingByValue()).getKey();
	     Long maxFrequency = Collections.max(count.values());
	     
	     System.out.println("Element Frequencies: " + count);
	        System.out.println("Majority Element: " + majorityElement + " with frequency: " + maxFrequency);
	     
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

			// finding max now among all	
				
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
