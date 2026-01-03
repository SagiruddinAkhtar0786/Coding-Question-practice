package com.practice.sExceptionHandler.Entity;

import java.time.LocalDateTime;

public class Employee {
	int id;
	String name;
	String city;
	String State;
	LocalDateTime date;
	
	
	
	
	
	public Employee(int id, String name, String city, String state, LocalDateTime date) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		State = state;
		this.date = date;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public LocalDateTime getDate() {
		return date;
	}
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	
	
	
	
}
