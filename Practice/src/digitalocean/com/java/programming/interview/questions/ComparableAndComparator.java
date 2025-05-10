package digitalocean.com.java.programming.interview.questions;

import java.util.Arrays;

class Employee implements Comparable<Employee>{
	int id;
	String name;
	Double salary;
	
	public Employee(){
		
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
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Employee(int id, String name, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	 @Override
	    public int compareTo(Employee emp) {
	        //let's sort the employee based on an id in ascending order
	        //returns a negative integer, zero, or a positive integer as this employee id
	        //is less than, equal to, or greater than the specified object.
	        return (this.id - emp.id);
	    }
	
	@Override
	public String toString() {
		return "employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
	
}

public class ComparableAndComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee [] empArr = new Employee[4];
		empArr[0] = new Employee(1,"sagir1",2344.70);
		empArr[1] = new Employee(4,"sagir2",2344.70);
		empArr[2] = new Employee(9,"sagir3",2344.70);
		empArr[3] = new Employee(3,"sagir4",2344.70);
		
		Arrays.sort(empArr); // compile time error
		empArr.toString();
		System.out.println(Arrays.toString(empArr));
	//	Employee em = new Employee();
		
		//System.out.println(em.getId() + ".. "+em.getName());
		
	}

}
