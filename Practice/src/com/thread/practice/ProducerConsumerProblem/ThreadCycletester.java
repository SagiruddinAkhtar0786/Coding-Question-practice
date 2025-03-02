package com.thread.practice.ProducerConsumerProblem;

public class ThreadCycletester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread thread = new Thread(() -> {
			try {
				Thread.sleep(1);
				for(int i = 100; i>0 ;i--);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		},"States");
		
		thread.start();
		
		while(true) {
			Thread.State state = thread.getState();
			System.out.println("state :: "+state);
			
			if(state == Thread.State.TERMINATED)
				break;
		}

	}

}
