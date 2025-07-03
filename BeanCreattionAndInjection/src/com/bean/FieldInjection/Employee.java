package com.bean.FieldInjection;

public class Employee {
    private String name;
    // Field Injection using @Autowired
    @Autowired
    private Address address; // Dependent bean  

    public Employee(String name) {
        this.name = name;
    }

	public void showDetails() {
		// TODO Auto-generated method stub"bean crarred
		
		System.out.println("bean created");
		
	}

}
