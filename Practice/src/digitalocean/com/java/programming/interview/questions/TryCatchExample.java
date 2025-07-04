package digitalocean.com.java.programming.interview.questions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchExample {

	public static void main(String[] args) {
		int n = 10;
		int result=0;
		for(int i = 0 ; i <n ; i++) {
			try {
				
				result = n/i; 
				System.out.println(result);

			}catch(ArithmeticException e){
				e.printStackTrace();
			}
		}
		//System.out.println(result);
		
		try {
			FileInputStream fis  =new FileInputStream("sagir.txt");
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
