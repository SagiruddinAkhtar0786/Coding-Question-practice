package org.springcore.primaryQualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class School {
	
	
	@Autowired
	//@Qualifier("student2")
	private StudentInterface student;
	
	public void printStudent() {
		System.out.println("name of Student : "+student.getName());
	}
}
