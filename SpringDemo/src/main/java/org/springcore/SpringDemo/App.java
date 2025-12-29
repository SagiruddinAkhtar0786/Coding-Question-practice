package org.springcore.SpringDemo;
import org.springcore.primaryQualifier.AppConfig;
import org.springcore.primaryQualifier.School;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");	
       Student st =  (Student) context.getBean("student1");
       
       System.out.println(st);
       
       
       //Remove @Qualifier("student2") → output will be student 1
       ApplicationContext contextPRimaryQualifierContext =
               new AnnotationConfigApplicationContext(AppConfig.class);

       School school = contextPRimaryQualifierContext.getBean(School.class);
       school.printStudent();
    }
}
