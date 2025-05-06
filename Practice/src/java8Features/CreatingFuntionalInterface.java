package java8Features;


@FunctionalInterface
interface I{
	void display();

	void withdraw();
}
public class CreatingFuntionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		I1 obj = () ->{
			System.out.println("interface implementation");
		};
		
		obj.display();

	}

}
