package com.thread.practice.ThreadMethodsAndConstructors;

class JoinMethodTesting extends Thread {
//	Thread mainThread;
	static Thread mainThread;

	@Override
	public void run() {
		for (int i = 0; i < 5; i++)
			System.out.println("Thread without Yield :: " + Thread.currentThread());
		
		 System.out.println(Thread.currentThread().getName() + " has finished work.");
	}
}

public class joinMethod {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// mainThread = Thread.currentThread();

		JoinMethodTesting JMT = new JoinMethodTesting();
		JMT.start();
		JMT.setName("JMT1");

		JoinMethodTesting JMT2 = new JoinMethodTesting();
		JMT2.start();
		JMT2.setName("JMT2");

		try {

			JMT.join();
		//	JMT2.join();
		} catch (Exception de) {
			de.printStackTrace();
		}
		// JMT.start();

		/*
		 * try { JMT.join(); // mainThread.join(); for (int i = 0; i < 5; i++)
		 * System.out.
		 * println(" This loop first executes because srAkhtar thred has join method >> "
		 * + Thread.currentThread());
		 * 
		 * } catch (InterruptedException e) { e.printStackTrace(); }
		 */

	}

}
