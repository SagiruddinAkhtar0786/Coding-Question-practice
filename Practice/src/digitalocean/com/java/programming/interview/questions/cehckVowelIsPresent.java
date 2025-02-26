package digitalocean.com.java.programming.interview.questions;

import java.util.stream.IntStream;

public class cehckVowelIsPresent {
	
	
	private static boolean checkVowel(String w) {
		
		//int i = 0;
		int index ;
	//	
		
		return w.matches(".*[aeiou].*");
		
		//chek
		//w.mat
	}
	
	
	public static int checkVowelNormalmrthod(String w) {
		for(int  i = 0 ;i<w.length(); i++) {
			
			System.out.println("debug :: "+"aeiou".indexOf(w.charAt(i)));
			if("aeiou".indexOf(w.charAt(i)) != -1)
				return i;
					
		}
		return -1;
		
	}
	private static void checkVowelByjava8Features(String s) {
		boolean b = s
				.chars() // will return indices i.e ASCII value of Each Character
				.mapToObj(i -> (char)(i)) // at each index covrt int to char again 
				.peek(x-> System.out.println("character : "+x))
				.anyMatch(c -> "aeiou".indexOf(c) != -1);
		
		
		if(b)
			System.out.println("found ");
		else
			System.out.println("not found");
		
		
		
		
		int index = IntStream.range(0, s.length())
				.filter(i -> "aeiou".indexOf(s.charAt(i)) != -1)
				.findFirst() // return first vowel match
				.orElse(-1); // if no vowel return -1
		if(index == -1) {
			System.out.println("Not found Matches....");
		}
		else
			System.out.println("Found Matches at index "+index);
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "stgpro";
		boolean chk = checkVowel(word);
	
		if(chk)
			System.out.println("Present");
		else
			System.out.println("not Present");
		
		checkVowelByjava8Features(word);
		
		int idx = checkVowelNormalmrthod(word);
		if(idx == -1)
			System.out.println("Not Found");
		else
			System.out.println("first Vowel found i.e >> "+word.charAt(idx)+ " at Index : "+idx);
		
		
		
	
	}
	
	// java 8
	
	

}
