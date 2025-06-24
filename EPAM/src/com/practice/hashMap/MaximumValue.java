package com.practice.hashMap;

import java.util.HashMap;
import java.util.Map;

public class MaximumValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> map = new HashMap<>();
		map.put("sagir", 100000);
		map.put("rahul", 400000);

		map.put("nitin", 30000);
		map.put("fahad", 1200000);
		map.put("sagar", 56000);
		
		// finding maximum salary
		int maxSal = Integer.MIN_VALUE;
		
		Map.Entry<String , Integer> maxSalPerson = null;
		for(Map.Entry<String, Integer> entrySet : map.entrySet()) {
			if(entrySet.getValue() > maxSal) {
				
				maxSal = entrySet.getValue();
				maxSalPerson = entrySet;
			}
		}
		
		System.out.println("maxSalary : "+maxSal);
		System.out.println(maxSalPerson);




	}

}
