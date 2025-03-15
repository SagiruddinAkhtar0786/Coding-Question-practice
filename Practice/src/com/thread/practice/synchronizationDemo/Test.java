package com.thread.practice.synchronizationDemo;

class callThread implements Runnable{
	
	int seat = 0;
	
	//System.out.println("seat booked successfully...");

	BookTheaterSeat BTS ;
	
	public callThread(BookTheaterSeat bts ,int seats) {
		this.seat = seats;
		this.BTS = bts;
	}
	
	
	@Override
	public void run() {
		System.out.println("seat : : "+seat);
		BTS.bookSeat(seat);
	}
}


public class Test {

	public static void main(String[] args) {
		
		BookTheaterSeat BTS = new BookTheaterSeat();
	
		Thread t1 = new Thread(new callThread(BTS,7));
		t1.start();
		
		Thread t2 = new Thread(new callThread(BTS,9));
	
		t2.start();
	}

}
