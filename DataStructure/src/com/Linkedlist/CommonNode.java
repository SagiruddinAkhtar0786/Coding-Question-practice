package com.Linkedlist;

public class CommonNode {

	int data;
	CommonNode next;

	public CommonNode(int data) {
		this.data= data;
		this.next = null;
	}
	
	public CommonNode() {
		// TODO Auto-generated constructor stub
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

}
