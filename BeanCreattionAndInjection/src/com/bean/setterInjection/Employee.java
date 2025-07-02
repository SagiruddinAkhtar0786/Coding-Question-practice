package com.bean.setterInjection;

public class Employee {
	String name ;

	private Address address;
	public void setEmployeeAddress(Address address) {
		this.address=address;
	}
	
	public void SetName(String name) {
		this.name= name;
	}
	
	public String getName() {
		return name;
	}
	
	
	

}
