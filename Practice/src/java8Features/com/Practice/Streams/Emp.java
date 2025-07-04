package java8Features.com.Practice.Streams;

public class Emp {
	
	private Long empId;
    private String empName;
    private Long deptId;

    public Emp(Long empId, String empName, Long deptId) {
        this.empId = empId;
        this.empName = empName;
        this.deptId = deptId;
    }

    public Long getDeptId() { return deptId; }
    public String getEmpName() { return empName; }
    public Long getEmpId() { return empId; }

    @Override
    public String toString() {
        return "Emp{id=" + empId + ", name='" + empName + "'}";
    }

}
