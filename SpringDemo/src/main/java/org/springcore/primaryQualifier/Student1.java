package org.springcore.primaryQualifier;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("StudentInterface")
@Primary
public class Student1 implements StudentInterface{
	
	@Override
	public String getName() {
		return "stuend 1 (Primary)";
	}
}
