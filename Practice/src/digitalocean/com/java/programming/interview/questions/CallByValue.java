package digitalocean.com.java.programming.interview.questions;

/*
 * ✅ Call by Value (Primitive Types)
When you pass a primitive (like int, float, char), a copy of the value is 
sent to the method. Changes in the method don’t affect the original variable.

java
Copy
Edit

 */

public class CallByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		System.out.println("original value not affected before passing value :  "+a);;

		callByValueinJava(a);
		System.out.println("original value not affected after passing value : "+a);;


	}
	
	private static void callByValueinJava(int copyA) {
		System.out.println("copied value  : "+(copyA + 2));;
	}

}
