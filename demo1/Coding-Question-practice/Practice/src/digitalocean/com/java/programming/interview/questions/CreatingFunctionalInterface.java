package digitalocean.com.java.programming.interview.questions;

@FunctionalInterface
interface useOfFunctionalInterface{
	void display();// compiler will change it to public abstract void display()
}

class testing implements useOfFunctionalInterface{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("display method");
	}
	
}

public class CreatingFunctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testing ts = new testing();
	
		ts.display();
		
		useOfFunctionalInterface ob = () ->System.out.println("my name is khan");
		ob.display();
		
	}

}
