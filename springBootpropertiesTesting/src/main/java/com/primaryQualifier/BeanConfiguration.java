package com.primaryQualifier;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class BeanConfiguration {

	
	@Bean
	@Primary	
	public DataSource primaryDataSource() {
		System.out.println("Primary DataSource created");
		return new DataSource("Primary_DB");
	}
	
	
	@Bean
	public DataSource SecondaryDataSource() {
		System.out.println("Secondary DataSource created");
		return new DataSource("Secondary_DB");
	}
}

