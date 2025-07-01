package com.srteam.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MaxlenghtStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("Sagiruddin", "Sravani", "Abdulrahimbhai", "sbdulrahimbhai");

		int maxLenght = list.stream().mapToInt(String::length).max().orElse(0);
		System.out.println(maxLenght);

		List<String> filteredList = list.stream().filter(str -> str.length() == maxLenght).collect(Collectors.toList());
		System.out.println(filteredList);

		
		
		
	}

}
