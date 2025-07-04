package com.pracatice.Exception.ChekedException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IOException_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String currentPath = System.getProperty("user.dir");
			System.out.println("Current working directory: " + currentPath);
			BufferedReader bf = new BufferedReader(new FileReader("test.text"));
			String line ;
			
			while((line =bf.readLine()) != null) {
				
				System.out.println(line);
				
			}
			
			bf.close();
		}catch(IOException e) {
			System.out.println("file is empty : "+e.getMessage());
		}

	}

}
