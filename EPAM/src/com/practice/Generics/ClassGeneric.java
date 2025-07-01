package com.practice.Generics;

class Bank<T,K>{
	private T name;
	
	public void set(T name) {
		this.name= name;
	}
	public T getName() {
		return name;
	}
	
	public void withdraw(K money) {
		System.out.println("widraw money :: "+money);
	}
	
}


public class ClassGeneric {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Bank<String,Integer> bankName = new Bank();
		bankName.set("union bank");
		
		System.out.println("bank name :: "+bankName.getName());
		
		bankName.withdraw(2000);;
		
		
	}

}
