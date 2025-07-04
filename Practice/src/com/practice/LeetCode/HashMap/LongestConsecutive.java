package com.practice.LeetCode.HashMap;

import java.util.HashMap;
import java.util.Map;

public class LongestConsecutive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] {100,4,200,1,3,2};
		
		int lengt =longestConsecutive(arr);
		System.out.println(lengt);
	}

	private static int longestConsecutive(int[] nums) {
		// TODO Auto-generated method stub
		
		Map<Integer,Boolean> exploredMap = new HashMap<>();
        int longestLength = 0;
        for(int i : nums)
            exploredMap.put(i,Boolean.FALSE);

        for(int num : nums){

              if (exploredMap.get(num)) continue;

           // exploredMap.put(num, true);
            int currentLength = 1;

            int nextNum = num+1;
            // check in forwared direction
            while(exploredMap.containsKey(nextNum) && exploredMap.get(nextNum) == false){
                currentLength++;
                exploredMap.put(nextNum,Boolean.TRUE);
                nextNum++;
            }
            //check in reverse direction  exploredMap.get(prevNum) == false
            int prevNum = num-1;
             while(exploredMap.containsKey(prevNum) && !exploredMap.get(prevNum)){
                currentLength++;
                exploredMap.put(prevNum,Boolean.TRUE);
                prevNum--  ;
            }
            longestLength = Math.max(longestLength,currentLength);
        }

        return longestLength;
		//return 0;
	}

}
