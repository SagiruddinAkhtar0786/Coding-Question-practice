package com.thread.practice.InterThreadCommunicaction;

import java.util.Iterator;

class totalEarnngss extends Thread {
	int total = 0;
	@Override
	public void run() {
		synchronized(this) {
			for (int i = 0 ; i < 10; i++) {
				total +=100;			
			}
			
			this.notify();
		}
		
	}
}
public class WaitNotifyNotifyAllSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		totalEarnngss TE = new totalEarnngss();
		TE.start();
		
		synchronized(TE) {
			try {
				TE.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("total earning after wait nad notify :: "+TE.total+"Rs");
	}

}
