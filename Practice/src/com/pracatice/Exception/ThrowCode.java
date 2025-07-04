package com.pracatice.Exception;


/*
 Note: If we throw an unchecked exception from a method, it is not required to handle
  the exception or declare it in throws clause. However, for checked exceptions, 
 handling or declaration in the throws clause is mandatory."
 */
public class ThrowCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkAge(13);
		
		System.out.println("Rst of the code");
	}
	
	private static void checkAge(int age) {
		if(age < 18) {
			throw new ArithmeticException("Person is not eligible to vote ");
		}
		else {
			System.out.println("person is eligibel to vote");
		}
	}

}
