package com.pracatice.Exception;
// handling the exception if at i =5 exception occurs , otheres wi;l print , will not stop the execution
public class ExeptionHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0 ; i<10 ; i++) {
			
			try {
				if(i == 5) {
					int result = i/0;
					
				}
				System.out.println(i);
			}catch(ArithmeticException e) {
				System.out.println("not allowed divede by Zero : "+e.getMessage());
			}
			
		}
	}

}
