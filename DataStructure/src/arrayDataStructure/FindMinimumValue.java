package arrayDataStructure;

public class FindMinimumValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,0,-1};
		
		int minVal = Integer.MAX_VALUE;
		
		for(int i = 0 ; i < arr.length ; i++) {
			
			if(arr[i] <minVal) {
				minVal = arr[i];
			}
		}
		
		System.out.println("Min Value :: "+minVal);
	}

}
