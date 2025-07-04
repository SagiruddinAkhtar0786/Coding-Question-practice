package digitalocean.com.java.programming.interview.questions;

public class ZigZag_Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "PAYPALISHIRING"; //output : PAHNAPLSIIGYIR 
		int numRows = 3;
		
		String modifiedString = zigZag_Conversion(str,numRows);
		System.out.println("Modifies String afte conversion :: "+modifiedString);

	}

	private static String zigZag_Conversion(String str, int numRows) {
		// TODO Auto-generated method stub
		int k= 0;
		String result[] = new String[numRows];
		for(int i = 0 ; i<result.length;i++) {
			result[i] = "";
		}
			
		while(k <str.length()) {
			for(int index= 0 ; index <numRows && k <str.length() ;index++) {
				result[index] += str.charAt(k++);
			}
			for(int index = numRows-2;index > 0 && k< str.length();index--) {
				result[index] += str.charAt(k++);
			}
		}
		
		String finalResult="";
		for(String val : result)
			finalResult +=val;
		
		
		return finalResult;
	}

}
