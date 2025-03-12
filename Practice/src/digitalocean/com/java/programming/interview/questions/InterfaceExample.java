package digitalocean.com.java.programming.interview.questions;

interface MyInterface {
    // ✅ Variables (implicitly public, static, and final)
    int X = 10;  // Equivalent to: public static final int X = 10;
    String NAME = "InterfaceExample";  // public static final String NAME = "InterfaceExample";

    // ✅ Abstract method (must be implemented in a class)
    void abstractMethod();

    // ✅ Default method (Java 8+)
    default void defaultMethod() {
        System.out.println("This is a default method.");
    }

    // ✅ Static method (Java 8+)
    static void staticMethod() {
        System.out.println("This is a static method.");
    }

    // ✅ Private method (Java 9+)
   /* private void privateMethod() {
        System.out.println("This is a private method.");
    }*/

    // ✅ Private static method (Java 9+)
  /*  private static void privateStaticMethod() {
        System.out.println("This is a private static method.");
    }*/
}

// Implementing class
class MyClass implements MyInterface {
    @Override
    public void abstractMethod() {
        System.out.println("Implemented abstract method.");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.abstractMethod();  // Calls implemented method
        obj.defaultMethod();   // Calls default method from interface

        // Static method can be called directly using the interface name
        MyInterface.staticMethod();

        // Accessing variables (static & final)
        System.out.println("X = " + MyInterface.X);
        System.out.println("NAME = " + MyInterface.NAME);
    }
}
