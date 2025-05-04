package digitalocean.com.java.programming.interview.questions;

interface useOfDefaultAndStaticMethods{
	default void usedefaultMehod1() {
		System.out.println("This is default Method one");
	}
	
	default void usedefaultMehod2() {
		System.out.println("This is default Method two");
	}
	
	static void useStaticMethod() {
		System.out.println("This is static method ");
	}
}

class overrirdeMethod implements useOfDefaultAndStaticMethods{
	@Override
	public void usedefaultMehod2() {
		System.out.println("This is default Method override");
	}
}
public class DefultAndStaticInterfceMethod implements useOfDefaultAndStaticMethods{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		useOfDefaultAndStaticMethods.useStaticMethod();
		DefultAndStaticInterfceMethod sf = new DefultAndStaticInterfceMethod();
		sf.usedefaultMehod1();
		
		overrirdeMethod oM = new overrirdeMethod();
		oM.usedefaultMehod2();
	}
	

}
