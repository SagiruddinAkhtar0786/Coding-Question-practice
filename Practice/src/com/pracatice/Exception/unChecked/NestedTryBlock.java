package com.pracatice.Exception.unChecked;

public class NestedTryBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int a = 10;
			int b = 0;

			int result = a / b;

			try {
				int arr[] = new int[3];
				arr[4] = 10;
			} catch (ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
				System.out.println("Innner Exception :: " + e.getMessage());
			}
		} catch (ArithmeticException e) {
			System.out.println("outer exception :: " + e.getMessage());
		}

	}

}
