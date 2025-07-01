package com.DesignPatterns;

public class Singleton {
	
	private static Singleton instance = null; // it holds only one instance variable
	
	private Singleton() {
		// prevents external instantiation
	}
	static int count = 0;
	public static Singleton getInstance() {
		
		if(instance == null) {
			instance = new Singleton();
			count++;
			System.out.println("instance created... Count :: "+count);
		}
		
		return instance;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       // Singleton obj = new Singleton();  // Not allowed: private constructor

      //  Singleton obj1 = Singleton.getInstance();  // Allowed, using getInstance()
       // Singleton obj2 = Singleton.getInstance();  // Same instance is returned


	}

}
