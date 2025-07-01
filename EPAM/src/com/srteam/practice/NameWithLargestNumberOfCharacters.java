package com.srteam.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class NameWithLargestNumberOfCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("Sagiruddin", "Sravani", "Abdulrahimbhai");

		Optional<String> name = list.stream().max((a, b) -> Integer.compare(a.length(), b.length()));
		if (name.isPresent())
			System.out.println(name.get());
		

		// Finding the name with the largest number of characters
		String longestName = list.stream().max(Comparator.comparingInt(String::length)).orElse("No names available"); // Default
																														// message
																														// if
																														// list
																														// is
																														// empty

		// Printing the name with the largest number of characters
		System.out.println("Name with the largest number of characters: " + longestName);

	}

}
