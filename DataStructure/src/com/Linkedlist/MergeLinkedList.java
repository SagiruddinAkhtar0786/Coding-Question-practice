package com.Linkedlist;

class Node{
	int data;
	Node next;
	
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}
public class MergeLinkedList {
	
	public static Node mergeNode(Node l1, Node l2) {
		
		Node dummy = new Node(0);
		Node curr= dummy;
		
		
		while(l1 != null && l2 != null) {
			if(l1.data < l2.data) {
				curr.next = l1;
				l1= l1.next;
			}
			else {
				curr.next = l2;
				l2 = l2.next;
			}
			curr = curr.next;
		}
		
		return dummy.next;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node node1 = new Node(2);
		//node.next = new Node(3);
		Node node2 = new Node(2);
		//node.next = new Node(3);
		Node node =  mergeNode(node1, node2);
		printlist(node);

	}

	private static void printlist(Node node) {
		// TODO Auto-generated method stub
		Node head = node;
		while(head != null) {
			
			System.out.print(head.next+" -> ");
		}
		System.out.println("null");
	}

}
