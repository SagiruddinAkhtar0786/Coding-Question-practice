package com.thread.practice.ThreadMethodsAndConstructors;

class JoinMethodTesting extends Thread {
//	Thread mainThread;

	@Override
	public void run() {

		for (int i = 0; i < 5; i++)
			System.out.println("Thread without Yield :: " + Thread.currentThread());
	}
}

public class joinMethod  {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// mainThread = Thread.currentThread();

		JoinMethodTesting JMT = new JoinMethodTesting();
		JMT.start();
		JMT.setName("sr_Akhtar");
		//JMT.start();

		try {
			JMT.join();
			for (int i = 0; i < 5; i++)
				System.out.println("Thread without Yield >> " + Thread.currentThread());

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
