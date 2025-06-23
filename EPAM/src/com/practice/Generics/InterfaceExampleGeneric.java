package com.practice.Generics;


interface Banking1<T> {
	

	
	void setName(T name);
	T getName();

}

class UnionBank1 implements Banking1<String>{

	private String name;
	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
		System.out.println("name :: "+name);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	
}
public class InterfaceExampleGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Banking1<String> ub = new UnionBank1();
		ub.setName("SBI");
		
		System.out.println("getname :: "+ub.getName());
	}

}
