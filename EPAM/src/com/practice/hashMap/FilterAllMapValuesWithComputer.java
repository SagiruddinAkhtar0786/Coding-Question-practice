package com.practice.hashMap;
import java.util.*;
import java.util.stream.Collectors;
public class FilterAllMapValuesWithComputer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Map<Integer,String> map = new HashMap<>();
			map.put(1, "Computer");
			map.put(4, "Ramhim");
			map.put(9, "rahu");
			map.put(3, "Computer");
			map.put(2, "Computer");
			map.put(5, "shamsher");
			
			System.out.println(map);
			
			Map<Integer,String> filteredMap = map.entrySet().stream()
									.filter(x -> x.getValue().equalsIgnoreCase("Computer"))
									.collect(Collectors.toMap(
											Map.Entry :: getKey, Map.Entry :: getValue));
			
			System.out.println(filteredMap);
			
			List<Map.Entry<Integer, String>> listValues = map.entrySet()
							.stream()
							.filter(x -> x.getValue().equalsIgnoreCase("Computer"))
							.sorted((x,y) -> x.getKey().compareTo(y.getKey()))
							.collect(Collectors.toList());
			
			System.out.println(listValues);

	}

}
