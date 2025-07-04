package com.pracatice.Exception;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			 findFile("D:\\GitRepository\\Practice\\ThrowsCode.text");
		}catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		//	e.printStackTrace();
		}
		
		System.out.println("rest of the code.....");
		
		
	/*	try {
			createFile("D:\\GitRepository\\Practice\\Throws.text");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	*/}

	

	private static void createFile(String fileLocation) throws IOException {
		// TODO Auto-generated method stub
		
		//FileReader file  = new FileReader(fileLocation);
		File file = new File(fileLocation);
		if(!file.exists()) {
			file.createNewFile();
			System.out.println("created new file");
		}
	}



	private static boolean findFile(String Filelocation) throws FileNotFoundException {
		
		
		// TODO Auto-generated method stub
		FileReader file  = new FileReader(Filelocation);
		BufferedReader bf = new BufferedReader(file);
		
		throw new FileNotFoundException("file nOT fOUND exception");
		//return false;
	}

}
