package java8Features;


@FunctionalInterface
interface I2 {
	void display();
	//void withdraw();
}

/*
 * class A implements I2 { public void display() {
 * System.out.println("display method"); } }
 */

public class ConvertInLamda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A ab = new A();
		//ab.display();
		
		
		 I2 abc = () -> { System.out.println("print method using java"); };
		 
		 abc.display();
		// I2 abcd = () -> { System.out.println("print method using java withdraw"); };
		// abcd.w
		// abcd.withdraw();
		 
		 
	}

}
