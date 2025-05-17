package com.thread.practice.ThreadMethodsAndConstructors;

class interruptUse implements Runnable{
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
		try {
		for(int i = 0 ; i < 5;i++) {
			
			System.out.println("Thread before interruption");
			
				Thread.sleep(1000);
			}
		}catch(InterruptedException e) {
				System.out.println("Interrrupted Exceptions due to interruption>> "+e.getMessage());
			}
		
		
	}
}

class ThreadRunningnormally implements Runnable{
	@Override
	public void run() {
		for(int i = 0 ; i < 5 ;i++) {
			if(Thread.currentThread().isInterrupted()) {
				
				System.out.println("Thread is interrupted... >> ");
				return; // stops execution manually after checking thread interruption
			}
			/*
			 * try { Thread.sleep(1000); }catch(InterruptedException e) {
			 * System.out.println("exception occurs "+e.getMessage()); e.printStackTrace();
			 * }
			 */
		}
	}
}
public class InterruptMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	interruptUse intUse = new interruptUse();
		Thread th = new Thread(new interruptUse());
		th.start();
		th.interrupt();
		
		
		Thread thn = new Thread(new ThreadRunningnormally());
		thn.start();
		thn.interrupt();
		


	}

}
