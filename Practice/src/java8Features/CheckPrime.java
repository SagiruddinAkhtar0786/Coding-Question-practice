package java8Features;

import java.util.stream.IntStream;

public class CheckPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkPrime(9);
	}

	private static void checkPrime(int n) {
		// TODO Auto-generated method stub
		
		boolean b = n > 1 && IntStream.rangeClosed(2, (int) Math.sqrt(n)).noneMatch(i -> n%i == 0);
		System.out.println(b);
		
		boolean b2 = n > 1 && IntStream.rangeClosed(2, (int) Math.sqrt(n))
				//.filter(i -> n%i != 0)
				.noneMatch(x -> n % x ==0);
				//.orElse(-1);
		System.out.println(b2);
	}

}
