package com.pyramid.Pattern;

import java.util.Scanner;
/*
 * enter the number of rows : 
			5
		    * 
		   * * 
		  * * * 
		 * * * * 
		* * * * * 

 * 
 */
public class Pattern_3 {
	public static void main(String[] args) {
		System.out.println("enter the number of rows : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 1 ; i <= n; i++) {
			for(int j = 1 ; j <=n-i ;j++) {
				System.out.print(" ");
			}
			for(int k = 1 ; k <= i ;k++) {
				System.out.print("* ");
			}
			System.out.println();

		}
	}
}
