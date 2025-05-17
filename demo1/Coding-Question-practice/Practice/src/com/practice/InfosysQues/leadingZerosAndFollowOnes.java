package com.practice.InfosysQues;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class leadingZerosAndFollowOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//all 0s and then 1s
		
				int num = 101010;
				
				String number = String.valueOf(num);
				
				StringBuilder sb = new StringBuilder();
				int c0=0,c1=0;
				char ch [] = number.toCharArray();
				for(char c : ch) {
					if(c == '0')
						c0++;
					if(c=='1')
						c1++;
				}
				
				for(int i= 0;i<c0;i++) {
					sb.append(0);
				}
				for(int i=0;i<c1;i++) {
					sb.append(1);
				}
				
				
				System.out.println(Integer.parseInt(sb.toString()));
				System.out.println("First 0's then 1's : "+sb.toString());
				
				System.out.println("*********************Second Approach using java8******************************");
				
				String numStr = String.valueOf(num);
				
				//long count0 = numStr.chars().filter(ch -> ch=='0').count();
				 long count0 = numStr.chars().filter(h -> h == '0').count();
				 long count1 = numStr.chars().filter(h -> h == '1').count();

				//String s = new String();
				// String mmodifiedNumber = "0".repeat((int)count0)+"1".repeat((int)count1); //java 11
				 // Construct the new number with all 0s first, then 1s
				 
				 char cchq[] = new char[(int)count0];
			//	 Arrays.stream(cchq).fo
				 System.out.println("cchq "+cchq);
			        String sortedNum = new String(new char[(int)count0]).replace("\0", "0") +new String(new char[(int)count1]).replace("\0", "1");
			       // System.out.println(sortedNum.ty);
				 
				 System.out.println("Moodified Number :: "+sortedNum);
				 
					System.out.println("*********************************anothe approach using java 8**************************************");	 
					
					String modifiedString = String.valueOf(num)
											.chars() //Converts the string into a stream of integer values, where each character is represented by its ASCII value."101010".chars() → [49, 48, 49, 48, 49, 48]
											.mapToObj(i -> (char)i) // Convert int to -> Converts each ASCII integer back into a char.Stream now contains:['1', '0', '1', '0', '1', '0']
											.sorted() // sorted
											.map(String :: valueOf)
											.collect(Collectors.joining());
					
					System.out.println("********************************modifiedString ********************************? "+modifiedString);
					
					List<Integer> lst = Arrays.asList(1,0,1,0,0,1,1,0);
					Collections.sort(lst);
			        System.out.println("Collection sort method >> "+lst);

					List<Integer> ModifiedList =lst.stream().sorted().collect(Collectors.toList());
					System.out.println(ModifiedList);

				


	}

}
