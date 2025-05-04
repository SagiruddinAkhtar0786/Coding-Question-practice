package digitalocean.com.java.programming.interview.questions;


interface Banks{
	//public abstract void withdraw();
	default void withdraw() {
		System.out.println("Interface Bank withdraw");
	}
}

interface UnionBnk extends Banks{
	default void withdraw() {
		System.out.println("Interface Union withdraw");
	}
}


interface SbII extends Banks{
	default void withdraw() {
		System.out.println("Interface SBI withdraw");
	}
}

//AllBank inherits from both SBI and union
class AllBank implements UnionBnk,SbII{
	 // Must override show() to resolve ambiguity
	@Override
	public void withdraw() {
		UnionBnk.super.withdraw();// Explicitly calling Union's withdraw() method
		SbII.super.withdraw();// Explicitly calling SBI's withdraw() method
	}

	
}
public class DiamondProblemSolution_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AllBank ab = new AllBank();
		ab.withdraw();
	}

}
