package com.thread.practice.volatilee;

class SharedData {
    static boolean flag = false; // No volatile
}

class Thread1 extends Thread {
    public void run() {
        while (!SharedData.flag) {
            // Looping infinitely because 'flag' is cached!
        }
        System.out.println("Thread1 detected flag change!");
    }
}

public class ProblemWithoutVolatile {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		new Thread1().start();
        Thread.sleep(2000); // Simulating delay
        SharedData.flag = true; // Updated by main thread
        
        System.out.println("Main thread updated flag to true  : "+SharedData.flag);
	}

}
