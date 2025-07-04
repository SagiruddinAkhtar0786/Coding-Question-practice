package digitalocean.com.java.programming.interview.questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortHashMapByValueII {
	
	private static Map<String, Integer> sortByValue(Map<String,Integer> score) {
		
	//	Set<Entry<String,Integer>> entrySset = score.entrySet();
		
		List<Map.Entry<String,Integer>> entryList = new ArrayList<>(score.entrySet());
		entryList.sort((a,b) ->a.getValue().compareTo(b.getValue()));
		System.out.println("sorted List :: "+entryList);
		
		Map<String,Integer> sortedMap = new LinkedHashMap<>();
		
		for(Map.Entry<String, Integer> entry : entryList)
			sortedMap.put(entry.getKey(), entry.getValue());
		
		return sortedMap;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> scores = new HashMap<>();

		scores.put("David", 95);
		scores.put("Jane", 80);
		scores.put("Mary", 97);
		scores.put("Lisa", 78);
		scores.put("Dino", 65);

		System.out.println(scores);

		Map<String,Integer> shortedScores = sortByValue(scores);
		
		System.out.println("shortedScores >> "+shortedScores);

		
		
	}

}
