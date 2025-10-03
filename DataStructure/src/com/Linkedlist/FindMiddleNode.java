package com.Linkedlist;

class List_Node1{
	int data;
	List_Node1 next;
	
	public List_Node1(int data) {
		this.data =data;
		this.next = null;
	}
}

public class FindMiddleNode {
	
	private static void printreverseList(List_Node1 revList) {
		// TODO Auto-generated method stub
		List_Node1 temp = revList;
		
		while(temp !=null) {
			System.out.print(temp.data+"->");
			temp = temp.next;
		}
		
		System.out.println("null");
	}

	

	private static List_Node1  findMiddleNodeOfList(List_Node1 node) {
		// TODO Auto-generated method stub
		if(node == null) {
			return null;
		}
		int count = findLenghtOfListNode(node);
		System.out.println(count);
		
		List_Node1 temp = node;
		for(int i = 0 ; i < count/2 ; i++) {
			temp = temp.next;
		}
		return temp;
	}

	private static int findLenghtOfListNode(List_Node1 node) {
		
		
		List_Node1 temp = node;
		int count=0;
		while(temp != null) {
			count++;
			temp = temp.next;
		}
		
		return count;
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List_Node1 node = new List_Node1(1);
		node.next = new List_Node1(2);
		node.next.next = new List_Node1(3);
		node.next.next.next = new List_Node1(4);
	
		
			
		printreverseList(node);
		
		List_Node1 middleNode = findMiddleNodeOfList(node);
		
		System.out.println("Middle data :: "+middleNode.data);

	}

}
