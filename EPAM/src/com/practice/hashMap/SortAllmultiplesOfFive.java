package com.practice.hashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortAllmultiplesOfFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 3, 26, 15, 32, 2, 5, 6, 25 };
		// StringBuilder sb = new StringBuilder();
		List<Integer> ls = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 5 == 0) {
				ls.add(arr[i]);
			}
		}
		//Arrays.sort(arr);
		Collections.sort(ls);
		//ls.sort(null);
		System.out.println(ls);

		int k = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 5 == 0) {
				arr[i] = ls.get(k++);
			}
		}

		System.out.println(Arrays.toString(arr));

	}

}

/*
// Step 1: Collect values divisible by 5
List<Integer> sortedFives = Arrays.stream(arr)
        .filter(x -> x % 5 == 0)
        .sorted()
        .boxed()
        .collect(Collectors.toList());

// Step 2: Replace original array values
int idx = 0;
for (int i = 0; i < arr.length; i++) {
    if (arr[i] % 5 == 0) {
        arr[i] = sortedFives.get(idx++);
    }
}

System.out.println(Arrays.toString(arr));*/