package digitalocean.com.java.programming.interview.questions;

interface bank{
	public abstract void deposit();
	public abstract void withdraw();
}

class unionBank implements bank{

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		
	}
	
}

class BOI implements bank{

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		
	}
	
}
//public class DiamondProblemIssue extends unionBank,BOI { // won't compile 


public class DiamondProblemIssue extends unionBank { // won't compile  if we extends two class
	
	//diamond problem occurs when we try to extends multiple class , we try to inherit multiple class
	//while inheritting it is unclear that which method  from which class to execute
	//To overcome with this problem we create the interface and create the object of implemetned classwhich
	//implemts method of interface

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
