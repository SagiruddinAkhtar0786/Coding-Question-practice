package com.thread.practice.Demo;


//singleTaskFromMultipleThread
public class singleTaskFromMultipleThread extends Thread{
	@Override
	public void run() {
		System.out.println("Thread ....");
	}
	public static void main(String[] args) {  // main thread made by JVM 
		// TODO Auto-generated method stub
		singleTaskFromMultipleThread mt = new singleTaskFromMultipleThread();
		mt.start();
		singleTaskFromMultipleThread mt2 = new singleTaskFromMultipleThread();
		mt2.start();
		

	}

}
