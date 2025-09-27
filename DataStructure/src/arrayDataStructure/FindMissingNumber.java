package arrayDataStructure;

public class FindMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {2,4,1,8,6,3,7};
		
		int len = arr.length+1;
		
		int sumOfN = (len * (len+1))/2;
		
		System.out.println("Sum Of N :: "+sumOfN);
		
		int sum = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			sum += arr[i];
		}
		
		int missingNum = sumOfN - sum;
		
		System.out.println("Missing Number :: "+missingNum);

	}

}
