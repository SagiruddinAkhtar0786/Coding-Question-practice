package com.thread.practice;

public class ThreadConcept {

	public static void main(String[] args) {	
		FirstThreadClass t1 = new FirstThreadClass("sr_akh");
		Thread thread = new FirstThreadClass("sr_akhtar");		
		thread.setDaemon(false);
		thread.start();
		t1.start();
		
		ThreadUsingImplementation th = new ThreadUsingImplementation();
		Thread thread2 = new Thread(th,"sr_akhtar_thread");
		thread2.start();
	}
}
