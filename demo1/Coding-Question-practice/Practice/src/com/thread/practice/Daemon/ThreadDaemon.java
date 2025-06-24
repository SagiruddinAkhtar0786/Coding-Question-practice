package com.thread.practice.Daemon;

public class ThreadDaemon extends Thread {

	
	@Override
	public void run() {
		System.out.println("is Daemon :: "+Thread.currentThread().isDaemon());
		System.out.println("Run Method");
	}
	
	//we have to create the daemon Thread before starting the thread if we create daemon thread after starting it ,
	//it will throw run time exception i.e. IlligalThreadStateException
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main Thread ....");
		ThreadDaemon DT = new ThreadDaemon();
		DT.setDaemon(true);
		DT.start();
	}

}
