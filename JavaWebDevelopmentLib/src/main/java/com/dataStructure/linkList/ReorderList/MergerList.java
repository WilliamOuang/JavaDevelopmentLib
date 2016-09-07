package com.dataStructure.linkList.ReorderList;

import javax.management.ListenerNotFoundException;

import org.eclipse.jdt.internal.compiler.lookup.ReductionResult;

import com.designPattern.staticProxy.StaticProxyTest;

public class MergerList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ListNode n1 = new ListNode(1);
//		ListNode n2 = new ListNode(2);
//		ListNode n3 = new ListNode(3);
//		ListNode n4 = new ListNode(4);
//		ListNode n5 = new ListNode(5);
		
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(8);
		ListNode n4 = new ListNode(9);
		ListNode n5 = new ListNode(16);

		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		
		
		ListNode l1 = new ListNode(4);
		ListNode l2 = new ListNode(6);
		ListNode l3 = new ListNode(13);
		ListNode l4 = new ListNode(14);
		ListNode l5 = new ListNode(15);
		ListNode l6 = new ListNode(17);

		l1.next=l2;
		l2.next=l3;
		l3.next=l4;
		l4.next=l5;
		l5.next=l6;
		
		
		printList(n1);
		System.out.println();
	//ListNode mListNode=	MergerListWilliam(n1,l1);
	ListNode mListNode=	megerSortList(n1,l1);

		printList(mListNode);
	}
	
	public static ListNode megerSortList(ListNode l1,ListNode l2){
		ListNode root=new ListNode(-1);
		ListNode copy=root;
		while(l1!=null&&l2!=null){
			if(l1.val<l2.val){
				root.next=l1;
				l1=l1.next;
			}else{
				root.next=l2;
				l2=l2.next;
			}
			root=root.next;
		}
		if(l1!=null){
			root.next=l1;
		}
		if(l2!=null){
			root.next=l2;
		}
		
		return copy.next;
	}
	
	public static ListNode MergerListWilliam(ListNode l1,ListNode l2){
		ListNode p1=l1;
		ListNode p2=l2;
		while(p1!=null&&p1.next!=null&& p2!=null){
			ListNode t1=p1.next;
			ListNode t2=p2.next;
			
			p1.next=p2;
			p2.next=t1;
			
			p1=t1;
			p2=t2;
		}
		if(p2!=null){
			p1.next=p2;
		}
		

		
		
		return l1;
		
	}
	
	

	public static ListNode mergeList(ListNode l1,ListNode l2){
		
		ListNode p1 = l1;
		ListNode p2 = l2;
		//merge two lists here
		while (p2 != null) {
			ListNode temp1 = p1.next;
			ListNode temp2 = p2.next;
			
			p1.next = p2;
			p2.next = temp1;		

			p1 = temp1;
			p2 = temp2;
		}
		return l1;
		
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
