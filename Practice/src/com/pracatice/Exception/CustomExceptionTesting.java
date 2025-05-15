package com.pracatice.Exception;


class generateException extends Exception{
	generateException(String msg){
		super(msg);
	}
	
	generateException(){
		
	}
}
public class CustomExceptionTesting {

	public static void main(String[] args) throws generateException  {
		
		// TODO Auto-generated method stub
		
	
			int result = 10/0;
			//throw new ArithmeticException();
			throw new generateException("This is user Defined Exception ");
			
			/*
			 output will be arithmetic exception,Exception in thread "main" java.lang.ArithmeticException: / by zero
	at com.pracatice.Exception.CustomExceptionTesting.main(CustomExceptionTesting.java:20)

user Defined exception will not execute 
since result = 10/0 will immidiately throe an exception due to which it will not readch to 
custom exception and we know that once exception occred , normal flow of the execution will inrterrrupt

like if age  is less the 18, at that instane we can use ustom exception ,we cacn not use tha custom exception 
if already exception catch by JVM which comes for pre defined exception
			 */
			
			
		

	}

}
