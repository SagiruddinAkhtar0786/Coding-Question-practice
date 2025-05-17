package com.pyramid.Pattern;

import java.util.Scanner;

public class Pattern_1 {
	/*
	 * Enter the number of Rows 
		5
			    1 
			   2 2 
			  3 3 3 
			 4 4 4 4 
			5 5 5 5 5 

	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the number of Rows ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

	}
}
