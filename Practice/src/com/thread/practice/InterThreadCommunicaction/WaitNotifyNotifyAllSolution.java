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
			//notify to the thread that task completed
			this.notify();//wakes up the waiting thread
		} // releases the lock on TE after exiting the block
		
	}
}
public class WaitNotifyNotifyAllSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		totalEarnngss TE = new totalEarnngss();
		TE.start();
		
		synchronized(TE) {
			try {
				// 🔒 Lock acquired here
			    TE.wait();       // ❗ Releasing lock temporarily and waiting
			    // 🔒 Lock re-acquired after being notified
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("total earning after wait nad notify :: "+TE.total+" Rs.");
	}

}
