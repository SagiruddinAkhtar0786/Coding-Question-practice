package java8Features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.OptionalInt;

public class SecondHighest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 9, 67, 4, 8, 2, 56, 100, 102, 104 };

		int secondHighest = Arrays.stream(arr).distinct().boxed().sorted((a, b) -> b - a).skip(1).findFirst()
				.orElseThrow(() -> new RuntimeException("no second largest elemetn"));

		System.out.println(" secondHighest value :: " + secondHighest);
        // Highest
        OptionalInt max = Arrays.stream(arr).max();
        max.ifPresent(val -> System.out.println("Highest: " + val));
        
        
     // Second highest (distinct values)
        Integer secondHighestn = Arrays.stream(arr)
            .distinct()
            .boxed()
            .sorted(Comparator.reverseOrder())
            .skip(1)
            .findFirst()
            .orElse(null);

        System.out.println("Second Highest: " + secondHighestn);


	}

}
