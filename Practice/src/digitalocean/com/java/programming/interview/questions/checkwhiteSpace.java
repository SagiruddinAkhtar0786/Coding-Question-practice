package digitalocean.com.java.programming.interview.questions;

import java.util.stream.Collectors;

public class checkwhiteSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str0 = "  sagiruddin Akhtar";
		String str = str0.trim();
		char [] charArr = str.toCharArray();
		
		
		StringBuilder sb = new StringBuilder();
			for(char c : charArr) {
				if(!Character.isWhitespace(c))
					sb.append(c);
			}
		
		
		System.out.println(sb.toString());
		
		String result = str.trim().replaceAll("\\s+", "");
		System.out.println("result >> "+result);
		
		
		// using java8
		
		String ModifiedString = str.trim()
				.chars()  // return unicode values for every Charcter
				.filter(x -> !Character.isWhitespace(x)) // Checks for that unicode there is any whitespace
				.mapToObj(x -> (char)x) // converts again all unicode back to character
				.map(x -> String.valueOf(x)) //maps to string each charcter
				//.map(String :: valueof)
				.collect(Collectors.joining()); // joins all char string to one after another
		
		System.out.println("ModifiedString >> "+ModifiedString);


	}

}
