package com.pyramid.Pattern;

import java.util.Scanner;

public class Pattern_2 {
	/*
	enter the number of rows :: 
			5
		    1 
		   1 2 
		  1 2 3 
		 1 2 3 4 
		1 2 3 4 5 

	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number of rows :: ");
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		
		for(int i = 1 ; i <= n ;i++) {
			for(int j = 1; j<= n -i ; j++) {
				System.out.print(" ");
			}
			
			for(int k = 1 ;  k <= i ; k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}

}
