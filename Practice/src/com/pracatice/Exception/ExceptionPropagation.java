package com.pracatice.Exception;

public class ExceptionPropagation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			callAricthmeticException();
			//int result = 10/0;
		}catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception :: "+e.getMessage());
		}
	}

	private static void callAricthmeticException() {
		
		// TODO Auto-generated method stub
		callAricthmeticExceptionII();
	}

	private static void callAricthmeticExceptionII() {
		// TODO Auto-generated method stub
		System.out.println("callAricthmeticExceptionII");

		callAricthmeticExceptionIII();
	}

	private static void callAricthmeticExceptionIII() {
		// TODO Auto-generated method stub
		System.out.println("callAricthmeticExceptionIII");
		int result = 10/0; // exception occurs here
	}

}
