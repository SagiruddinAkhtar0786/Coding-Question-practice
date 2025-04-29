package java8Features;

import java.util.Collections;
import java.util.stream.Collectors;

public class ResverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Saagiruddin Akhtar";
		String ModifiedStr = str.replace(" ","");
		
		
		String revStr = ModifiedStr.chars()
						.mapToObj(c -> (char)c)
						.collect(Collectors.collectingAndThen(
								Collectors.toList(),list ->{
									Collections.reverse(list);
									
									return list.stream().map(String :: valueOf).collect(Collectors.joining());
								}));
		
		System.out.println(revStr);
		
	}

}
