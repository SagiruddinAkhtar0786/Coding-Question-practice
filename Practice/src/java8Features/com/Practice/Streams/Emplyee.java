package java8Features.com.Practice.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
	int id;
	String name;
	int age;
	
	public Employee(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

	/*
	 * @Override public String toString() { return "Employee [id=" + id + ", name="
	 * + name + ", age=" + age + "]"; }
	 */
	
}

public class Emplyee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> lst = new ArrayList<>();
		lst.add(new Employee(1,"sagir",27));
		lst.add(new Employee(2,"Raju",32));
		lst.add(new Employee(4,"Irfan",82));
		lst.add(new Employee(5,"sameer",62));
		lst.add(new Employee(3,"sagar",30));
		
		//System.out.println(lst);
		
		for(Employee emp :lst ) {
			System.out.println(emp.getId() +" "+emp.getName() +" "+emp.getAge());
		}
		
		List<String> empNams = lst.stream().map(Employee :: getName).collect(Collectors.toList());
		System.out.println(empNams);

		
	}

}
