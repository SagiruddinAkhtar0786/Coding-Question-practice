package com.thread.practice.ThreadMethodsAndConstructors;

class yieldMethodTesting extends Thread{
	@Override
	public void run() {
		
		for(int i = 0;i<5;i++)
			System.out.println("Thread without Yield +"+Thread.currentThread());
	}
}


public class YieldMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		yieldMethodTesting YMT = new yieldMethodTesting();
		YMT.start();
		
		
		Thread.yield(); // if you want to stop main Thread and provide chance to other thread to execute
		for(int i = 0;i<5;i++) {
			System.out.println("Main Threaed after Yield "+Thread.currentThread()+" >> "+i);
		}
	}

}
