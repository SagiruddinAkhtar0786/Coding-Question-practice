package java8Features.com.Practice.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
	int id;
	String name;
	int age;
	int salary;
	
	public Employee(int id, String name, int age,int salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary= salary;
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
	
	public int getSalary() {
		return salary;
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
		lst.add(new Employee(1,"sagir",27,100000));
		lst.add(new Employee(2,"Raju",32,200000));
		lst.add(new Employee(4,"Irfan",82,23000));
		lst.add(new Employee(5,"sameer",62,560000));
		lst.add(new Employee(3,"sagar",30,564444));
		
		//System.out.println(lst);
		
		for(Employee emp :lst ) {
			System.out.println(emp.getId() +" "+emp.getName() +" "+emp.getAge());
		}
		
		//get all names of employees
		List<String> empNams = lst.stream().map(Employee :: getName).collect(Collectors.toList());
		System.out.println(empNams);
		
		// get salary
		
		List<Integer> salList = lst.stream().map(Employee :: getSalary).collect(Collectors.toList());
		System.out.println(salList);
		
		//salary greate then 200000
		
		List<Integer> salaryGreater = lst.stream().filter(ListEmp->ListEmp.getSalary() > 200000)
				.map(Employee :: getSalary)
				.collect(Collectors.toList());
		
		System.out.println(salaryGreater);
		

		
	}

}
