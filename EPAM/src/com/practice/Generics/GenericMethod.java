package com.practice.Generics;


class testingMEthod{
	//private T name;
	public <T> void namePrint(T name) {
		//this.name = name;
		System.out.println("name : "+name);
	}
}
public class GenericMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testingMEthod tM = new testingMEthod();
		tM.namePrint("sagiruddin");
	}

}
