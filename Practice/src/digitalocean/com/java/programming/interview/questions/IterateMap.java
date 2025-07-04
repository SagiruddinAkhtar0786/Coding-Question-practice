package digitalocean.com.java.programming.interview.questions;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IterateMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map = new HashMap<>();
		map.put(1, "sagir");
		map.put(2, "saharsh");
		map.put(3, "rahu");
		
		Set<Entry<Integer,String>> entry = map.entrySet();
		
		for(Entry<Integer,String> ele : entry) {
			System.out.println(ele.getKey() +" : "+ele.getValue());
		}
		
		for(Map.Entry<Integer, String> entry1 : map.entrySet())
			System.out.println(entry1.getKey() +" : "+entry1.getValue());
		
		 for (Map.Entry<Integer, String> entry2 : map.entrySet()) {
	            System.out.println("Key: " + entry2.getKey() + ", Value: " + entry2.getValue());
	        }

			

	}

}
