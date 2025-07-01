package com.srteam.practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class maxLengthName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();	
		
		list.add("sagiruddindddddddddddddd");
		list.add("rahulAnanadKumar");
		list.add("fahad");
		
		String name = list.stream().max(Comparator.comparingInt(String:: length)).orElse("");
		System.out.println(name);
		
		
		String Longestname = list.stream().max((a,b) -> Integer.compare(a.length(), b.length())).orElse("");
		System.out.println(Longestname);
	}

}
