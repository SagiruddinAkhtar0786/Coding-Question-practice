package com.Linkedlist;

public class FindnthNodeFromTheEndOfLinkedList {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CommonNode cn = new CommonNode();
		CommonNode  node = new CommonNode(2);
		node.next = new CommonNode(3);
		node.next.next = new CommonNode(3);
		node.next.next.next = new CommonNode(4);
		node.next.next.next.next = new CommonNode(6);
		node.next.next.next.next.next = new CommonNode(9);
		
		cn.printList(node);
		CommonNode nthNode = cn.getNthNodeFromEnd(node, 4);
		System.out.println("nthNode :: "+nthNode.data);
		cn.printList(node);
		CommonNode dublicateNode=cn.removeDublictaeFromsortedLinkedList(node);
		System.out.println("removed Dublicated Node :: "+dublicateNode.data);
		cn.printList(node);
		// insert new node in sorted List
		CommonNode  newNode = new CommonNode(5);
		CommonNode insertNewNode=cn.inserNewNodeInsortedLinkedList(node,newNode);
		System.out.println("inserted New Node :: "+insertNewNode.data);
	
		cn.printList(node);
		// remove key from teh list
		System.out.println("Removed Node :: ");

		CommonNode removeKey=cn.removeKeyFromSortedLinkedList(node,5);
		if(removeKey !=null) {
			cn.printList(node);
		}else {
			
			System.out.println("Key not found to remove ");
		}
		
		//create a list with Loop
		CommonNode loopNode = cn.createListOfLoop();
		
		System.out.println("Loop Node List");
		//cn.printList(loopNode); // infinite loop
		
		//detect Loop in linkedList
		boolean detectLoop = cn.DetectLoopInLinkedList(loopNode);
		
		if(detectLoop)
			System.out.println("true..");
		else
			System.out.println("not a loop");

		// find start Node of Loop
		
		CommonNode sNode = cn.findStartingNodeOfLoop(loopNode);
		System.out.println(" start Node of Loop :: "+sNode.data);
		
		// remove Loop from singly Linked List
		CommonNode rNode = cn.breakloopOfList(loopNode);
		System.out.println(" start Node of Loop :: "+sNode.data);
	}

	
	
}
