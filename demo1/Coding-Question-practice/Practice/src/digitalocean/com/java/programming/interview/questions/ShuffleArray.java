package digitalocean.com.java.programming.interview.questions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.stream.Collectors;

public class ShuffleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = new int[] {1,2,3,4,5,6,7,8,9,10};
		
		Random rand = new Random();
		System.out.println("Original Array :: "+Arrays.toString(arr));

		for(int i = 0; i < arr.length ; i++) {
			int randIndex = rand.nextInt(arr.length); // suppose 5
			
			int temp = arr[randIndex];
			arr[randIndex] = arr[i];
			arr[i] = temp;
			
		}
		
		System.out.println("Shuffled Array :: "+Arrays.toString(arr));
		
		// using Java8
		
		 // Convert array to List, shuffle it, and convert it back to an array
        int[] shuffledArr = Arrays.stream(arr)
                                  .boxed()  // Convert int[] to Stream<Integer>
                                  .collect(Collectors.collectingAndThen(Collectors.toList(), list -> {
                                      Collections.shuffle(list, new Random());
                                      return list;
                                  }))
                                  .stream()
                                  .mapToInt(Integer::intValue)  // Convert back to int[]
                                  .toArray();
        
		System.out.println("Shuffled Array using Java8 :: "+Arrays.toString(shuffledArr));

        

	}

}
