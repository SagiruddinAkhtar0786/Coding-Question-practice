package com.practice.Demo.JPA;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;


@Data
@Component
//@ConfigurationProperties(prefix="app.application")
@ConfigurationProperties(prefix="app")

public class AppConfig {

	String name ;
	int port;
	String getProp;

}
