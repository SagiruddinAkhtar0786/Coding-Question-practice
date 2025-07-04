package digitalocean.com.java.programming.interview.questions;

import java.util.Arrays;

public class SumOfElement {

	private static void sumUsingjava8(int arr[]) {
		int sum = Arrays.stream(arr).sum();
		System.out.println("summ>>>> " + sum);

		int sumReduceMethod = Arrays.stream(arr).reduce(0, (a, b) -> a + b); //
		/*
		 * Here,
		 * a = 0 and b = nothing final result for first iteration 0 and a= 0(result) and b =1 now
		 * 0 is the initial value (identity element). (a, b) -> a + b is the accumulator
		 * function, which adds elements one by one.
		 * 
		 */
		System.out.println("sumReduceMethod>>>> " + sumReduceMethod);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int arr1[] = { 1, 2, 3, 45, 6, 7, 8, 0 };
		for (int i : arr1)
			sum += i;

		System.out.println("sum >> " + sum);

		sumUsingjava8(arr1);
	}

}
