package com.primaryQualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MyComponent {

	private final DataSource dataSource;
	
	 
    // Explicitly inject Primary data source if we remove @Qualifier
	/*
	 * public MyComponent( DataSource dataSource) { this.dataSource = dataSource; }
	 */
	

    // Explicitly inject secondaryDataSource
    public MyComponent(@Qualifier("SecondaryDataSource") DataSource dataSource) {
        this.dataSource = dataSource;
    }
    
   


    public void printDataSource() {
        System.out.println("Injected DataSource: " + dataSource.getName());
    }
	
}
