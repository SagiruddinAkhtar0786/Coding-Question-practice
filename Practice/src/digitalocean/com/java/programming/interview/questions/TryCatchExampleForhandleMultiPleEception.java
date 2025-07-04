package digitalocean.com.java.programming.interview.questions;

public class TryCatchExampleForhandleMultiPleEception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6};
		
		for(int i = 0; i <=arr.length ; i++) {
			try {
				
				int result = arr[i]/i;
				System.out.println(result);
			}catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
			}
		}
	}

}

/* outPut
 java.lang.ArithmeticException: / by zero
	at digitalocean.com.java.programming.interview.questions.TryCatchExampleForhandleMultiPleEception.main(TryCatchExampleForhandleMultiPleEception.java:12)
java.lang.ArrayIndexOutOfBoundsException: 6
	at digitalocean.com.java.programming.interview.questions.TryCatchExampleForhandleMultiPleEception.main(TryCatchExampleForhandleMultiPleEception.java:12)2
1
1
1
1


 */
