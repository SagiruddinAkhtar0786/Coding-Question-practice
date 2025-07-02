package com.bean.setterInjection;

public class BeanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();

		
		Address address = new Address();
		address.setCity("hyderabad");
		address.setState("Telanagana");
		
		emp.setEmployeeAddress(address);
		emp.SetName("Sagiruddin");
		
		
		System.out.println(address.getCity() +" , "+address.getState());
	}

}
