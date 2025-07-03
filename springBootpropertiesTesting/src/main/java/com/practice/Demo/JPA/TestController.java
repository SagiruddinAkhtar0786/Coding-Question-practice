package com.practice.Demo.JPA;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/users")
public class TestController {
	
	private AppConfig appconfig;
	
	public TestController (AppConfig appconfig) {
		this.appconfig = appconfig;
	}
	
	@GetMapping()
	@ResponseBody
	public String getProperteis() {
		System.out.println("app name :: "+appconfig.getName() +" , app port :: "+appconfig.getPort());
		System.out.println("get properties :: "+appconfig.getProp);
		return "app name :: "+appconfig.getName() +" , app port :: "+appconfig.getPort();
		
	}
	
	

}
