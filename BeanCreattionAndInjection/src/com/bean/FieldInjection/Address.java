package com.bean.FieldInjection;

//Dependent Bean
public class Address {
 private String city;
 private String state;

 // Constructor
 public Address(String city, String state) {
     this.city = city;
     this.state = state;
 }

 @Override
 public String toString() {
     return "Address: " + city + ", " + state;
 }
}
