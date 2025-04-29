package java8Features;

public class CheckVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "sagiruddinAkhtar";
		
		boolean chk = str.chars()
					.mapToObj(c -> (char)c)
					.peek(x -> System.out.println(x))
					.anyMatch(c -> "aeiou".indexOf(c) != -1);
		
		System.out.println(chk);
	}

}
