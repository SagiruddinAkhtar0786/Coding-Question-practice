package digitalocean.com.java.programming.interview.questions;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortHashMapByValueIII {
	
	private static Map<String,Integer> sortByValueUsingJava8(Map<String,Integer> scores){
		
		Map<String,Integer> sortedMap = scores
										.entrySet()
										.stream()
										//.sorted(Map.Entry.comparingByValue())//sort by value 
										.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
										.collect(Collectors.toMap(
												Map.Entry :: getKey, //    entry -> entry.getKey()
												Map.Entry :: getValue,//    entry -> entry.getValue()
												(oldValue,newValue) -> oldValue,// Handles duplicate keys   , if keys are dublicate
												//,The function (oldValue, newValue) -> oldValue ensures that the first occurrence is retained.
												LinkedHashMap :: new//maintains Order also   () -> new LinkedHashMap<>()
												));
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

		Map<String,Integer> shortedScores = sortByValueUsingJava8(scores);
		
		System.out.println("shortedScores >> "+shortedScores);
	}

}
