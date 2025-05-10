package digitalocean.com.java.programming.interview.questions;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AsccendingOrderAndDescByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Map<Integer,String> map = new HashMap<>();
	 
	 map.put(3, "sunny");
	 map.put(1, "sagir");
	 map.put(2, "rahul");
	
	 map.put(4, "irfan");
	 map.put(4, "samo");  // we cacn not have the duplicate key but can have the dublicacte value
	 
	 System.out.println("asccending in Keys");
	 Map<Integer,String> treeMap = new TreeMap<>(map);
	 
	 for(Map.Entry<Integer, String> entry : treeMap.entrySet())
		 System.out.println(entry.getKey() +" : "+entry.getValue());
	 
	 System.out.println("Descending  in Keys");
	 Map<Integer,String> revtree = new TreeMap<>(Collections.reverseOrder());
	 revtree.putAll(map);
	 
	 System.out.println(revtree);
	 
	 System.out.println("asccending in Values");

	}

}
