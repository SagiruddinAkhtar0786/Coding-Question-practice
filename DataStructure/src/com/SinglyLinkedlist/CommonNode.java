package com.SinglyLinkedlist;

public class CommonNode {

	int data;
	CommonNode next;
	
	public CommonNode() {
		// TODO Auto-generated constructor stub
	}
	public CommonNode(int data) {
		this.data= data;
		this.next = null;
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
	
	// nth node from end of singly Linked List
	public CommonNode getNthNodeFromEnd(CommonNode head,int n) {
		//return CommonNode;
		if(head == null) {
			return null;
		}
		 if(n <= 0 ) {
			 throw new IllegalArgumentException("invalid value : n= "+n);
		 }
		 
		 CommonNode mainPtr = head;
		 CommonNode refPtr = head;
		 
		 int count = 0;
		 
		 while(count < n) {			 
			 if(refPtr == null) {
				 
				 throw new IllegalArgumentException(n+" is greater then the number of Node in List");
			 }
			 refPtr = refPtr.next;
			 count++;
		 }
		 
		 while(refPtr != null) {
			 refPtr = refPtr.next;
			 mainPtr = mainPtr.next;
		 }
		 
		 return mainPtr;
		 
	}
	// remove dublicate from sorted linked List
	
	public CommonNode removeDublictaeFromsortedLinkedList(CommonNode head) {
		CommonNode temp = head;
		System.out.println(temp.data);
		while(temp != null && temp.next != null) {
			if(temp.data == temp.next.data) {
				temp.next = temp.next.next;
			}
			else {
				temp = temp.next;
			}
		}
		return temp;
	}
	// insert new node in sorted List
	public CommonNode inserNewNodeInsortedLinkedList(CommonNode head ,CommonNode newNode) {
		// TODO Auto-generated method stub
		
		CommonNode current = head;
		CommonNode temp = null;
		
		while(current != null &&  current.data < newNode.data ) {
			temp = current;
			current = current.next;
		}
		
		newNode.next= current;
		temp.next = newNode;
		
		
		return head;
	}

	
	// remove key from the list
	
	public CommonNode removeKeyFromSortedLinkedList(CommonNode head, int key) {
		 CommonNode curr = head;
		 CommonNode temp = null;
		 
		 if(head == null) {
				return null;
			}
		 
		 while(curr != null && curr.data != key) {
			 temp = curr;
			 curr = curr.next;
		 }
		 if(curr == null) {
			//System.out.println("did not found the key");
			return null;
		 }
		 temp.next= curr.next;
		
		return head;
	}
	
	
	// crete a linked List ahving Loop
	
	public CommonNode createListOfLoop() {
		CommonNode n1 = new CommonNode(1);	
		CommonNode n2 = new CommonNode(2);	
		CommonNode n3 = new CommonNode(3);	
		CommonNode n4 = new CommonNode(4);	
		CommonNode n5 = new CommonNode(5);	
		CommonNode n6 = new CommonNode(6);	
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n3; // creates loop
		
		return n1;
	}
		
	
	// DetectLoopInLinkedList
	
	public boolean DetectLoopInLinkedList(CommonNode head) {
		
		CommonNode fastPtr = head;
		CommonNode slowPtr = head;
		
		while(fastPtr != null &&  fastPtr.next != null) {
			fastPtr = fastPtr.next.next;
			slowPtr = slowPtr.next;
			
			if(fastPtr == slowPtr)
				return true;
		}
		return false;
	}
	public CommonNode findStartingNodeOfLoop(CommonNode head) {
		// TODO Auto-generated method stub
		
		CommonNode  fastPtr = head;
		CommonNode  slowPtr = head;
		
		while(fastPtr != null &&  fastPtr.next != null) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
			
			if(fastPtr ==slowPtr) {
				return getStarttingNode(head,slowPtr);
			}
		}
		
		return null;
	}
	
	// find starting Node
	private CommonNode getStarttingNode(CommonNode head, CommonNode slowPtr) {
		// TODO Auto-generated method stub
		CommonNode temp = head;
		
		while(slowPtr != temp) {
			temp = temp.next;
			slowPtr = slowPtr.next;
			
		}
		return temp;
	}
	public CommonNode breakloopOfList(CommonNode head) {
		// TODO Auto-generated method stub
		CommonNode  fastPtr = head;
		CommonNode  slowPtr = head;
		
		while(fastPtr != null &&  fastPtr.next != null) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
			
			if(fastPtr ==slowPtr) {
				return removeLoop(head,slowPtr);
			}
		}
		return null;
	}
	public CommonNode removeLoop(CommonNode head, CommonNode slowPtr) {
		 CommonNode temp= head;
		  while(temp.next != slowPtr.next) {
			  temp = temp.next;
			  slowPtr = slowPtr.next;
		  }
		  slowPtr.next = null;;
		return head;
	}
}
