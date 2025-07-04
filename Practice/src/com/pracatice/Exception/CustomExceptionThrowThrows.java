package com.pracatice.Exception;

class customException extends Exception{
	customException(String msg){
		super(msg);
	}
}


public class CustomExceptionThrowThrows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			validateAge(13);
		}catch(customException e) {
			e.printStackTrace();
		}
		
		System.out.println("rest of the code ");

	}

	private static void validateAge(int age)throws customException {
		// TODO Auto-generated method stub
		if(age < 18) {
			throw new customException("person is not eleigible for vote ");
		}
		else {
			System.out.println("Person is more the age of  18 ");
		}
		
	}

}
