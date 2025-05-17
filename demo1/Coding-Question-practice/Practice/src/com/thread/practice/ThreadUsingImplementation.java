package com.thread.practice;

public class ThreadUsingImplementation implements Runnable  {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++)
			System.out.println("implement runnable Thread :: "+Thread.currentThread()+"  : "+i);
	}

	

}
