package com.thread.practice.ThreadMethodsAndConstructors;

class JoinMethodTesting extends Thread{
	
	
	@Override
	public void run() {
		
		for(int i = 0;i<5;i++)
			System.out.println("Thread without Yield :: "+Thread.currentThread());
	}
}


public class joinMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JoinMethodTesting JMT = new JoinMethodTesting();
		JMT.start();
		JMT.setName("sr_Akhtar");
		
	
		try {
			JMT.join(); //✅ Main thread waits until sr_Akhtar is finished, then it resumes execution.


		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
			for(int i = 0;i<5;i++)
				System.out.println("Thread without Yield >> "+Thread.currentThread());
		
	}

}
