package com.pracatice.Exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			 findFile("D:\\GitRepository\\Practice\\ThrowsCode.text");
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("rest of the code.....");
	}

	

	private static boolean findFile(String Filelocation) throws FileNotFoundException {
		// TODO Auto-generated method stub
		FileReader file  = new FileReader(Filelocation);
		BufferedReader bf = new BufferedReader(file);
		
		throw new FileNotFoundException();
		//return false;
	}

}
