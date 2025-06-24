package com.pracatice.Exception;

class CustomException extends Exception {
	CustomException(String msg) {
		super(msg);
	}
}

public class HandlineCustomException {

	public static void validateAge(int age) throws CustomException {
		if (age < 18)
			throw new CustomException("Age is less then 18");
	}

	public static void main(String[] args) throws CustomException {
		// TODO Auto-generated method stub

		validateAge(12);
		
	//	or
		/*try {
			validateAge(13);
		} catch (CustomException e) {
			// TODO Auto-generated catch block
			System.out.println("Custome Excepption Occured")
;			e.printStackTrace();
		}*/

	}

}
