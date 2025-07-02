package com.bean.ConstructorInjection;

import com.bean.setterInjection.Address;

public class Employee {
	String name ;

	private Address address;
	public Employee(Address address) {
		this.address=address;
	}
	
	public void SetName(String name) {
		this.name= name;
	}
	
	public String getName() {
		return name;
	}
	
	public void displayInfo(String name,Address address) {
		System.out.println("My name is "+name +" and I belong to "+address.getCity() +","+address.getState());
	}
}
