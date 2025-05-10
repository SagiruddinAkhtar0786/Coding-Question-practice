package digitalocean.com.java.programming.interview.questions;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class AsccendingOrderAndDescByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Map<Integer,String> map = new HashMap<>();
	 
	 map.put(1, "sagir");
	 map.put(2, "rahul");
	 map.put(3, "sunny");
	 map.put(4, "irfan");
	 
	 Map<Integer,String> comByVal = map
			 .entrySet()
			 .stream()
			 .sorted(Map.Entry.comparingByValue())
			 .collect(Collectors.toMap(Map.Entry :: getKey, Map.Entry :: getValue ,(oldVlaue,newValue)-> oldVlaue,LinkedHashMap :: new));
	 
	 comByVal.forEach((k,v )-> System.out.println(k +" : "+v));
	 
	 // normal get key and get value
	  Map<Integer,String> comByValM = map
			 .entrySet()
			 .stream()
			 .sorted(Map.Entry.comparingByValue())
			 .collect(Collectors.toMap(
					 entry -> entry.getKey(),
					 entry -> entry.getValue(),
					 (oldValue,newValue) -> oldValue,
					 () -> new LinkedHashMap<>())
					 );
	 
	 comByValM.forEach((k,v )-> System.out.println(k +" : "+v));
	  
	 
	 

	}

}
