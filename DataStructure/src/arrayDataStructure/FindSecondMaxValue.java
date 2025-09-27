package arrayDataStructure;

public class FindSecondMaxValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,0,-1};
		int maxVal = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		
		for(int i = 0 ; i < arr.length ; i++) {
			
			if(arr[i] > maxVal) {
				secondMax = maxVal;
				maxVal = arr[i];
			}else if(arr[i] > secondMax && arr[i] != maxVal)
				secondMax = arr[i];
		}
		
		System.out.println("Max value : "+maxVal +" Second Max :: "+secondMax);
		
	}

}
