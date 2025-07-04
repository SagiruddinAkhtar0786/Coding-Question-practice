package digitalocean.com.java.programming.interview.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeTwoListInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lst1 = new ArrayList<String>(Arrays.asList("sagir","salim"));
		List<String> lst2 = new ArrayList<String>(Arrays.asList("rahul","Amit"));
		
		//List<List> mergeList = new ArrayList<List,List>(lst1,lst2);
		
		List<String> mergeList = new ArrayList<String>(lst1);
		mergeList.addAll(lst2);
		
		System.out.println("merged List :: "+mergeList);
		
		// using java8
		
		List<String> ListMerged = Stream.concat(lst1.stream(), lst2.stream()).collect(Collectors.toList());
		
		System.out.println("merged List using java 8 :: "+ListMerged);

	}

}
