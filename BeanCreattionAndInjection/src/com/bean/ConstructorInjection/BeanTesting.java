package com.bean.ConstructorInjection;

import com.bean.setterInjection.Address;

public class BeanTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Address address = new Address();
		address.setCity("hyderabad");
		address.setState("Telanagana");
		
		Employee emp = new Employee(address);
		emp.SetName("Sagiruddin");
		
		System.out.println(address.getCity()+","+address.getState());
		System.out.println("employee info");
		emp.displayInfo(emp.getName(), address);
	}

}
