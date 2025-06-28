package com.practice.hashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class IteratorUsewithListAndMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list.add("sagir");
		list.add("raju");
		list.add("ahim");
		list.add("shamma");

		
		Iterator itrr= list.iterator();
		
		while(itrr.hasNext()) {
			//String ele = itrr.next();
			System.out.println(itrr.next());
		}
		
		Map<String,Integer> map = new HashMap<>();
		map.put("ram", 123);
		map.put("rahim", 786);
		
		// keyset
		Iterator<String> keyset = map.keySet().iterator();
		System.out.println(keyset);
		
	}

}
