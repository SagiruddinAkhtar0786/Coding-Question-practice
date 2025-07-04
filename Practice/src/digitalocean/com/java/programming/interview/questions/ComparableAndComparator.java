package digitalocean.com.java.programming.interview.questions;

import java.util.Arrays;
import java.util.Comparator;

class Employee implements Comparable<Employee> {
	int id;
	String name;
	Double salary;

	public Employee() {

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

	/*@Override
	public int compareTo(Employee emp) {
		// let's sort the employee based on an id in ascending order
		// returns a negative integer, zero, or a positive integer as this employee id
		// is less than, equal to, or greater than the specified object.
		return (this.id - emp.id);
	}*/
	
	@Override
	public int compareTo(Employee emp) {
		// let's sort the employee based on an id in ascending order
		// returns a negative integer, zero, or a positive integer as this employee id
		// is less than, equal to, or greater than the specified object.
		return (int)(this.salary - emp.salary);
	}

	@Override
	public String toString() {
		return "employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	// Comparator use
	
	public static Comparator<Employee> salaryComparator = new Comparator<Employee>() {
		@Override
		public int compare(Employee e1 , Employee e2) {
			return (int)(e1.getSalary() - e2.getSalary());
		}
	};
	
	public static Comparator<Employee> idComparator= new Comparator<Employee>() {
		@Override
		public int compare(Employee e1,Employee e2) {
			return e1.getId() - e2.getId();
		}
		
	};
	public static Comparator<Employee> NameComparator = new Comparator<Employee>() {

        @Override
        public int compare(Employee e1, Employee e2) {
            return e1.getName().compareTo(e2.getName());
        }
    };

}

public class ComparableAndComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] empArr = new Employee[4];
		empArr[0] = new Employee(1, "sagir1", 2346.70);
		empArr[1] = new Employee(4, "sagir2", 2340.70);
		empArr[2] = new Employee(9, "sagir3", 2349.70);
		empArr[3] = new Employee(3, "sagir4", 2341.70);

		Arrays.sort(empArr); // compile time error
		//empArr.toString();
		System.out.println(Arrays.toString(empArr));
		// Employee em = new Employee();

		// System.out.println(em.getId() + ".. "+em.getName());
		
		Arrays.sort(empArr,Employee.salaryComparator);
		System.out.println("Employees list sorted by Salary:\n"+Arrays.toString(empArr));
		Arrays.sort(empArr,Employee.idComparator);
		System.out.println("Employees list sorted by Salary:\n"+Arrays.toString(empArr));
		
		for(Employee st:empArr){  
			System.out.println(st.id+" "+st.name+" "+st.salary);  
			}
		

	}

}
