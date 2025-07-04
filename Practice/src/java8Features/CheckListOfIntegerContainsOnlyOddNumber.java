package java8Features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CheckListOfIntegerContainsOnlyOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> lst = new ArrayList<>(Arrays.asList(3, 5, 7, 9, 11,4));
		
		List<Integer> lstt = lst.stream().filter(n -> n%2 == 0).collect(Collectors.toList());
		if(lstt.size() > 0 )
			System.out.println("list of integer do not contain only odd numbers");
		else
			System.out.println("list of integer contain only odd numbers");
		
		
		List<Integer> list = new ArrayList<>(Arrays.asList(3, 5, 7, 9, 11));
		boolean check = list.stream().noneMatch(n-> n%2 == 0);
		if(!check )
			System.out.println("list of integer do not contain only odd numbers");
		else
			System.out.println("list of integer contain only odd numbers");

	}

}
