package com.SinglyLinkedlist;

public class CreateSingleLinkedlist {
	
	ListNode head =null;
	
	private static class ListNode{
		int data;
		ListNode next;
		
		
		public ListNode(int data) {
			this.data= data;
			this.next = null;
		}
	
	}
	
	// print LinkedList
	
	
	public void printLinkedList() {
		ListNode curr = head;
		
		while(curr != null) {
			System.out.print(curr.data+"->");
			curr = curr.next;
		}
		System.out.println("null");
	}
// find length
	int count = 0;
	public void LinkedListLength() {
		ListNode curr = head;
		if(head == null) {
			System.out.println("length of Linked List :: "+0);
			return;
		}
		
		while(curr != null) {
			count++;
			curr = curr.next;
		}
		
		System.out.println("count :: "+count);

	}
	
	// insert Node at First
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateSingleLinkedlist ll = new CreateSingleLinkedlist();
		ll.head = new ListNode(3);
		
		ListNode l2 = new ListNode(10);
		ListNode l3 = new ListNode(40);
		ListNode l4 = new ListNode(60);
		ll.head.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = null;
		
		ll.printLinkedList();
		ll.LinkedListLength();
	}

}
