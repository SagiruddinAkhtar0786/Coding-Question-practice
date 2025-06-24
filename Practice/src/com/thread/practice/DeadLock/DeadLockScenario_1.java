package com.thread.practice.DeadLock;



public class DeadLockScenario_1 {
	
	static Object res1 = new Object();
	static Object res2 = new Object();
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(()->{
			synchronized(res1) {
				System.out.println("Thread 1 : locked resource 1 ");
				
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
				
				synchronized(res2) {
					System.out.println("Thread 1 : locked resource 2 ");
				}
			}
		});
		
		Thread t2 = new Thread(() ->{
			synchronized(res2) {
				System.out.println("Thread 2 : locked resource 2");
				
				try {
					Thread.sleep(2000);
				}catch(InterruptedException e) {
					
					e.printStackTrace();
				}
				
				synchronized(res1) {
					System.out.println("Thread 2 : locked resource 1");
				}
			}
		});
		
		t1.start();
		t2.start();

	}

}
