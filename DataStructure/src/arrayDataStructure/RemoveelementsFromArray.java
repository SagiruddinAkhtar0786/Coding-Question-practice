package arrayDataStructure;


// remove even number and print odd numbers
import java.util.Arrays;

public class RemoveelementsFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,6,4,2,3,5,4,8,9,6,12,90};
		
		int count = 0;
		for(int i = 0 ; i < arr.length;i++ ) {
			if(arr[i] % 2 != 0) {
				count++;
			}
		}
		System.out.println("count :: "+count);
		
		int oddArr[] = new int[count];
		int idx=0;
		for(int i = 0 ; i < arr.length;i++) {
			if(arr[i] %2 != 0) {
				oddArr[idx++] = arr[i];
			}
			
		}
		
		System.out.println(Arrays.toString(oddArr));

	}

}
