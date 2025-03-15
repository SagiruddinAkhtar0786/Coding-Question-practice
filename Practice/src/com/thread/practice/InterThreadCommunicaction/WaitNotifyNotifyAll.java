package com.thread.practice.InterThreadCommunicaction;

class totalEarnings extends Thread{
	int total = 0;
	
	@Override
	public void run() {
		for(int i = 0 ; i< 10;i++) {
			total +=100;
		}
	}
}


public class WaitNotifyNotifyAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		totalEarnings TE = new totalEarnings();
		TE.start();
		
		System.out.println("Total Earnings : "+TE.total+"Rs");
	}

}
