package com.SinglyLinkedlist;

class SortedList1{
	int data;
	SortedList1 next;
	
	public SortedList1(int data) {
		this.data = data;
		this.next = null;
	}
}

/*class SortedList2{
	int data;
	SortedList2 next;
	
	public SortedList2(int data) {
		this.data = data;
		this.next = null;
	}
}*/

public class MergeTwoList {

	
	// merge logic
	
	public static SortedList1  mergeSortedList(SortedList1 n1, SortedList1 n2) {
		SortedList1 dummy = new SortedList1(0);
		SortedList1 temp = dummy;
		
		while(n1 != null && n2 != null) {
			if(n1.data <= n2.data) {
				temp.next = n1;
				n1 = n1.next;
			}else {
				temp.next = n2;
				n2 = n2.next;
			}
			
			temp = temp.next;
		}
		
		if(n1 == null) {
			temp.next = n2;
		}else {
			temp.next = n1;
		}
		
		return dummy.next;
	}
	
	public static void printList(SortedList1 head) {
		SortedList1 temp = head;
		
		while(temp != null) {
			System.out.print(temp.data+"->");
			temp = temp.next;
		}
		System.out.println("null");

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SortedList1 sl1 = new SortedList1(1);
		sl1.next = new SortedList1(3);
		sl1.next.next = new SortedList1(5);
		
		SortedList1 sl2 = new SortedList1(4);
		sl2.next = new SortedList1(6);
		sl2.next.next = new SortedList1(10);
		
		SortedList1 mergeList =	mergeSortedList(sl1,sl2);
		System.out.println(" Mergerd List ");
		printList(mergeList);
	}

}
