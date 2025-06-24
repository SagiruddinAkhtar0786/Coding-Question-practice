package digitalocean.com.java.programming.interview.questions;

class OverRiding {
	public void display(String name) {
		System.out.println("result is fail for " + name);

	}

	public void nameOfCity(String name) {
		System.out.println("city Name ::  " + name);

	}
}

class OverLoading extends OverRiding {
	// this is the concept of overloading, a method have the same name but different
	// method signature
	// overloading works in same class
	/*
	 * Must have a different method signature (different number or type of
	 * parameters). Can have different return types, but the compiler does not
	 * consider return type alone for overloading. Methods can have different access
	 * modifiers. Can be applied to static and instance methods.
	 */

	public void area(int a, int b) {
		System.out.println("Area of Square :: " + (a * b));
	}

	public void area(int a, int b, int c) {
		System.out.println("Area of cube :: " + (a * b * c));

	}

	public void nameOfCity(String name1, String name2) {
		System.out.println(name1 + " ," + name2);

	}

	@Override
	public void display(String name) {
		System.out.println("result is passed for " + name);
	}

}

public class OverLoadingAndOverriding {
	
	  // Public method - Accessible everywhere
    public void publicMethod() {
        System.out.println("Public Method");
    }

    // Protected method - Accessible in the same package & subclasses
    protected void protectedMethod() {
        System.out.println("Protected Method");
    }

    // Default (Package-private) method - Accessible only within the same package
    void defaultMethod() {
        System.out.println("Default (Package-Private) Method");
    }

    // Private method - Accessible only within this class
    private void privateMethod() {
        System.out.println("Private Method");
    }
    
    public void privateMethod(int a) {
        System.out.println("Private Method int");
    }

    public void testPrivateMethod() {
        privateMethod(5); // Allowed inside the same class
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverLoading OL = new OverLoading();
		OL.area(4, 5);
		OL.area(4, 5, 6);
		OL.display("sagir");
		OL.nameOfCity("hyderabad");
		OL.nameOfCity("patna", "Mumbai");
		
		OverLoadingAndOverriding obj = new OverLoadingAndOverriding();
	        obj.publicMethod();       // ✅ Accessible
	        obj.protectedMethod();    // ✅ Accessible
	        obj.defaultMethod();      // ✅ Accessible
	      //  obj.privateMethod(); 
	        obj.testPrivateMethod();// ✅ Accessible (Inside the same class)
	}

}
