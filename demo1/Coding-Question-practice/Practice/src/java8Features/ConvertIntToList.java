package java8Features;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ConvertIntToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 123454321;
		
		List<Integer> lst = String.valueOf(num)
						.chars() // get Ascii value
						.map(c -> c-'0') //converts Ascii to int = 49-48 = 1
						.boxed()
						.collect(Collectors.toList());
		
		List<Integer> lst1 = String.valueOf(num)
				.chars() // get Ascii value
				.map(c -> c-'0') //converts Ascii to int
				//.boxed()
				.mapToObj(x-> x)
				.collect(Collectors.toList());
		
		//List<Integer> modifiedInt = Stream.of(num)

		
		System.out.println(lst1);

	}

}
