package com.bean.FieldInjection;

@Configuration
public class AppConfig {
    @Bean
    public Address address() {
        return new Address("New York", "NY");
    }
    @Bean
    public Person person() {
        return new Person("John Doe");
    }

}
