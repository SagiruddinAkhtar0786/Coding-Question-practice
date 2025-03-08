package digitalocean.com.java.programming.interview.questions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Find_String_In_Text_File {
	private static boolean findStringFromFile(String str, String filepath) throws FileNotFoundException {
		
		File file = new File(filepath);
		Scanner sc = new Scanner(file);
		
		while(sc.hasNextLine()) {
			String line = sc.nextLine().toLowerCase();
			if(line.contains(str)) {
				sc.close();
				return true;
			}			
		}
		sc.close();
		
		return false;
	}

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		String str = "sagiruddin";
		String filePath = "D:\\shabnam\\TestingFile.txt";
		boolean result =findStringFromFile(str,filePath);
		
		if(result) {
			System.out.println("found the string :: "+str);
		}
		else
			System.out.println("not found");
	}

}
