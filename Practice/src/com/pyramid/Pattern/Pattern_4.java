package com.pyramid.Pattern;

import java.util.Scanner;

public class Pattern_4 {
	
	/*
	 * enter the number of rows : 
				5
		        1 
		      1 2 1 
		    1 2 3 2 1 
		  1 2 3 4 3 2 1 
		1 2 3 4 5 4 3 2 1 

	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number of rows : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 1 ; i <= n; i++) {
			for(int j = 1 ; j <=2*n-(2*i) ;j++) {
				System.out.print(" ");
			}
			for(int k = 1 ; k <= i ;k++) {
				System.out.print(k+" ");
			}
			for(int k = i-1 ; k >= 1 ;k--) {
				System.out.print(k+" ");
			}
			System.out.println();

		}
	}

}
