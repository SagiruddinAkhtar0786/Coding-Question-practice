package com.thread.practice.synchronization;

public class Stack {
	private int[] array;
	private int stackTop;
	Object lock ;

	public Stack(int capacity) {
		array = new int[capacity];
		stackTop = -1;
		lock = new Object();
	}

	public boolean isEmpty() {
		return stackTop < 0;
	}

	public boolean isFull() {
		return stackTop >= array.length - 1;
	}

	public boolean push(int element) {  //public synchronized boolean push(int element){} we can use this also after that 
		//		no need to use lock and in method synchronized(this) can be used instaed of lock obj

		synchronized(lock) {
			if (isFull())
				return false;

			++stackTop;
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}

			array[stackTop] = element;
			return true;
		}
		
		// below code will conflict to POP method beacuse it is not synchronized, at the same time 
		//two threads are running , will give error
		/*if (isFull())  // 
			return false;

		++stackTop;
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}

		array[stackTop] = element;
		return true;*/
	}

	public int pop() {
		synchronized(lock) {
			if (isEmpty())
				return Integer.MIN_VALUE;
			int obj = array[stackTop];
			array[stackTop] = Integer.MIN_VALUE;

			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			stackTop--;
			return obj;
		}
		
		/*if (isEmpty())
			return Integer.MIN_VALUE;
		int obj = array[stackTop];
		array[stackTop] = Integer.MIN_VALUE;

		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		stackTop--;
		return obj;*/
		
	}
}
