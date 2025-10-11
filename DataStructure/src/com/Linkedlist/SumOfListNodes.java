package com.Linkedlist;

class ListNode1{
	int data;
	ListNode1 next;
	
	public ListNode1(int data) {
		this.data = data;
		this.next = null;
	}
}

public class SumOfListNodes {

	//print
	public static void printList(ListNode1 head) {
		ListNode1 temp = head;
		
		while(temp != null) {
			System.out.print(temp.data+"->");
			temp = temp.next;
		}
		System.out.println("null");

	}
	
	//
	
	public static ListNode1 sumListNode(ListNode1 n1, ListNode1 n2) {
		ListNode1 dummy = new ListNode1(0);
		ListNode1 temp = dummy;
		int carry = 0;
		while(n1 != null || n2 != null) {
			int data1 = (n1 != null) ? n1.data : 0;
			int data2 = (n2 != null) ? n2.data : 0;
			
			int sum = carry + data1 + data2;
			carry = sum / 10;
			
			temp.next = new ListNode1(sum % 10);
			temp = temp.next;
			
			if(n1 != null) n1 = n1.next;
			if(n2 != null) n2 = n2.next;
		}
		
		if(carry > 0)
			temp.next = new ListNode1(carry);
		
		return dummy.next;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListNode1 sl1 = new ListNode1(7);
		sl1.next = new ListNode1(4);
		sl1.next.next = new ListNode1(9);
		
		ListNode1 sl2 = new ListNode1(5);
		sl2.next = new ListNode1(6);
	//	sl2.next.next = new ListNode1(6);
		
		ListNode1 sumList =	sumListNode(sl1,sl2);
		System.out.println(" sumList ********** ");
		printList(sumList);
		
	}

}
