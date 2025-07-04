package com.thread.practice.DeadLock;


class user extends Thread{
	
	Object lock1;
	Object lock2;
	
	public user(Object res1, Object res2) {
		this.lock1 = res1;
		this.lock2 = res2;
	}
	@Override
	public void run() {
		synchronized(lock1) {
			System.out.println(Thread.currentThread().getName() +" locked  resource lock1");

			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				
				e.printStackTrace();
			}
			synchronized(lock2) {
				System.out.println(Thread.currentThread().getName() +" locked resource 2 ");
			}
			System.out.println("run method");
		}
		
	}
}

public class DeadLockScenario_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object resourceA = new Object();
		Object resourceB = new Object();
		user thread1 = new user(resourceA,resourceB);
	//	thread1.setName("thread 1");
		thread1.start();
		user thread2 = new user(resourceB,resourceA);
		thread2.start();
		//thread1.setName("thread 2");


	}

}
