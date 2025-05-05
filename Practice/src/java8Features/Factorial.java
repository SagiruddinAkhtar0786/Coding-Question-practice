package java8Features;

import java.util.stream.IntStream;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5;
		
		int result = IntStream.rangeClosed(1, n)
					.reduce(1, (a,b) -> a*b);
		
		System.out.println(result);
		
		int a = 9, b = 7,c = 3;
		
		int sum = IntStream.of(a,b,c).reduce(0, (x,y) -> x+y);
		
		System.out.println(sum);

	}

}
