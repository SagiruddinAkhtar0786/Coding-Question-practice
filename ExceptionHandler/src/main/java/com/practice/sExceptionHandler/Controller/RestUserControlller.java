package com.practice.sExceptionHandler.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.practice.sExceptionHandler.exception.CustomExceptionHandle;
import com.practice.sExceptionHandler.exception.ResourceNotFoundEception;

@RestController
public class RestUserControlller {
	
	
	
	@GetMapping("getDataByIdwithoutResponseEntity/{id}")
	public String getDataByIdwithoutResponseEntity(@PathVariable("id") int empId){
		
		if(empId == 0 )
			return "id not Found getDataByIdwithoutResponseEntity" ;
		
		
		return "His id is ";
		
	}
	
	@GetMapping("users/{id}")
	public ResponseEntity<String> getDataById(@PathVariable("id") int empId){
		
		if(empId == 0 )
			return new ResponseEntity<>("id not Fount" ,HttpStatus.NOT_FOUND);
		
		
		return new ResponseEntity<>("His id is "+empId,HttpStatus.OK);
		
	}
	
	
	
	
	
	@GetMapping("ResponseStatus/{id}")
	public ResponseEntity<String> getDataByIdWithResponseStatus(@PathVariable("id") int empId){
		
		if(empId == 0) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND,"not Found!!!!"); // message dont come if we use predefined methods ResponseStatusException
		}
		
	
		return new ResponseEntity<>("His id is with ResponseStatus "+empId,HttpStatus.OK);
		
	}
	
	// create Custom Methods
	
	@GetMapping("customeExceptionCall/{id}")
	public ResponseEntity<String> customeExceptionCall(@PathVariable("id") int id){
		if(id == 0) {
			throw new CustomExceptionHandle(id+" : id Not Found");
		}
		
		return new ResponseEntity<>("id Found withh customeException "+id,HttpStatus.OK);
	}
	
	
	@GetMapping("handleExceptionUsingGlobally/{id}")
	public ResponseEntity<String> getException(@PathVariable("id") int empId){
		if(empId== 0) {
			throw new ResourceNotFoundEception("id not found for : "+empId );
		}
		
		return new ResponseEntity<>(empId+" : id found",HttpStatus.OK);
	}
	
	
	

}
