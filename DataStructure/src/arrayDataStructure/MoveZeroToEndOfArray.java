package arrayDataStructure;

import java.util.Arrays;
//MoveZeroToEndOfArray
public class MoveZeroToEndOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] {0,1,0,4,12};//1,0,0,4,12=1,4,0,0,12=1,4,12,0,0
		
		int j = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[j]  == 0 && arr[i] != 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			
			if(arr[j] != 0)
				j++;
		}
		
		System.out.println(Arrays.toString(arr));
	//MoveZeroToStartOfArray	
		int arr2[] = new int[] {0,1,0,4,12};
		
		int k = 0 ;
		for(int i = 0 ; i <arr2.length ; i++) {
			if(arr2[k]  != 0 && arr2[i] == 0) {
				int temp = arr2[i];
				arr2[i] = arr2[k];
				arr2[k] = temp;
			}
			
			if(arr2[k] == 0)
				k++;
		}
		
		System.out.println(Arrays.toString(arr2));

	}

}
