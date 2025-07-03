package com.bean.FieldInjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Address address() {
        return new Address("New York", "NY");
    }
    @Bean
    public Employee person() {
        return new Employee("John Doe");
    }

}
