package com.pracatice.Exception.unChecked;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TrywithResource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try( BufferedReader bf = new BufferedReader(new FileReader("testingFIle.text"))){
			String line;
			while((line = bf.readLine()) != null)
				System.out.println(line);
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
