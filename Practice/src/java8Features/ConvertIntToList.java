package java8Features;

import java.util.List;
import java.util.stream.Collectors;

public class ConvertIntToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 123454321;
		
		/*List<Integer> lst = String.valueOf(num)
						.chars() // get Ascii value
						.map(c -> c-'0') //converts Ascii to int
						.boxed()
						.collect(Collectors.toList());*/
		
		List<Integer> lst = String.valueOf(num)
				.chars() // get Ascii value
				.map(c -> c-'0') //converts Ascii to int
				//.boxed()
				.mapToObj(x-> x)
				.collect(Collectors.toList());

		
		System.out.println(lst);

	}

}
