package com.akhtar.practice1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

interface i1{
	void display();
	
	public static void write() {
		System.out.println("writing method");
	}
	default void read() {
		System.out.println("reading method");
	}
}

public class CountFrequency implements i1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] str = {"sagir","sagar","sagir","salim"};

		countFrequency(str);
	}

	private static void countFrequency(String[] str) {
		// TODO Auto-generated method stub
		Map<String,Integer> map = new HashMap<>();
		Set<String> duplicate = new HashSet<>();
		
		for(String s : str) {
			if(!map.containsKey(s)) {
				map.put(s, map.getOrDefault(s, 0)+1);
			}
			else {
				map.put(s, map.get(s)+1);
				duplicate.add(s);
			}
		}
		
		System.out.println(map);
		System.out.println(duplicate);
		
		//Map<String,Integer> modifiedStr = Arrays.stream(str)
		i1.write();
		CountFrequency cf = new CountFrequency();
		cf.read();
		
				
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("display method");
		
	}
	
	
	
	
	
	

}
