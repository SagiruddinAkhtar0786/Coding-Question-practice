package com.srteam.practice;
import java.util.*;
import java.util.stream.*;
public class FilterWithLength4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>(Arrays.asList("sagir","sravani","sham","ram","rahul"));
		
		List<String> filteredList = list.stream().filter(str -> str.length()>4).collect(Collectors.toList());
		System.out.println(filteredList);
		
		
		System.out.println("***********************************************");
		
	
	}

}
