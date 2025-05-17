package com.practice.LeetCode.ArraysAndString;

public class BestTimeToBuyAndSellStockII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int prices[] = new int[] {7,1,5,3,6,4};
		int maxProfit = findMaxProfit(prices);
		System.out.println("max Profit :: "+maxProfit);
	}

	private static int findMaxProfit(int[] prices) {
		// TODO Auto-generated method stub
		int maxProfit = 0;
		for(int i = 1 ; i<prices.length;i++) {
			if(prices[i] >prices[i-1])
				maxProfit += (prices[i] - prices[i-1]);
		}
		return maxProfit;
	}

}
