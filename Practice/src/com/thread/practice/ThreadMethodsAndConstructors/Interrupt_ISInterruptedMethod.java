package com.thread.practice.ThreadMethodsAndConstructors;


class interruptUsee implements Runnable{
	/*@Override
	public void run() {
		for(int i = 0 ; i < 10;i++) {
			
			System.out.println("Thread before interruption");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				System.out.println("Interrrupted Exceptions due to interruption "+e.getMessage());
			}
		}
		
	}*/
	
	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().isInterrupted());
		System.out.println("A : "+Thread.interrupted());
		try {
		for(int i = 0 ; i < 5;i++) {
			
			System.out.println("Thread before interruption");
		//	System.out.println("check interruption : "+Thread.interrupted()); // after use of sleep method ,it will change the status of Thread from false to true.

				Thread.sleep(1000);
				System.out.println("B : "+Thread.interrupted()); // after use of sleep method ,it will change the status of Thread from false to true.

			}
		}catch(InterruptedException e) {
				e.printStackTrace();
				System.out.println("Interrrupted Exceptions due to interruption>> "+e.getMessage());
			}
		
		
	}
}

public class Interrupt_ISInterruptedMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread th = new Thread(new interruptUsee());
		th.start();
		th.interrupt();
	}

}
