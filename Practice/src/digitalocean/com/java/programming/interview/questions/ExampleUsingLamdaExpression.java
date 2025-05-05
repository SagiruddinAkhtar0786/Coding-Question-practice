package digitalocean.com.java.programming.interview.questions;

public class ExampleUsingLamdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r1 = () -> System.out.println("this is runnable in :: "+Thread.currentThread().getName() +" Thread");
	//	r1.run();
		
		// using below code runnning in separate cal stack
		Thread t1 = new Thread(r1);
		t1.start();
	}

}
/*
No, calling r1.run(); directly does not create a new call stack or thread. 
It simply executes the run() method in the same main thread like a normal method call.
*/