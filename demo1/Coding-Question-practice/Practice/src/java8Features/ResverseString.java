package java8Features;

import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ResverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "   Saagiruddin   Akhtar   ";
		String ModifiedStr = str.replace(" ","");
		
		
		String revStr = ModifiedStr.chars()
						.mapToObj(c -> (char)c)
						.collect(Collectors.collectingAndThen(
								Collectors.toList(),list ->{
									Collections.reverse(list);
									
									return list.stream().map(String :: valueOf).collect(Collectors.joining());
								}));
		
		System.out.println(revStr);
		
		/*String sa = IntStream.range(0, str.length()).peek(x->System.out.println(x)) //generates a stream of integers from 0 to str.length() like 0,1,2,3,4,,,,,,17
				.mapToObj(i -> str.charAt(str.length()-1-i)) //each indices converts to Object and returns reverse character r a t h k a......S
				//.map(String :: valueOf) // each charcter converts to String "r" ,"a" ,"t"........."s"
				.map(n->String.valueOf(n))
				.collect(Collectors.joining());// each Strig of Charcter joining "rathkar......s"
		*/
	}

}
