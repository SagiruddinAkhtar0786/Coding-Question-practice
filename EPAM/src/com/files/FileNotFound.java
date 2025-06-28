package com.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFound {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		String text = "sagirddin";
		FileReader reader = new FileReader("D:\\Personal\\personal\\15thAug_Quiz.txt");
		/*int ch;
		if(reader != null) {
			 while((ch = reader.read()) != -1) {
				 System.out.println((char) ch);
			 }
		}
		*/
		String line;
		BufferedReader bf = new BufferedReader(reader);
		if(bf != null) {
			while((line =bf.readLine()) != null)
				 System.out.println(line);

		}
		
		bf.close();
	}

}
//fileinputStream
//file
//FileReader
//bufferedReder