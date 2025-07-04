package digitalocean.com.java.programming.interview.questions;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class checkPalindrome {
	
	private static void checkAnumberIspalindrome(int num) {
		int n = num;
		int r, sum = 0;
		while(n>0) {
			r = n%10;
			sum = (sum*10)+r;
			n /=10;			
		}
		
		if(num == sum)
			System.out.println("plaindrome");
		else
			System.out.println("Not a palindrome ");
	}
	
	private static boolean checkAnumberIspalindromeUsingJava8(int num) {
		
		String strNum = String.valueOf(num);
		
		String ModifiedString = IntStream.range(0, strNum.length()) // int Stream of Integers
									.mapToObj(i-> strNum.charAt(strNum.length()-1-i)) // takes one argument and returns reverse character,// Convert char to Object (Character)
									//.map(String :: valueOf) // converts each Character to String
									.map(x -> String.valueOf(x))
									.collect(Collectors.joining()); // concatenate all string of Characters
		
		
		return strNum.equals(ModifiedString);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("********* code to check a Number is palindrome or Not using Normal Method***********");
		int num = 12321;
		checkAnumberIspalindrome(num);
		System.out.println();

		System.out.println("********* code to check a Number is palindrome or Not using Java 8 ***********");
		boolean chk = checkAnumberIspalindromeUsingJava8(num);
		if(chk)
			System.out.println("plaindrome ===>  checkAnumberIspalindromeUsingJava8");
		else
			System.out.println("Not a palindrome ===>  checkAnumberIspalindromeUsingJava8");
		// check number
		System.out.println();
		System.out.println("********* check palindrome if nummres are given ina n array ***********");
		int arr[] =new int []{12321,34543,12345};
		
		for(int i = 0 ; i < arr.length ; i++) {
			boolean k = checkAnumberIspalindromeUsingJava8(arr[i]);
			
			if(k)
				System.out.println("plaindrome ===>  checkAnumberIspalindromeUsingJava8 >> " + arr[i]);
			else
				System.out.println("Not a palindrome ===>  checkAnumberIspalindromeUsingJava8 >>" +arr[i]);
			// check number
		}
		System.out.println(Arrays.toString(arr));
		
		System.out.println("check palindrome if  a string ");
		
		String str = "asdfgfdsa";
		
		String modifiedStr = IntStream.range(0, str.length())
				.mapToObj(i -> str.charAt(str.length()-1-i))
				.map(String :: valueOf)
				.collect(Collectors.joining());
		
		if(str.equals(modifiedStr))
			System.out.println("String is palindrome ....");
		else
			System.out.println("String is Not Palindrome ....");
		
		System.out.println("777777777777777777777777777777777777777777777777");
		String str1 = "sagi";

		int i = 0 , j = str1.length()-1;
		while(i <j) {
			if(str1.charAt(i) !=  str1.charAt(j))
			{
				System.out.println("No plindrome ");
				return;
				
			}
			else {
				i++;
				j--;
			}
		}
		
		
	}

}
