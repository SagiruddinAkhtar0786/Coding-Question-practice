package com.thread.practice.synchronization;

public class ThreadMain {

	public static void main(String[] args) {
	
		System.out.println("Main starts .....");
		Stack stack = new Stack(5);
		
		new Thread(() -> {
			int counter = 0;
			while(++counter < 9) {
				System.out.println("Pushed :: "+stack.push(100) +" Thread :: "+Thread.currentThread());
			}
		},"pusher").start();
		
		
		new Thread(() -> {
			int counter = 0;
			while(++counter < 9) {
				System.out.println("Popped :: "+stack.pop());
			}
		},"popper").start();
		
		System.out.println("Main exits .....");

	}

}
