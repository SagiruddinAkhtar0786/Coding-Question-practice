package java8Features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> lst  = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		
	//	int[] a = lst.toArray(new int[lst.size()]);
		int [] arr = new int[lst.size()];
		for(int i = 0 ; i < lst.size();i++)
			arr[i] = lst.get(i);
		
		
		System.out.println(Arrays.toString(arr));
		
		
		int [] StreamList = lst.stream()
							.mapToInt(x ->x) //.ampToInt(Integer :: intValue)
							.toArray();
		
		System.out.println(Arrays.toString(StreamList));
	}

}
