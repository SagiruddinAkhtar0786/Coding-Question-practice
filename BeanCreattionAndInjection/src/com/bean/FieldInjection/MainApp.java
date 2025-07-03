package com.bean.FieldInjection;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

      //  AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Employee person = (Employee) context.getBean(Employee.class);
        person.showDetails();
        
        
        
    }
}
