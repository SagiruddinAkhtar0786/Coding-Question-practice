package com.DoublyLinkedlist;

public class DoublyLinkedlistImplementation {

	private ListNode head;
	private ListNode tail;
	private int length;
	
	private class ListNode{
		int data ;
		ListNode previous;
		ListNode next;
		
		public ListNode(int data){
			this.data =data;
			this.previous = null;
			this.next = null;
		}
	}
	
	public DoublyLinkedlistImplementation() {
		this.head = null;
		this.tail = null;
		this.length = 0;
	}
	public boolean isEmpty() {
		return length == 0;
	}
	public int length() {
		return length;
	}
	
	// isnert at last
	
	public void insertAtLast(int val) {
		ListNode newNode = new ListNode(val);
		
		if(isEmpty()) {
			head = newNode;
		}else {
			tail.next = newNode;
			
		}
		
		newNode.previous = tail;
		tail = newNode;
		length++;
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		DoublyLinkedlistImplementation dll = new DoublyLinkedlistImplementation();
		

	}

}
