package com.practice.Demo.JPA;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;


@Data
@Component
//@ConfigurationProperties(prefix="app.application")
@ConfigurationProperties(prefix="app")

public class AppConfig {

	//String name ;
	//int port;
	String getProp;
	
//	@Value("${values.valueProp}")
	String TestignValue;
	
	private Application  applcation = new Application();
	
	public static class Application{
		String name ;
		int port;
	//	private Application applcation;
		
		
		// getters and setters
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getPort() {
            return port;
        }
        public void setPort(int port) {
            this.port = port;
        }
        
        
      
	}

	public Application getApplcation() {
		// TODO Auto-generated method stub
		return applcation;
	}
	 public void setApplication(Application applcation) {
	        this.applcation = applcation;
	    }

}
