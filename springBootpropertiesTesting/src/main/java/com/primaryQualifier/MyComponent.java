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
    
 // If you used only this constructor without @Qualifier,
    // and you had @Primary on a bean, the primary bean would be injected.



    public void printDataSource() {
        System.out.println("Injected DataSource: " + dataSource.getName());
    }
	
}
