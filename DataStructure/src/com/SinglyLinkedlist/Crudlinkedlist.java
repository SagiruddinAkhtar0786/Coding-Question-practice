package com.SinglyLinkedlist;

//import com.Linkedlist.CreateSingleLinkedlist.ListNode;

public class Crudlinkedlist {

	private ListNode head = null;

	private static class ListNode {
		int data;
		ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}

	// print LinkedList

	public void printLinkedList() {
		ListNode curr = head;

		while (curr != null) {
			System.out.print(curr.data + "->");
			curr = curr.next;
		}
		System.out.println("null");
	}

	// insert At begining
	public void insertNodeAtBegining(int val) {
		ListNode l1 = new ListNode(val);
		l1.next = head;
		head = l1;
	}

	// insert node at Node
	public void insertNodeAtEnd(int val) {
		ListNode l1 = new ListNode(val);

		if (head == null) {
			head = l1;
			return;
		}

		ListNode curr = head;
		while (curr.next != null) {
			curr = curr.next;
		}

		curr.next = l1;

	}

	// insert Node at given index

	public void insertAtIndex(int val, int index) {
		ListNode newNode = new ListNode(val);
		if (index == 1) {
			newNode.next = head;
			head = newNode;
		} else {
			ListNode prev = head;
			int count = 1;
			while (count < index - 1) {
				prev = prev.next;
				count++;
			}
			ListNode curr = prev.next;
			newNode.next = curr;
			prev.next = newNode;

		}

	}

	// deleteFirstNode

	public ListNode deleteAtFirst() {

		if (head == null)
			return null;

		ListNode temp = head;
		head = head.next;
		temp.next = null;
		return temp;
	}

	// delete Node At last
	private ListNode deleteAtLast() {
		// TODO Auto-generated method stub
		if (head == null || head.next == null) {
			return head;
		}
		ListNode curr = head;
		ListNode prev = null;
		while (curr.next != null) {
			prev = curr;
			curr = curr.next;
		}
		prev.next = null;
		return curr;
	}

	// delete Node at given index
	private ListNode deleteAtGivenIndex(int index) {
		// TODO Auto-generated method stub
		ListNode curr;
		if(index == 1) { // Case 1: delete first node
			curr = head;
			head = head.next;
			return curr;// return deleted node
		}
		else {
			ListNode prevNode = head;
			int count = 1;
			while(count < index-1) {
				prevNode = prevNode.next;
				count++;
			}
			curr = prevNode.next;
			prevNode.next = curr.next;
		}
	
		
		return curr;
	}
// search an element in single Linked List
	
	public boolean SearchElement(int val) {
		ListNode curr = head;
		
		while(curr.next !=null) {
			
			if(curr.data == val)
				return true;
			
			curr = curr.next;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Crudlinkedlist CL = new Crudlinkedlist();
		CL.insertNodeAtBegining(5);
		CL.insertNodeAtBegining(9);
		CL.insertNodeAtBegining(4);
		CL.insertNodeAtBegining(7);

		System.out.println("Inserted at begining....");
		CL.printLinkedList();

		CL.insertNodeAtEnd(3);
		CL.insertNodeAtEnd(1);
		CL.insertNodeAtEnd(6);
		System.out.println("Inserted at Ending....");
		CL.printLinkedList();

		System.out.println("Inserted at given Index....");
		CL.insertAtIndex(10, 3);
		CL.insertAtIndex(100, 7);
		CL.printLinkedList();

		System.out.println("Delted Node at first....");

		ListNode node = CL.deleteAtFirst();
		System.out.println("deleted Node of First :: " + node.data);
		CL.printLinkedList();

		System.out.println("Delted Node at last....");

		ListNode DeleteNode = CL.deleteAtLast();
		System.out.println("deleted Node of Last :: " + DeleteNode.data);
		CL.printLinkedList();
		
		ListNode DeleteNodeIndex = CL.deleteAtGivenIndex(3);
		System.out.println("deleted Node of Last :: " + DeleteNodeIndex.data);
		CL.printLinkedList();
		
		boolean checkElement = CL.SearchElement(4);
		if(checkElement)
			System.out.println("element found ...");
		else
			System.out.println("element not found");

	}

	
}
