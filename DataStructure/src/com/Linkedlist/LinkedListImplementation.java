package com.Linkedlist;

class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data = data;
		this.next = null;
	}
	
}

class LinkedListImpl{
	Node head;
	
	// insert at the begining
	 public void insertAtBegining(int data) {
		 Node newNode = new Node(data);
		 newNode.next = head;
		 head = newNode;
	 }
	 
	 public void insertAtEnd(int data) {
		 Node newNode = new Node(data);
		 if(head == null) {
			 head = newNode;
			 return;
		 }
		 
		 Node current = head;
		 while(current.next != null) {
			 current = current.next;
		 }
		 current.next = newNode;
		 
	 }
	 
	 public void deleteNode(int key) {
		 
		 Node temp = head,prev = null;
		 if(temp != null && temp.data == key) {
			 head = temp.next;
			 return;
		 }
	 }
	// public 
	 
	 
}




public class LinkedListImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
