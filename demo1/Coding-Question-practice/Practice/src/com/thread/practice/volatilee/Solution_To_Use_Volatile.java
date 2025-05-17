package com.thread.practice.volatilee;

class SharedDataforVolatile {
	static volatile boolean flag = false; // Using volatile
}

class Thread2 extends Thread {
	public void run() {
		while (!SharedDataforVolatile.flag) {
			// Now, flag is always read from main memory
		}
		System.out.println("Thread2 detected flag change!");
	}
}

public class Solution_To_Use_Volatile {
	public static void main(String[] args) throws InterruptedException {
		new Thread2().start();
		Thread.sleep(2000);
		SharedDataforVolatile.flag = true; // Now, Thread2 will see the update
		System.out.println("Main thread updated flag to true");
	}
}
