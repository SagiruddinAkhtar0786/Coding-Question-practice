package digitalocean.com.java.programming.interview.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lst = new ArrayList<>(Arrays.asList("sagir", "salim", "raju"));

		Iterator itr = lst.iterator();

		while (itr.hasNext())
			System.out.println(itr.next());

		for (String s : lst)
			System.out.println(s);
	}

}
