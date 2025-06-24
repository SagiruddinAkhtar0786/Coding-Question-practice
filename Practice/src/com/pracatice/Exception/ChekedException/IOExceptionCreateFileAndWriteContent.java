package com.pracatice.Exception.ChekedException;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOExceptionCreateFileAndWriteContent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("testingFIle.text");
		String content = "hi\nhello\nsagir\nhow are you\nyeha i am good";
		
		try {
			if(!file.exists()) {
				file.createNewFile();
				System.out.println("fileCreated");
				
			}
			
			BufferedWriter bf  =new BufferedWriter(new FileWriter(file));
			bf.write(content);
			bf.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		readFile(file);

	}

	private static void readFile(File file) {
		// TODO Auto-generated method stub
		System.out.println(file);
		try {
			String line;
			BufferedReader bfread = new BufferedReader(new FileReader(file));
			while((line=bfread.readLine()) != null) {
				System.out.println(line);
			}
			bfread.close();
		}catch(IOException e) {
			System.out.println("file not found :: "+e.getMessage());
		}
		
	}

}
