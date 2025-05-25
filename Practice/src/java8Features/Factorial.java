package java8Features;

import java.util.stream.IntStream;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;

		int result = IntStream.rangeClosed(1, n).reduce(1, (a, b) -> a * b);
		System.out.println("factorial :: " + result);
		// reduce(identity, accumulator)
		/*
		 * ✅ Step-by-step example (n = 5): Start with identity = 1
		 * 
		 * Apply:
		 * 
		 * 1 * 1 = 1
		 * 
		 * 1 * 2 = 2
		 * 
		 * 2 * 3 = 6
		 * 
		 * 6 * 4 = 24
		 * 
		 * 24 * 5 = 120
		 * 
		 * So, factorial :: 120
		 * 
		 * .reduce(1, (a, b) -> a * b) a is the accumulator (it holds the result of the
		 * previous operations).
		 * 
		 * b is the current element from the stream (the next number being processed).
		 * 
		 * So with each step, a gets updated by multiplying it with the next value b
		 * from the stream.
		 */

		int a = 9, b = 7, c = 3;

		int sum = IntStream.of(a, b, c).reduce(0, (x, y) -> x + y);

		System.out.println("sum of digits :: " + sum);

	}

}
