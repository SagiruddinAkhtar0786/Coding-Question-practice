package com.thread.practice.Demo;
//Multiple task by Multiple thread
class MultipleTask1 extends Thread {
	@Override
	public void run() {
		System.out.println("Thread ...."+Thread.currentThread());
	}
}

class MultipleTask2 extends Thread {
	@Override
	public void run() {
		System.out.println("Thread ...."+Thread.currentThread());
	}
}

class MultipleTask3 extends Thread {
	@Override
	public void run() {
		System.out.println("Thread ...."+Thread.currentThread());
	}
}

public class multiplaeTastMyltipleThread extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MultipleTask1 mt1 = new MultipleTask1();
		mt1.start();
		MultipleTask2 mt2 = new MultipleTask2();
		mt2.start();
		MultipleTask3 mt3 = new MultipleTask3();
		mt3.start();

	}

}
