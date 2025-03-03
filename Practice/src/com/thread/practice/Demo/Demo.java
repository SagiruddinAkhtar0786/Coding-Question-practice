package com.thread.practice.Demo;


// single task from single thread
public class Demo extends Thread{

	@Override
	public void run() {
		System.out.println("Thread Run ... ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo dm = new Demo();
		dm.start();
	}

}
