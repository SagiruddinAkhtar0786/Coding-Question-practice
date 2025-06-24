package java8Features.com.Practice.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Execution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Emp> employeeList = new ArrayList<>();
		employeeList.add(new Emp(1L,"sagir",12L));
		employeeList.add(new Emp(2L,"Raj",34L));
		employeeList.add(new Emp(3L,"Sameer",12L));
		
		//Depat List
		List<Dept> DeptLsit = new ArrayList<>();
		DeptLsit.add(new Dept(12L,"HR"));
		DeptLsit.add(new Dept(54L,"IT"));
		
		String targetDeptName = "HR";
		
		Optional<Long> deptId = DeptLsit.stream().filter(dpt -> dpt.getDepartmentName().equalsIgnoreCase(targetDeptName)).map(Dept :: getDepartmentId).findFirst();
		List<Emp> filteredList = null;
		if(deptId.isPresent()) {
		//filteredList = employeeList.stream().filter(empL -> empL.getDeptId().equals(deptId.get())).map(Emp :: getEmpName).collect(Collectors.toList());
		filteredList = employeeList.stream().filter(empL -> empL.getDeptId().equals(deptId.get())).collect(Collectors.toList());

		}
		System.out.println(filteredList);
		

	}

}
