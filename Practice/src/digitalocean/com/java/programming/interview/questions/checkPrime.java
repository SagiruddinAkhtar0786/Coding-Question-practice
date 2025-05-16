package digitalocean.com.java.programming.interview.questions;

import java.util.stream.IntStream;

public class checkPrime {
	private static void cehckPrime(int n) {
		if(n == 0 || n == 1) {
			return;
		}
		if(n == 2) {
			System.out.println("prime");
			return;
		}
		
		for(int i  =2 ; i <= n/2;i++) {
			if(n % i == 0) {
				System.out.println("not Prime");
				return;
			}
		}
		
		System.out.println("its Prime : "+n);
	}

	
	private static boolean checkPrime(int n) {
		if(n ==0 || n==1) {
			return false;
		}
		
		if(n == 2) {
			return true;
		}
		
		for(int i = 2;i<= Math.sqrt(n);i++) { // i <= n/2
			if(n %i ==0)
				return false;
		}
		return true;
	}
	
	
	private static void checkPrimeUsingJava8(int n) {
		if(n <=1) return;
		
		boolean isPrime = n==2 || IntStream.rangeClosed(2, (int )Math.sqrt(n)).noneMatch(i-> n % i ==0);
		System.out.println(isPrime ? "Prime Number":"Not prime Number");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 101;
		System.out.println("++++++++++++++++++++++++++");
		System.out.println("find Prime using Normal Void Return Type");
		System.out.println("++++++++++++++++++++++++++");

		cehckPrime(n);
		System.out.println("++++++++++++++++++++++++++");

		System.out.println("find Prime using Normal Boolean Return Type");

		boolean b = checkPrime(n);
		if(b)
			System.out.println(" ....prime number");
		else
			System.out.println(".... Not a prime");
		
		System.out.println("++++++++++++++++++++++++++");

		System.out.println("find Prime using  Java-8 features");
		checkPrimeUsingJava8(n);
	}

}
