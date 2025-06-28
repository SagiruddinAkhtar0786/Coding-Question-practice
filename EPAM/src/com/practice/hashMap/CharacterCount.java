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

/*
  // Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
import java.util.function.Function;

import java.util.stream.Collectors;
class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,1,2,3,4,5);
        Map<Integer,Long> listedMap = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        
        System.out.println(listedMap);
        
        String str = "aassdddfffffgggttqwwww";
        
        Map<Character,Long> modifiedList = str.chars().mapToObj(x -> (char) x).collect(Collectors.groupingBy(Function.identity() , Collectors.counting()));
        
        System.out.println(modifiedList);
        
        
    }
}
 */
