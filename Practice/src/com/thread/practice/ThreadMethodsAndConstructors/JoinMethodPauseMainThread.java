package com.thread.practice.ThreadMethodsAndConstructors;



public class JoinMethodPauseMainThread extends Thread{
	static Thread mainThread;
	@Override
	public void run() {
		try {
			mainThread.join();
			for(int i = 0;i<5;i++)
				System.out.println("Thread without Yield :: "+Thread.currentThread());
		}catch(Exception InterruptedException) {
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mainThread = Thread.currentThread();
	
		JoinMethodPauseMainThread JM = new JoinMethodPauseMainThread();
		JM.start();
		

		for(int i = 0;i<5;i++)
				System.out.println("Thread without Yield >> "+Thread.currentThread());
		
	}

}
