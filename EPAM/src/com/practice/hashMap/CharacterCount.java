package com.practice.hashMap;
/*
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;*/
import java.util.*;
import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Map;

public class CharacterCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="sagiruddinsaggrszxcvbnm";
		
		Map<Character,Integer> charCount = new HashMap<>();
		Map<Character,Integer> unique = new HashMap<>();
		//Map<Character,Integer> Duplicate = new HashMap<>();
		Set<Character> Duplicate  =new HashSet<>();
		Map<Character,Integer> singles = new HashMap<>();


		
		for(char c : str.toCharArray()) {
			
			charCount.put(c, charCount.getOrDefault(c, 0)+1);
			
			if(!singles.containsKey(c)) {
				singles.put(c, singles.getOrDefault(c, 0)+1);
			}
			else {
				Duplicate.add(c);
			}
			
			
			//System.out.println(c);
		}
		System.out.println("cahrc count :: "+charCount);
		System.out.println("only Dublicate element :: "+Duplicate);
		System.out.println("only Singles element from Dublicate :: "+singles);
		
		
		for(Map.Entry<Character,Integer> entrySet : charCount.entrySet()) {
			if(entrySet.getValue() == 1) {
				unique.put(entrySet.getKey(), entrySet.getValue());
			}
		}
		
		System.out.println(" only uniqueunique Elements :: "+unique);
		
System.out.println("*************************Java 8 Features*******************************");

Map<Character,Long> charCountJava8= str.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
System.out.println("charCountJava8 >> "+charCountJava8);




	}

}
