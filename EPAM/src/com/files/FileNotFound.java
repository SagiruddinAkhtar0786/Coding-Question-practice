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
		
		
		/*
		  FileInputStream fis = new FileInputStream("D:\\example.txt");

        int b;
        while ((b = fis.read()) != -1) {
            System.out.print((char) b); // converting byte to char
        }

        fis.close();
		 */
	}

}
//fileinputStream
//file
//FileReader
//bufferedReder


/*
 * Often used together in combinations:
 * 
 * File: To check if a file exists or get its path/size.
 * 
 * FileReader: To read text character by character.
 * 
 * BufferedReader: To wrap FileReader and read text line by line efficiently.
 * 
 * FileInputStream: To read binary data (like images or videos) as bytes.
 * 
 */