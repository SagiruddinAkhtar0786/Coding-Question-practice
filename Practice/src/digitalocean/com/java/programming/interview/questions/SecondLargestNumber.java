package digitalocean.com.java.programming.interview.questions;

import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {9,67,4,8,2,56,100,102,104};
		
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		
		for(int i : arr) {
			if(i > max) {
				secondMax = max;
				max = i;
			}
			else if(i < max) {
				secondMax = i;
			}
		}
		
		System.out.println("second Maximum value :: "+secondMax);
		
		// using java 8
		
		int secondHighest = Arrays.stream(arr)
							.distinct()
							.boxed()
							.sorted((a,b) ->b-a)
							.skip(1)
							.findFirst()
							.orElseThrow(() -> new RuntimeException("no second largest elemetn"));
		
		System.out.println(" secondHighest value :: "+secondHighest);

	}

}
