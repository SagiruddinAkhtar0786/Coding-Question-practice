package com.SinglyLinkedlist;

class ListNode{
	int data ;
	ListNode next;
	ListNode(int data){
		this.data = data;
		this.next = null;
	}
	
}

public class ReverselinkedList {
	
	public static ListNode reverse(ListNode l1) {
		ListNode prev = null;
		ListNode curr = l1;
		ListNode next = null;
		
		while(curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr  = next;
			
			
		}
		return prev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListNode node = new ListNode(1);
		node.next = new ListNode(2);
		node.next.next = new ListNode(3);
		node.next.next.next = new ListNode(4);
		System.out.println(" Original List : "+node);
		
		printList(node);
		node  = reverse(node);
		
		System.out.println("reverse node :: ");
		printList(node);


	}

	private static void printList(ListNode head) {
		// TODO Auto-generated method stub
		ListNode temp = head;
		
		while(temp != null) {
			System.out.print(temp.data+" -> ");
			temp = temp.next;
		}
		System.out.println("null");
		
		
	}

}
