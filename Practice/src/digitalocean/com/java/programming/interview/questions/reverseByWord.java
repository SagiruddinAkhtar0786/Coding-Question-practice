package digitalocean.com.java.programming.interview.questions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class reverseByWord {
	
	
	public static void reverseByWord(String s) {
		String k =s.trim();
		String[] remSpace = s.trim().split("\\s+");
		System.out.println("remSpace >> "+Arrays.toString(remSpace));
		String a= Arrays.stream(s.trim().split("\\s+")).collect(Collectors.joining(" ")) ;  
		System.out.println("k : "+k);
		
		String cleanedStr = Arrays.stream(s.trim().split("\\s+")).collect(Collectors.joining(" ")); 
		// "\\s used to remoev only leading and trainling space but \\s+  removed the mid spacess also"
                
		System.out.println("cleanedStr >> "+cleanedStr);
		String [] strArr = s.trim().split("\\s+");
		System.out.println("strArr >>> "+Arrays.toString(strArr));
		StringBuilder sb = new StringBuilder();
		for(int i = strArr.length-1 ; i >=0 ; i--) {
			sb.append(strArr[i]);
			
			if(i > 0) sb.append(" ");
		}
		System.out.println(sb.toString());
	}
	public static void reverseByWOrdUsingStream (String s) {
		
		String reverse = Arrays.stream(s.trim().split("\\s+")) // Step 1: Split the string into words
			    .collect(Collectors.collectingAndThen(Collectors.toList(), lst -> { // Step 2: Convert to List & Reverse
			        Collections.reverse(lst);
			        return String.join(" ", lst); // Step 3: Join the words back into a single string
			    }));

			System.out.println("reverse >> " + reverse);

		List<String> lstStr = Arrays.asList(s.trim().split("\\s+"));
		
		String RevStr = lstStr.stream()
				.collect(Collectors.collectingAndThen(Collectors.toList(),
						lst ->{							
							Collections.reverse(lst);
							return String.join(" ", lst);
							
						}));
		System.out.println(" RevStr >> "+RevStr);
		
	}

	public static void main(String[] args) {
		
		String str = "    My name is Sagiruddin    Akhtar";
		
		System.out.println("*****************************reverse Word by Word(normal process) *********************************");
		reverseByWord(str);
		System.out.println("*****************************reverse Word by Word (using Stream) *********************************");
		
		reverseByWOrdUsingStream(str);

		// TODO Auto-generated method stub

	}

}
