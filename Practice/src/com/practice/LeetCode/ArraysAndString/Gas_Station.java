package com.practice.LeetCode.ArraysAndString;

public class Gas_Station {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int gas []= {1,2,3,4,5};
		int cost[]= {3,4,5,1,2};
	//	int gas []= {1,2,3,4,5,4,1,1,1};
	//	int cost[]= {3,4,5,1,2,1,2,10,8};
		
		int index = canCompleteCircuit(gas,cost);
		System.out.println("index of car from where it can take one complete round : "+index);

	}

	private static int canCompleteCircuit(int[] gas, int[] cost) {
		// TODO Auto-generated method stub
		
		int sum = 0 , total = 0 , position = 0;
		
		for(int i = 0 ; i< gas.length;i++) {
			sum += gas[i]-cost[i];
			
			if(sum < 0) {
				total += sum;
				sum=0;
				//position++; 
				position = i+1;
			}
		}
		
		total = total +sum;
		
		return total >= 0 ? position :-1;
	}

}


/*
class Solution {
public int canCompleteCircuit(int[] gas, int[] cost) {
    int diff = 0,  rest = 0, index = 0;

    for(int i = 0 ; i < gas.length; i++){
        diff += gas[i] - cost[i];
        rest += gas[i] - cost[i];

        if(rest < 0){
            rest = 0;
            index = i+1;
        }

    }
        if(diff < 0 || index >= gas.length) return -1;

    return index;
    
}
}*/