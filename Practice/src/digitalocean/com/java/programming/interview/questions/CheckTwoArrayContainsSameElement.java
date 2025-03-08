package digitalocean.com.java.programming.interview.questions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
/*
 * Explanation:
✔ Sorting helps to align elements in the same order.
✔ Direct comparison ensures both arrays have the same numbers and frequency.
✔ No extra space is used (except sorting, which is O(n log n))
✔ Uses a HashMap instead of sorting
 Runs in O(n) time complexity, which is faster than sorting (O(n log n)).

.
 */
public class CheckTwoArrayContainsSameElement {

	// using arrrays and sorting

	private static boolean checkFunctionality(int[] arr1, int[] arr2) {
		if (arr1.length != arr2.length)
			return false;

		Arrays.sort(arr1);
		Arrays.sort(arr2);
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i])
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = { 2, 4, 6, 8, 0, 4 };
		int arr2[] = { 8, 2, 4, 6, 4, 0 };

		boolean result = checkFunctionality(arr1, arr2);
		if (result)
			System.out.println("Two arrrays are equal");
		else
			System.out.println("Two arrrays are not equal");

		boolean resultusingSet = checkFunctionalityUsingSet(arr1, arr2);
		if (resultusingSet)
			System.out.println("Two sets are equal");
		else
			System.out.println("Two sets are not equal");

	}

	private static boolean checkFunctionalityUsingSet(int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub

		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();

		
		if(set1.size() != set2.size()) {
			return false;
		}
		/*
		 * ✔ Using HashSet removes duplicates automatically.
		 *  ✔ Set comparison (.equals()) ensures both arrays contain the same unique elements. 
		 * ✔ Order doesn't matter since sets are unordered.
		 */
		for (int i : arr1)
			set1.add(i);
		for (int i : arr2)
			set2.add(i);

		return set1.equals(set2);
	}

}
