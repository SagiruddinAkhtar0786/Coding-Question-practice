package com.practice.sExceptionHandler.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.practice.sExceptionHandler.exception.BugException;
import com.practice.sExceptionHandler.exception.ExceptionHnadler;

@Controller
public class UserController {
	
	@GetMapping("/getUserName")
	@ResponseBody
	public String GetName() {
		return "may nam is Sagiruddin ";
	}
	
	
	@GetMapping("testGlobalException/{id}")
	public ResponseEntity<String> getException(@PathVariable("id") int empid){
		if(empid == 0) {
			throw new ExceptionHnadler("given Id not Found  : "+empid);
		}
		
		return new ResponseEntity<>("given id is crrect and found in database",HttpStatus.FOUND);
	}
	
	
	@GetMapping("BugExceptionTest/{id}")
	public ResponseEntity<String> BugExceptionTest(@PathVariable("id") int empid){
		if(empid == 0) {
			throw new ExceptionHnadler(" BugException given Id not Found  : "+empid);
		}
		
		return new ResponseEntity<>("given id is crrect and found in database",HttpStatus.FOUND);
	}

}
