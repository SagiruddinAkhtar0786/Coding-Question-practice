package arrayDataStructure;

import java.util.Arrays;

public class ResizeanArray {
	
	public static int [] resizeArray(int arr[] , int capacity) {
		int[] temp = new int[capacity];
		
		for(int i = 0 ; i < arr.length ;i++) {
			temp[i] = arr[i];
		}
		
		arr = temp;
		return arr;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int original[] = new int[] {2,4,3,1,5};
			
			System.out.println("lenght of Oringianl Arrya :: "+original.length +" Arrays.toString(original) "+Arrays.toString(original));
			
			// resizeArray
			
			original = resizeArray(original,original.length *2);
			
			System.out.println("lenght of Oringianl Arrya :: "+original.length +"  Arrays.toString(original) "+Arrays.toString(original));
	}

}
