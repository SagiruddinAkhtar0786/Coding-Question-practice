package com.akhtar.practice1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("for testing purpo hjjjjjjhk");
		System.out.println("ehy it ti running slow");
		System.out.println("again test");
		System.out.println("thids is final tesint");
		
		String s1 = "Sagir";
		String s2 = new String("Sagir");
		String s3 = new String("Sagir");
		System.out.println("a : "+s1.equals(s2));
		System.out.println(s1== s2);
		System.out.println("a : "+s3.equals(s2));
		System.out.println(s3 == s2);
		System.out.println(s1 == s2.intern());
		
		
		//***********************************************************
		
		//convert array to list
		
		String [] str = {"sagir", "salim","raju","rajnish"};
		int [] intArr = {1,2,3,4,5};
		
	//	List<Integer> lint = new ArrayList<>(Arrays.asList(intArr));
		
		
		int arr1 [] = new int[] {2,3,4,5,6};
		List<Integer> lint1 = new ArrayList<>();

		
		for(int i : arr1)
			lint1.add(i);
		
		System.out.println("lint  : "+lint1);
		
		
		List<String> lst1 = new ArrayList<String>(Arrays.asList(str));
		System.out.println("arrays as List : "+lst1);
		List<String> lst = new ArrayList<String>();
		
		for(String s : str)
			lst.add(s);
		
		System.out.println(lst);
		System.out.println("result");
		int n = 5;
		System.out.println(n++ + n++ + ++n );
		
		int k = 11;
		
		boolean check = k > 2 && IntStream.range(3, (int)Math.sqrt(k)).noneMatch(x -> k%x == 0);
		System.out.println(check);
		
		String strr = "sagir";
		boolean chk = strr.chars().mapToObj(x -> (char)x).anyMatch(c -> "aeiou".indexOf(c) != -1);
		System.out.println("it contains vowels");
		
		boolean chk2 = strr.chars().mapToObj(x-> (char)x).noneMatch(c-> "aeiou".indexOf(c) != -1);
		if(!chk2) {
			System.out.println("contains vowel");
		}		
		else {
			System.out.println("does not contain vowel");
		}
		
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
		
		//reverse String
		
		String ModFi  ="  sagiruddin  ";
		String revStr = ModFi.trim();
		String revString = IntStream.range(0, revStr.length())
				.mapToObj(i -> revStr.charAt(revStr.length()-1-i))
				.map(String :: valueOf)
				.collect(Collectors.joining());
		System.out.println("reversed String :: "+revString);
		
		String re = IntStream.range(0, revStr.length())
				.map(i -> revStr.charAt(revStr.length()-1-i)) // return only ascii value
				.peek(x->System.out.println("str ot char "+x))
				.mapToObj(x -> (char)x)
				.map(x -> String.valueOf(x))
				.collect(Collectors.joining());
		
		System.out.println("reverse again with diff method :: "+re);
				
	}

}
