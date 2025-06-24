package com.thread.practice.ThreadMethodsAndConstructors;

class thread0 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
			System.out.println("Thread value :: "+Thread.currentThread()+" >> " + i);
		}
	}
}

public class SleepMethod {

	public static void main(String[] args) throws InterruptedException {
		
		for (int i = 0; i < 5; i++) {

			Thread.sleep(1000);
			System.out.println("Thread value :: "+Thread.currentThread()+" >> " + i);
		}

		
		thread0 th0 = new thread0();
		th0.start();
		th0.setPriority(Thread.MAX_PRIORITY);
	}

}
