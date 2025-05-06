package java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ConvertArrayToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] intArr = { 1, 2, 3, 4, 5 };

		//List<Integer> lint = new ArrayList<>(Arrays.asList(intArr));
		
		List<Integer> lst = Arrays.stream(intArr).boxed().collect(Collectors.toList());
		System.out.println("int to list :: "+lst);
		
		//List<Integer> stremOf = Stream.of(intArr)	.mapToObj(i -> i).collect(Collectors.toList());
		
		List<Integer> lint = IntStream.of(intArr)  // or Arrays.stream(intArr)
                .mapToObj(Integer::valueOf)
                .collect(Collectors.toList());
		System.out.println(lint);
		
		
		List<Integer> lint1 = IntStream.of(intArr)
                .mapToObj(i -> i)
                .collect(Collectors.toList());
		
		System.out.println(lint1);


	}

}
