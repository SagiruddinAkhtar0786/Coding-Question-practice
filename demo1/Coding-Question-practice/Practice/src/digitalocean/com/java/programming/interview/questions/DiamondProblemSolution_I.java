package digitalocean.com.java.programming.interview.questions;

interface Bank {

	public abstract void Deposit();
}

class Unionbank implements Bank {

	@Override
	public void Deposit() {
		// TODO Auto-generated method stub
		System.out.println("deposit in union Bank");

	}

}

class Sbi implements Bank {
	@Override
	public void Deposit() {
		// TODO Auto-generated method stub
		System.out.println("deposit in SBi Bank");

	}
}

public class DiamondProblemSolution_I {
//The Diamond Problem occurs in multiple inheritance when a class inherits 
	// from two classes that both have a method with the same name.
	// This creates ambiguity because the compiler does not know which method to
	// call.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Java allows multiple inheritance only through interfaces to avoid this issue.
		Bank union = new Unionbank();
		union.Deposit();

		Bank sbi = new Sbi();
		sbi.Deposit();

	}

}
