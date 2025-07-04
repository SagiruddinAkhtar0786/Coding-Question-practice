package digitalocean.com.java.programming.interview.questions;

import java.util.Arrays;
import java.util.List;

public class checkListOfIntegerContainsOnlyOddNumber {

	private static boolean checkList(List<Integer> lst) {

		for (int i = 0; i < lst.size(); i++) {
			if (lst.get(i) % 2 == 0)
				return false;
		}
		return true;
	}
	private static boolean chkLstusingJava8(List<Integer> list) {
		
		return list.stream().noneMatch(x -> x%2 == 0 );
		//return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> lst = Arrays.asList(1, 3, 5, 7, 9,11);

		boolean chkLst = checkList(lst);
		if(chkLst)
			System.out.println("true");
		else
			System.out.println("false");
		
		boolean chkLstusingJava8 = chkLstusingJava8(lst);
		if(chkLstusingJava8)
			System.out.println("true...");
		else
			System.out.println("false");

	}

}
