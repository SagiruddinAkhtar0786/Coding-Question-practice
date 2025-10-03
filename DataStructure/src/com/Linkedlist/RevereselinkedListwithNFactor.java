package com.Linkedlist;


class List_Node{
	int data;
	List_Node next;
	
	public List_Node(int data) {
		this.data =data;
		this.next = null;
	}
}

public class RevereselinkedListwithNFactor {
	
	
	public static List_Node reverseListWithK(List_Node head ,int k) {
		
		if(head == null  || k <= 1) return head;
		
		int count = 0;
		List_Node temp = head;
		// first condition to check count = k if atleast 2 node to reverse
		while(temp != null && count  < k) {
			temp = temp.next;
			count++;
		}
		// second condition to check if count < k return head; do not reverse
		
		if(count < k) return head;
		
		// if count == k then reverse
		
		List_Node curr = head;
		List_Node next = null;
		List_Node prev = null;
		int cnt = 0;
		
		while(curr != null && cnt < k) {
			next = curr.next;
			curr.next= prev;
			prev = curr;
			curr = next;
			cnt++;
		}
		
		if(next != null) {
			head.next = reverseListWithK(next,k);
		}
		
		return prev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List_Node node = new List_Node(1);
		node.next = new List_Node(2);
		node.next.next = new List_Node(3);
		node.next.next.next = new List_Node(4);
		node.next.next.next.next= new List_Node(5);
		
		int k = 2;
		List_Node revlist = reverseListWithK(node,k);
		
		printreverseList(revlist);

	}

	private static void printreverseList(List_Node revList) {
		// TODO Auto-generated method stub
		List_Node temp = revList;
		
		while(temp !=null) {
			System.out.print(temp.data+"->");
			temp = temp.next;
		}
		
		System.out.println("null");
	}

}
