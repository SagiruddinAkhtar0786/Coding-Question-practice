package com.akhtar.practice1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
		System.out.println(s1.equals(s2));
		System.out.println(s1== s2);
		System.out.println(s3.equals(s2));
		System.out.println(s3 == s2);
		
		
		//***********************************************************
		
		//convert array to list
		
		String [] str = {"sagir", "salim","raju","rajnish"};
		
		
		List<String> lst1 = new ArrayList<String>(Arrays.asList(str));
		System.out.println("arrays as List : "+lst1);
		List<String> lst = new ArrayList<String>();
		
		for(String s : str)
			lst.add(s);
		
		System.out.println(lst);
	}

}
