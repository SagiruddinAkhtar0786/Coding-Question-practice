package com.Datastructure;

import java.util.Stack;

public class Balancedbrackets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="({[]})";
		
		boolean check = bracketBalanced(str);
		
		System.out.println("check balanced brackets >>> "+check);
	}
	
	public static boolean bracketBalanced(String str) {
		
		Stack<Character> stack = new Stack<>();
		
		for(int i=0; i<str.length(); i++) {
			char currenBraces = str.charAt(i);
			if(currenBraces == '(' || currenBraces == '[' || currenBraces == '{')
				stack.push(currenBraces);			
			else if(currenBraces == '}' || currenBraces == ')' || currenBraces == ']') {
				if(stack.isEmpty())
					return false;
				char stackPop = stack.pop();
				System.out.println("stackPop >> "+stackPop);
				if(!testBraces(currenBraces,stackPop)) {
					return false;
				}
			}
		}
		
		return stack.isEmpty();
	}

	private static boolean testBraces(char currenBraces, char stackPop) {
		// TODO Auto-generated method stub
		
	//	boolean test= false;
		if(currenBraces == ')' && stackPop=='('  || currenBraces == '}' && stackPop=='{'|| currenBraces == ']' && stackPop=='[' ) 
			return true;
		
		return false;
	}

}
