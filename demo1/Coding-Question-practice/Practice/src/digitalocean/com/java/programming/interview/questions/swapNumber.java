package digitalocean.com.java.programming.interview.questions;

import java.util.Arrays;
import java.util.stream.Collectors;

public class swapNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =10;
		int b = 20;
		
		a = a+b; //a = 30 ,b = 20
		b = a-b;  //30-20 = 10 = b
		a = a-b; //a = 30-10 = 20
		System.out.println(" a : "+a+" , "+" b : "+b);
		
		
			}

}
