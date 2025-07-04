package java8Features.com.Practice.Streams;

public class Dept {
	 private Long departmentId;
	    private String departmentName;

	    public Dept(Long departmentId, String departmentName) {
	        this.departmentId = departmentId;
	        this.departmentName = departmentName;
	    }

	    public Long getDepartmentId() { return departmentId; }
	    public String getDepartmentName() { return departmentName; }
}
