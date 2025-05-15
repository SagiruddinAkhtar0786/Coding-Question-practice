package com.pracatice.Exception;


class generateException extends Exception{
	generateException(String msg){
		super(msg);
	}
}
public class CustomExceptionTesting {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		try {
			int result = 10/0;
			
			
		}catch(ArithmeticException e) {
			System.out.println("Divide by zero not applicable :: "+e.getMessage());
		}

	}

}
