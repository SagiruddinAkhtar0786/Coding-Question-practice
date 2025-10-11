package com.SinglyLinkedlist;

class NodeCreate {
	int data;
	NodeCreate next;

	public NodeCreate(int data) {
		this.data= data;
		this.next = null;
	}
}

public class FindMiddleNodeByTortoiseAndHare {
	private static void printList(NodeCreate head) {
		// TODO Auto-generated method stub
		NodeCreate temp = head;
		
		while(temp !=null) {
			System.out.print(temp.data+"->");
			temp = temp.next;
		}
		
		System.out.println("null");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NodeCreate n1 = new NodeCreate(1);
		n1.next = new NodeCreate(2);
		n1.next.next = new NodeCreate(11);
		n1.next.next.next = new NodeCreate(14);
		n1.next.next.next.next = new NodeCreate(141);
		n1.next.next.next.next.next = new NodeCreate(111);
		printList(n1);
		
		NodeCreate mNode = middleNode(n1);
		if(mNode != null)
			System.out.println("Middle Node :: "+mNode.data);
		else
			System.out.println("List is empty");
	}

	//After two iterations, fast tries to access fast.next.next when fast.next is null, causing a NullPointerException.

//That’s why it returns null or crashes.
	private static NodeCreate middleNode(NodeCreate head) {
		// TODO Auto-generated method stub
		if(head ==null)
			return null;
		NodeCreate slow = head;
		NodeCreate fast = head;
		
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast =fast.next.next;
		}
		
		return slow;
	}

}
