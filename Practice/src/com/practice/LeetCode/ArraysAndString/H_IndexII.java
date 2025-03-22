package com.practice.LeetCode.ArraysAndString;

public class H_IndexII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int citations[] = {1,1,1,1,1,4,4,5,6};
		int n = citations.length;
		int index = 0;
		 while(n > index && n-index >citations[index]) //o(n)
			 index++;
		 
		 System.out.println(n-index);
		 
		 int binarSearch = findHindeUsingBinarySearch(citations);
		 System.out.println(binarSearch);

	}

	private static int findHindeUsingBinarySearch(int[] citations) {
		// TODO Auto-generated method stub
		
		int left = 0, right = citations.length; 
		int n = citations.length;
		
		while(left <= right) {
			int h = (left+right)/2; //4,7
			
			if(citations[h] == n-h) // 4 ==5,5==2
				return n-h;
			else if(citations[h] > n-h)
				right = h-1; //6
			else
				left = h+1;//5
		}
		return -1;
	}

}
