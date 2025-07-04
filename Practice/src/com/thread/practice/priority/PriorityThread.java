package com.thread.practice.priority;

class pppriorityThread extends Thread{
	
	@Override
	public void run() {
		System.out.println("child priority Thread  :: "+Thread.currentThread().getPriority());
	}
}


public class PriorityThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Main Thread old  Priority :: "+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(10);
		//Thread.currentThread().setPriority(10);

		System.out.println("Main Thread new Priority :: "+Thread.currentThread().getPriority());

		pppriorityThread PT = new pppriorityThread();
		PT.setPriority(3);
		PT.start();
	}

}
