package java8Features;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class AsccendingOrderAndDesc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map = new HashMap<>();
		map.put(1, "sagir");
		map.put(4, "farhan");
		map.put(2, "saharsh");
		map.put(5, "sunny");
		map.put(3, "rahu");
		
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(entry -> System.out.println(entry));
		System.out.println("================================reverse order============================================");
		//map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(entry -> System.out.println(entry));
		Map<Integer,String> keySoert = map.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toMap(Map.Entry :: getKey,Map.Entry :: getValue,(oldv,newv)->oldv,LinkedHashMap :: new));
		System.out.println(keySoert);
		Map<Integer,String> revMap = map
				.entrySet()
				.stream()
				.sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
				.collect(Collectors.toMap(entry -> entry.getKey(),entry -> entry.getValue(),(oldv,newV) ->oldv,() -> new LinkedHashMap()));
		
		System.out.println(revMap);
		
	}

}
