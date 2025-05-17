package digitalocean.com.java.programming.interview.questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
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
	 
	// List<Entry<Integer,String>> entryList = new ArrayList<>(map.entrySet());
	// System.out.println(entryList);
	 List<Map.Entry<Integer,String>> entryList = new ArrayList<>(map.entrySet());
	 System.out.println(entryList);
	 
	 


     // Ascending order by value
     Collections.sort(entryList, new Comparator<Map.Entry<Integer, String>>() {
         @Override
         public int compare(Map.Entry<Integer, String> e1, Map.Entry<Integer, String> e2) {
             return e1.getValue().compareTo(e2.getValue());
         }
     });

     System.out.println("Sorted in Ascending Order by Value:");
     for (Map.Entry<Integer, String> entry : entryList) {
         System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
     }

     // Descending order by value
     Collections.sort(entryList, new Comparator<Map.Entry<Integer, String>>() {
         @Override
         public int compare(Map.Entry<Integer, String> e1, Map.Entry<Integer, String> e2) {
             return e2.getValue().compareTo(e1.getValue());
         }
     });

     System.out.println("\nSorted in Descending Order by Value:");
     for (Map.Entry<Integer, String> entry : entryList) {
         System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
     }

	}

}
