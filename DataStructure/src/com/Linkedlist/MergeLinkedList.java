package com.Linkedlist;

class NodeList{
	int data;
	NodeList next;
	
	public NodeList(int data) {
		this.data = data;
		this.next = null;
	}
}
public class MergeLinkedList {
	
	public static NodeList mergeNode(NodeList l1, NodeList l2) {
		
		NodeList dummy = new NodeList(0);
		NodeList curr= dummy;
		
		
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
		
		NodeList node1 = new NodeList(2);
		//node.next = new Node(3);
		NodeList node2 = new NodeList(2);
		//node.next = new Node(3);
		NodeList node =  mergeNode(node1, node2);
		printlist(node);

	}

	private static void printlist(NodeList node) {
		// TODO Auto-generated method stub
		NodeList head = node;
		while(head != null) {
			
			System.out.print(head.next+" -> ");
		}
		System.out.println("null");
	}

}
