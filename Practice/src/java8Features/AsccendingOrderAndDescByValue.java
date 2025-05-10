package java8Features;

//package digitalocean.com.java.programming.interview.questions;

import java.util.Comparator;
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
	 map.put(4, "samo");  // we cacn not have the duplicate key but can have the dublicacte value
	 
	 Map<Integer,String> comByVal = map
			 .entrySet()
			 .stream()
			 .sorted(Map.Entry.comparingByValue())
			 .collect(Collectors.toMap(Map.Entry :: getKey, Map.Entry :: getValue ,(oldv,newv)->oldv,LinkedHashMap :: new));
	 
	 comByVal.forEach((k,v )-> System.out.println(k +" : "+v));
	 System.out.println("************************************************************");
	 
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
	 System.out.println("************************************************************");

	 
	 // normal get key and get value
	  Map<Integer,String> comByValreverese = map
			 .entrySet()
			 .stream()
			 .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
			 .collect(Collectors.toMap(
					 entry -> entry.getKey(),
					 entry -> entry.getValue(),
					 (oldValue,newValue) -> oldValue,
					 () -> new LinkedHashMap<>())
					 );
	 
	  comByValreverese.forEach((k,v )-> System.out.println(k +" : "+v));
	  
		 System.out.println("************************************************************");

	 
	 map
	 .entrySet()
	 .stream()
	 .sorted(Map.Entry.comparingByValue()).forEach(entry -> System.out.println(entry.getKey() + " : "+ entry.getValue()));
		 
		 System.out.println("************************************************************");

	  
		 Map<String,Integer> emp = new HashMap<String,Integer>();
			emp.put("sagir", 28);
			emp.put("salim", 20);
			emp.put("raju", 12);
			emp.put("rahim", 54);
			emp.put("rajesh", 90);
			
			System.out.println("employee list :: "+emp);
			
			
			Map<String,Integer> sortMap = emp.entrySet()
					.stream()
					.sorted(Map.Entry.comparingByValue())
					.collect(Collectors.toMap(entry -> entry.getKey(), entry->entry.getValue(),(oldv,newv) -> oldv,LinkedHashMap :: new));
		sortMap.forEach((k,v) -> System.out.println(k +" : "+v));
		
		System.out.println("************************************************************");
		Map<String,Integer> sortMapKeys = emp.entrySet()
				.stream()
				.sorted(Map.Entry.comparingByKey())
				.collect(Collectors.toMap(entry -> entry.getKey(), entry->entry.getValue(),(oldv,newv) -> oldv,LinkedHashMap :: new));
		sortMapKeys.forEach((k,v) -> System.out.println(k +" : "+v));
	 

	}

}
