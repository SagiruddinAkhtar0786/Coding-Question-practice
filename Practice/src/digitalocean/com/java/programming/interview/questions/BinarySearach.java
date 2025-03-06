package digitalocean.com.java.programming.interview.questions;


/*
 * The array elements must be sorted to implement binary search. The binary search algorithm is based on the following conditions:

If the key is less than the middle element, then you now need to search only in the first half of the array.
If the key is greater than the middle element, then you need to search only in the second half of the array.
If the key is equal to the middle element in the array, then the search ends.
Finally, if the key is not found in the whole array, then it should return -1. This indicates that the element is not present.

 */
public class BinarySearach {
	
	public static int findElement(int arr[] , int key) {
		int start = 0, end = arr.length-1;
		
		int mid =  (start+end)/2;
		
		while(start  <= end) {
			
			if( key < arr[mid]) {
				end = mid-1;
			}
			else if( key > arr[mid]) {
				start = mid+1;
			}
			else
				return mid;
			
			
			mid = (start+end)/2;
		}
		
		if(start > end)
			return -1;
		
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		int key = 0;
		
		int result = findElement(arr,key);
		if(result != -1)
		System.out.println("searched element "+arr[result] +" found at index :: "+result);
		else
		System.out.println("element not found ");
			
		
		

	}

}
