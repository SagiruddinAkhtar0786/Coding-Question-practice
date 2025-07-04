package com.pyramid.Pattern;

import java.util.Scanner;

public class Pattern_5 {
/*	Enter the number of rows
			5
	        5 
	      4 5 4 
	    3 4 5 4 3 
	  2 3 4 5 4 3 2 
	1 2 3 4 5 4 3 2 1 

  */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the number of rows");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p = 1;
		for(int i =n ; i>=1 ;i--) {
			
			for(int j = 1; j <= 2*n-2*p ; j++) {
				System.out.print(" ");
			}
			p++;
			for(int k = i ; k <= n ;k++) {
				System.out.print(k+" ");
			}
			//4<1
			for(int k = 1 ; k <= n-i ;k++) {
				System.out.print(n-k+" ");
			}
			System.out.println();
		}

	}

}
