package beaninjection;

public class Address {
	
	private Employee employee;
	
	public Address(Employee employee) {
		this.employee = employee;
	}

	public void display() {
		System.out.println("my name is : "+employee.getName());
	}
}
	

