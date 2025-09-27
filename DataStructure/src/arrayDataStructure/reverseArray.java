package arrayDataStructure;


import java.util.Arrays;

public class reverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5};
		int revArr[] = new int[arr.length];
		int idx = 0;
		for (int i = arr.length-1; i >=0 ; i--) {
			revArr[idx++] = arr[i];
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(revArr));

	}

}
