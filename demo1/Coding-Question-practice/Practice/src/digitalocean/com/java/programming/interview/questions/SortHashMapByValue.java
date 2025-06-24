package digitalocean.com.java.programming.interview.questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortHashMapByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> emp = new HashMap<String,Integer>();
		emp.put("sagir", 28);
		emp.put("salim", 20);
		emp.put("raju", 12);
		emp.put("rahim", 54);
		emp.put("rajesh", 90);
		
		System.out.println("employee list :: "+emp);
        // Convert HashMap to List of Entries
		List<Map.Entry<String,Integer>> entryList = new ArrayList<>(emp.entrySet());
		System.out.println("entryList >> "+entryList);
		
		for(Map.Entry<String, Integer> entry : entryList) {
			System.out.println("Key :: "+entry.getKey()+" value :: "+entry.getValue());;
		}
		
		
		for(int i = 0 ; i <entryList.size()-1 ; i++) {
			//System.out.println("entryList.get(i) >> "+entryList.get(i)+" : "+i);
			for(int j = i+1 ; j < entryList.size() ; j++) {
				System.out.println(entryList);
				if(entryList.get(i).getValue() > entryList.get(j).getValue()) {
					Map.Entry<String, Integer> temp = entryList.get(i); 
					entryList.set(i, entryList.get(j));
					entryList.set(j, temp);
				}
			}
		}
		System.out.println("entryList llop >> "+entryList);
		
		
		
		
		Map<String,Integer> sortedMap = new LinkedHashMap<String,Integer>();
		
		for(Map.Entry<String, Integer> entry : entryList)
			sortedMap.put(entry.getKey(), entry.getValue());
		
		System.out.println("Sorted Map :: "+sortedMap);
		
		
		
		
		//for()
		
	}

}
