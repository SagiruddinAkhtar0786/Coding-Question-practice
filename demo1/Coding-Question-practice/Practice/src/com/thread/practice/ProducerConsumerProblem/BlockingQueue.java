package com.thread.practice.ProducerConsumerProblem;

import java.util.LinkedList;
import java.util.Queue;

public class BlockingQueue {
	private Queue<Integer> q;
	private int capacity;
	
	public BlockingQueue(int cap) {
		q = new LinkedList<>();
		capacity = cap;

	}
	
	public boolean add(int item) {
		synchronized(q) {
			if(q.size() == capacity) {
				try {
					q.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
				
				q.add(item);
			q.notifyAll();
				return true;
		}
	}
	
	public int remove() {
		synchronized(q) {
			if(q.size() == 0) {
				try {
					q.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
				
				int element = q.poll();
				q.notifyAll();
			return element;
				
		}
	}
}
