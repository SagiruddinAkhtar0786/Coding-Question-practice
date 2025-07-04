package com.thread.practice;

public class ThreadConcept {

	public static void main(String[] args) {	
		//FirstThreadClass t1 = new FirstThreadClass("sr_akh");
		//t1.start();
		
		Thread thread = new FirstThreadClass("sr_akhtar");		
		thread.setDaemon(false);
		thread.start();
		ThreadUsingImplementation th = new ThreadUsingImplementation();
		Thread thread2 = new Thread(th,"sr_akhtar_thread");
		thread2.start();
		//// second way to call runnable interface without creating ThreadUsingImplementation class, no need to create class explicitly 
		Thread thd = new Thread(()->{
			for(int i = 0 ; i <5 ;i++) {
				System.out.println("using lamda expression :: "+Thread.currentThread()+" , "+i);
			}
		},"akhtar ");
		
		thd.start();
	}
}
