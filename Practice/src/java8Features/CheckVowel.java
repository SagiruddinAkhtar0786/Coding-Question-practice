package java8Features;

import java.util.stream.IntStream;

public class CheckVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "sdfg";
		
		boolean chk = str.chars()
					.mapToObj(c -> (char)c)
					.peek(x -> System.out.println(x))
					.anyMatch(c -> "aeiou".indexOf(c) != -1);
		
		System.out.println(chk);
		System.out.println("*************************************************************************");
		String s = "dfgr";
		int index = IntStream.range(0, s.length())
				.filter(i -> "aeiou".indexOf(s.charAt(i)) != -1)
				.peek(x -> System.out.println(x))
				.findFirst() // return first vowel match
				.orElse(-1); // if no vowel return -1
		if(index == -1) {
			System.out.println("Not found Matches...."+index);
		}
		else
			System.out.println("Found Matches at index "+index);
	}

}
