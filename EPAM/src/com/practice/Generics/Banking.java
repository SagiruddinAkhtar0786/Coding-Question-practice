package com.practice.Generics;

interface Banking<T> {
	

	
	void setName(T name);
	T getName();
}

class UnionBank implements Banking<String>{

	private String name;
	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
		System.out.println("name :: ");
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	
	
	
}

class BankGenericInterface{
	public static void main(String[] args) {
		Banking<String> ub = new UnionBank();
		ub.setName("SBI");
		
		System.out.println("getname :: "+ub.getName());
	}
}
