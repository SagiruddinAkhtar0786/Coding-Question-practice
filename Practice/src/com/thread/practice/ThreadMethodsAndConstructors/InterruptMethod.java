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
		for(int i = 0 ; i < 10;i++) {
			
			System.out.println("Thread before interruption");
			
				Thread.sleep(1000);
			}
		}catch(InterruptedException e) {
				System.out.println("Interrrupted Exceptions due to interruption "+e.getMessage());
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

	}

}
