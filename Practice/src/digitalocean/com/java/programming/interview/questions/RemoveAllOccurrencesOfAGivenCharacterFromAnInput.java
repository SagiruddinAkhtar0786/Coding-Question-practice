package digitalocean.com.java.programming.interview.questions;

import java.util.stream.Collectors;

public class RemoveAllOccurrencesOfAGivenCharacterFromAnInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Sagiruddin Akhtar";
		char c = 'a';
		//System.out.println(c);
		
		String ModifiedString = str.replaceAll(Character.toString(c), "");
		System.out.println("ModifiedString >> "+ModifiedString);
		String Mstr = str.replace("a", "");
		System.out.println(Mstr);
		
		removecharusingJava8(str,c);
		
		
		
	}
	
	private static void removecharusingJava8(String str, char c) {
		String result = str.chars() //str.chars() converts the string into an IntStream, where each character is represented by its ASCII (Unicode) integer value.
				//.peek(x->System.out.println(x+" ..."))
				.filter(ch ->ch != c)//.peek(System.out ::println)//c is a character, but when we compare ch != c, Java automatically converts c to its ASCII value.
				.mapToObj(ch ->String.valueOf((char)ch))//.peek(x-> System.out.println(x+"+"))
				.collect(Collectors.joining());
		
		System.out.println("After Removing charcter :: "+result);
	}

}
