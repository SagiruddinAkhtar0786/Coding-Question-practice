package com.DesignPatterns;

public class InstanceMainClass {
	public static void main(String[] args) {
		 Singleton obj1 = Singleton.getInstance();  // Allowed, using getInstance()
	       // Singleton obj2 = Singleton.getInstance();  // Same instance is returned

	}
}
