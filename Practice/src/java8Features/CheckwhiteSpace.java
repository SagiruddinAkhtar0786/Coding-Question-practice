package java8Features;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CheckwhiteSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "sagiruddin Akhtar";
		char[] charArr = str.toCharArray();
		
		
		StringBuilder sb =new StringBuilder();
		
		String sb1 ="";
		
		for(char c : charArr) {
			if(!Character.isWhitespace(c)) {
				sb.append(c);
			}
		}
		sb1 = IntStream.range(0, str.length())
						.filter(x -> str.charAt(x) != ' ')
						.mapToObj(i-> str.charAt(i))// or
						//.mapToObj(i-> (char)i)
						.map(String :: valueOf)
						.collect(Collectors.joining());
		
		System.out.println("sb1 :: "+sb1.toString());
		
		StringBuilder sb2 = new StringBuilder();
		
		String ModifiedString = str.trim()
				.chars()  // return unicode values for every Charcter
				.filter(x -> !Character.isWhitespace(x)) // Checks for that unicode there is any whitespace
				.mapToObj(x -> (char)x) // converts again all unicode back to character
				.map(x -> String.valueOf(x)) //maps to string each charcter
				//.map(String :: valueof)
				.collect(Collectors.joining()); // joins all char string to one after another
		
		System.out.println("ModifiedString >> "+ModifiedString);
		
		System.out.println("********************************************************");
		String ss ="sag iruddin akhtar";
		boolean test = ss.chars()
				.mapToObj(x -> (char)x)
				.anyMatch(x -> " ".indexOf(x) != -1);
		if(test)
		System.out.println("yes whiteSpace is there");
		
		int index = IntStream.range(0, ss.length())
				.filter(x -> " ".indexOf(ss.charAt(x)) != -1)
				.findFirst().orElse(-1);
		System.out.println("space index at "+index);
				
						
			

	}

}
