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

		Iterator itrr = list.iterator();

		while (itrr.hasNext()) {
			// String ele = itrr.next();
			System.out.println(itrr.next());
		}
		System.out.println("**************map key set************");
		Map<String, Integer> map = new HashMap<>();
		map.put("ram", 123);
		map.put("rahim", 786);

		// keyset
		Iterator<String> keyset = map.keySet().iterator();
		while (keyset.hasNext()) {

			System.out.println(keyset.next());
		}
		System.out.println("**************map value set************");

		Iterator<Integer> mapValues = map.values().iterator();
		while (mapValues.hasNext()) {

			System.out.println(mapValues.next());
		}

		System.out.println("**************Map entry set ***********");
		
		Iterator<Map.Entry<String, Integer>> itrSet = map.entrySet().iterator();
		while (itrSet.hasNext()) {

			System.out.println(itrSet.next());
		}

		//System.out.println("**************Map entry set ***********");

	}

}
