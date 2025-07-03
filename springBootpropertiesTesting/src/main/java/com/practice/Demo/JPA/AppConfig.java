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
	
	Applcation applcation = new Applcation();
	
	public static class Applcation{
		String name ;
		int port;
		
		
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

}
