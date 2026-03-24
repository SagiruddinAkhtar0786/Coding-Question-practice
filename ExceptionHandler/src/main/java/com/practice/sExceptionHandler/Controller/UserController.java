package com.practice.sExceptionHandler.Controller;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.practice.sExceptionHandler.Entity.Employee;
import com.practice.sExceptionHandler.exception.ExceptionHnadler;
import com.practice.sExceptionHandler.exception.ResourceNotFoundEception;

@RestController
public class UserController {

    @GetMapping("/getUserName")
    public String getName() {
        return "may nam is Sagiruddin";
    }

    @GetMapping("/testGlobalException/{id}")
    public ResponseEntity<String> getException(@PathVariable("id") int empid) {
        if (empid == 0) {
            throw new ExceptionHnadler("given Id not Found  : " + empid);
        }

        return new ResponseEntity<>("given id is correct and found in database", HttpStatus.FOUND);
    }

    @GetMapping("/BugExceptionTest/{id}")
    public ResponseEntity<String> bugExceptionTest(@PathVariable("id") int empid) {
        if (empid == 0) {
            throw new ExceptionHnadler("BugException given Id not Found  : " + empid);
        }

        return new ResponseEntity<>("given id is correct and found in database", HttpStatus.FOUND);
    }

    @GetMapping("/TestJsonData")
    public ResponseEntity<Employee> testJsonData() {
        Employee employeeResponse = new Employee(1, "sagiruddin", "Hyderabad", "Telangana", LocalDateTime.now());
        return new ResponseEntity<>(employeeResponse, HttpStatus.OK);
    }

    // globally handling exception using @ControllerAdvice and @ExceptionHandler
    @GetMapping("/user")
    public String getUser() {
        boolean userExists = false;
        if (!userExists) {
            throw new ResourceNotFoundEception("User not found in database");
        }
        return "User found";
    }
}
