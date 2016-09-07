package com.dataStructure.linkList.ReorderList;

public class RemoveNthFromEnd {
	public static void main(String[] args) {
		
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(5);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		printList(n1);
		
		removeNthFromEnd(n1,2);
		
	}

	public static ListNode removeNthFromEnd(ListNode head, int n){
		ListNode copy=head;
		ListNode newhead=null;
		while(copy!=null){
			ListNode cur=copy;
			copy=copy.next;
			cur.next=newhead;
			newhead=cur;
		}
		//printList(newhead);
		ListNode re=newhead;
		int count=1;
		while(newhead!=null&&newhead.next!=null){
			count++;
			if(count==n){
				newhead.next=newhead.next.next;
				//break;
			}else{
				newhead=newhead.next;
			}
			
		}
		
		ListNode copy1=re;
		ListNode newhead1=null;
		while(copy1!=null){
			ListNode cur=copy1;
			copy1=copy1.next;
			cur.next=newhead1;
			newhead1=cur;
		}
		printList(newhead1);

		return newhead1;
	}
	public static void printList(ListNode n) {
		System.out.println("------");
		while (n != null) {
			System.out.print(" "+n.val);
			n = n.next;
		}
		System.out.println();
	}
}
