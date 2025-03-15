package com.thread.practice.synchronizationDemo;

public class BookTheaterSeat {
	
	static int TotalSeats = 20; 
	
	//synchronized method
	static synchronized void bookSeat(int seats) {
		
		if(TotalSeats >= seats) {
			System.out.println("seat booked successfully...");
			TotalSeats = TotalSeats-seats;
			System.out.println("seat left :: "+TotalSeats);
		}else {
			System.out.println("seeats can not be booked ....");
			TotalSeats = TotalSeats-seats;
		}
	}
	
/*	
 void bookSeat(int seats) {
	 
	 System.out.println("thread Name :: " +Thread.currentThread().getName());
	 System.out.println("thread Name :: " +Thread.currentThread().getName());
	 System.out.println("thread Name :: " +Thread.currentThread().getName());
	 System.out.println("thread Name :: " +Thread.currentThread().getName());
	 System.out.println("thread Name :: " +Thread.currentThread().getName());
	 System.out.println("thread Name :: " +Thread.currentThread().getName());
	 
		//synchronized Block
	 synchronized(this) {
		 if(TotalSeats >= seats) {
				System.out.println("seat booked successfully...");
				TotalSeats = TotalSeats-seats;
				System.out.println("seat left :: "+TotalSeats);
			}else {
				System.out.println("seeats can not be booked ....");
				TotalSeats = TotalSeats-seats;
			}
	 }	
	 System.out.println("thread Name :: " +Thread.currentThread().getName());
	 System.out.println("thread Name :: " +Thread.currentThread().getName());
	 System.out.println("thread Name :: " +Thread.currentThread().getName());
	 System.out.println("thread Name :: " +Thread.currentThread().getName());
	 System.out.println("thread Name :: " +Thread.currentThread().getName());
	 System.out.println("thread Name :: " +Thread.currentThread().getName());

		
	}*/

}
