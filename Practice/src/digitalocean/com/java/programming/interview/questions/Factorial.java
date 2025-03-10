package digitalocean.com.java.programming.interview.questions;

import java.util.stream.IntStream;

public class Factorial {

	private static int findFactorial(int n) {

		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact *= i;
		}
		return fact;
	}

	private static int factorailUisngRecursion(int n) {

		// int fact = 1;
		if (n <= 1)
			return 1;

		return n * factorailUisngRecursion(n - 1);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;

		int fact = findFactorial(n);
		System.out.println("factorial of a number :: " + fact);

		System.out.println("factorial using Recursion ");

		int factR = factorailUisngRecursion(n);
		System.out.println("factorial using Recursion " + factR);

		// using java8
		/*
		 * .reduce(1, (a, b) -> a * b) performs a reduction operation on the stream. The
		 * reduce function takes two parameters: Identity value (1) → This is the
		 * starting value for multiplication. Binary operation ((a, b) -> a * b) → This
		 * multiplies all elements together. Step-by-step execution for n = 5
		 */

		int result = IntStream.rangeClosed(1, n).reduce(1, (a, b) -> a * b);
		System.out.println("result " + result);

	}

}
