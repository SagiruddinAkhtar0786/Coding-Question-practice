package arrayDataStructure;

public class CheckPalinDrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "saas1";
		
		for(int i = 0 , j = str.length()-1 ; i<j ; i++,j--) {
			if(str.charAt(i) != str.charAt(j)) {
				System.out.println("not a palindrom ");
				//break;
				return;
			}
				
		}
		
		System.out.println("palindrome");

	}

}
