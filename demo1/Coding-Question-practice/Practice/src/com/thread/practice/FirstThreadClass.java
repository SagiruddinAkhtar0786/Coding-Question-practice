package com.thread.practice;

public class FirstThreadClass extends Thread {
	
	public FirstThreadClass(String threadName) {
		super(threadName);
	}

	
	@Override
	public void run() {
		for(int i = 0; i<5 ;i++) {
			System.out.println("inside "+Thread.currentThread()+" Thread "+i);
		}
	}
}
