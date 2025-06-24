package com.pyramid.Pattern;

import java.util.Scanner;

public class Pattern_6 {
	/*	
	Enter the number of rows
			5
		* * * * * 
		 * * * * 
		  * * * 
		   * * 
    * 
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.out.println("Enter the number of rows");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = n ; i >=1 ; i--) {
			for(int j = 0 ; j < n-i ;j++) {
				System.out.print(" ");
			}
			
			for(int j = 1 ; j <= i ;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
