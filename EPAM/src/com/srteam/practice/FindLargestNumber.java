package com.srteam.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> lst = new ArrayList<>(Arrays.asList(234,543,122,342,333,678,980));
		System.out.println("Lowest Number");
		int MinNum = lst.stream().max((a,b) ->b-a).orElse(0);
		System.out.println(MinNum);
		System.out.println("highest Number");
		int MaxNum = lst.stream().max((a,b) ->a-b).orElse(0);
		System.out.println(MaxNum);
		
		

	}

}
