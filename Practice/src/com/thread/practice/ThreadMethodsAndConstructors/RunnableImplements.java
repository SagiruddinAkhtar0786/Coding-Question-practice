package com.thread.practice.ThreadMethodsAndConstructors;

public class RunnableImplements  implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("runnablel interface >> "+Thread.currentThread());
		System.out.println("runnablel interface >> "+Thread.currentThread().getName());

		
	}

}
