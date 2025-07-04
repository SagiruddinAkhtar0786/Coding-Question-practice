package digitalocean.com.java.programming.interview.questions;

import java.util.stream.IntStream;

public class reverseNumber {
	
	static int a = 2345;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int original_Number =12345;
		int tem = original_Number;
		int rem,sum=0;
		
		while(tem > 0) {
			rem = tem %10;
			sum = (sum*10)+rem;
			tem = tem/10;
		}

		System.out.println("Original Number : "+original_Number +" ==> And  Reversed number : "+sum);
		System.out.println();
		
		
		reverseUsingString(123456789);
		
		reverseUsingJava8(123456);
	}

	private static void reverseUsingString(int a) {
		// TODO Auto-generated method stub
		
	//	Integer.parseInt(a);
		String convertedString = Integer.toString(a);
		String Sr = String.valueOf(a);

		StringBuilder sb1 = new StringBuilder(Sr);
		System.out.println("sr >> "+sb1.reverse());
		
		StringBuilder sb = new StringBuilder(convertedString).reverse();
		System.out.println("reversed Integer using Integer.toString() method >> "+sb);
		System.out.println();

		
		
	}
	
	public static void reverseUsingJava8(int number) {
		
		// from java9 we can use our below approcah
		/*
		 * int reversed = IntStream.iterate(number, n -> n != 0, n -> n / 10) // 1.
		 * Generate stream of digits .map(n -> n % 10) // 2. Extract last digit of each
		 * number .reduce(0, (sum, digit) -> sum * 10 + digit); // 3. Reconstruct the
		 * reversed number
		 * 
		 * System.out.println("Reversed Number java 9 >> " + reversed);
		 */
		
		// for jav 8
		
        int reversedd = IntStream.iterate(number,  n -> n / 10)// generate values
        		.limit(6) // Stop at limt 6        		
                .map(n -> n % 10) // retrieve the sream of remiders line6,5,4,3,2,1
                .reduce(0, (rev, digit) -> rev * 10 + digit); //first rev = 0, digit = 6

        System.out.println("Reversed Number: " + reversedd);
        
        
        
        
	}

}
