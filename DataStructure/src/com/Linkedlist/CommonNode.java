package com.Linkedlist;

public class CommonNode {

	int data;
	CommonNode next;
	
	public CommonNode() {
		// TODO Auto-generated constructor stub
	}
	public CommonNode(int data) {
		this.data= data;
		this.next = null;
	}
	
	

	public void printList(CommonNode head) {
		// TODO Auto-generated method stub
		CommonNode temp = head;
		
		while(temp !=null) {
			System.out.print(temp.data+"->");
			temp = temp.next;
		}
		
		System.out.println("null");
	}
	
	public CommonNode getNthNodeFromEnd(CommonNode head,int n) {
		//return CommonNode;
		if(head == null) {
			return null;
		}
		 if(n <= 0 ) {
			 throw new IllegalArgumentException("invalid value : n= "+n);
		 }
		 
		 CommonNode mainPtr = head;
		 CommonNode refPtr = head;
		 
		 int count = 0;
		 
		 while(count < n) {			 
			 if(refPtr == null) {
				 
				 throw new IllegalArgumentException(n+" is greater then the number of Node in List");
			 }
			 refPtr = refPtr.next;
			 count++;
		 }
		 
		 while(refPtr != null) {
			 refPtr = refPtr.next;
			 mainPtr = mainPtr.next;
		 }
		 
		 return mainPtr;
		 
	}

}
