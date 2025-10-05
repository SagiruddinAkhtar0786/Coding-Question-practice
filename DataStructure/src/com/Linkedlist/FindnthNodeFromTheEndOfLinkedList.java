package com.Linkedlist;

public class FindnthNodeFromTheEndOfLinkedList {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CommonNode cn = new CommonNode();
		CommonNode  node = new CommonNode(2);
		node.next = new CommonNode(3);
		node.next.next = new CommonNode(5);
		node.next.next.next = new CommonNode(24);
		node.next.next.next.next = new CommonNode(23);
		node.next.next.next.next.next = new CommonNode(29);
		
		cn.printList(node);
		CommonNode nthNode = cn.getNthNodeFromEnd(node, 4);
		System.out.println("nthNode :: "+nthNode.data);
		cn.printList(node);
	}
	
}
