package com.bean.FieldInjection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Person person = (Person) context.getBean(Person.class);
        person.showDetails();
    }
}
