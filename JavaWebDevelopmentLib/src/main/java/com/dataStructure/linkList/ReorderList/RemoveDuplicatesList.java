package com.dataStructure.linkList.ReorderList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RemoveDuplicatesList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(5);

		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next=n3;
		//printList(n1);

		//ListNode mListNode =deleteDuplicates(n1);
	//	printList(mListNode);
	boolean b=	hasCycle(n1);
	System.out.println(b);
	//printList(n1);
//	ListNode r=removeCycle(n1);
//printList(n1);
//	boolean c=	hasCycle(r);
//	System.out.println(c);
	}
	
	public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) 
           return false;
       ListNode copy=head;    
       ListNode slow = head;
       ListNode fast = head;
       int count=0;
       while(fast != null && fast.next != null) {
           slow = slow.next;
           fast = fast.next.next;
           count++;
           if(slow == fast){
        	   System.out.println("Count="+count);
        	   System.out.println("slow:"+slow.val);
        	   System.out.println("fast:"+fast.val);

        	  //slow.next=null;
        	  // fast.next=null;
        	   return true;
           }
       }
       return false;
       }
	
	public static ListNode removeCycle(ListNode head) {
        if (head == null || head.next == null) 
           return head;
       ListNode copy=head;    
       ListNode slow = head;
       ListNode fast = head;
       int count=0;
       while(fast != null && fast.next != null) {
           slow = slow.next;
           fast = fast.next.next;
           count++;
           if(slow == fast){
        	   System.out.println("Count 6="+count);
        	   slow.next=null;
        	 return head;
           }
       }
       return head;
       }
	
	
	 public static ListNode deleteDuplicates(ListNode head) {
		 if(head==null||head.next==null){
			 return head;
		 }
		 Map<Integer,Integer> map= new HashMap<>();
		 ListNode copy=head;
		 ListNode root= new ListNode(-1);
		 ListNode copyroot=root;
		 while(copy!=null){
			 if(map.get(copy.val)!=null){
				 map.put(copy.val, map.get(copy.val)+1);
			 }else{
				 map.put(copy.val, 1);
			 }
			 copy=copy.next;
		 }
		 copy=head;
		 int count=0;
		 while(copy!=null){
			 if(map.get(copy.val)==1){
				 root.next=copy;
				 root=root.next;
				 count++;
			 }
			 copy=copy.next;
		 }		 
		// if(count==1){
			 root.next=null;
		// }
		 return copyroot.next;
		 
		 
//		 ListNode p, dummy = new ListNode(0);
//		    p = dummy;
//		    dummy.next = head;
//		    while (head != null && head.next != null) {
//		        if (head.val == head.next.val) {
//		            while (head.next != null && head.val == head.next.val) {
//		                head = head.next;
//		            }
//		            head = head.next;
//		            p.next = head;
//		        } else {
//		            head = head.next;
//		            p = p.next;
//		        }
//		    }
//		    return dummy.next;
		 
		 
		 
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
