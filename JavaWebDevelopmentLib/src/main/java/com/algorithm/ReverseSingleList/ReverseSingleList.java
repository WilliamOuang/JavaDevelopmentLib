package com.algorithm.ReverseSingleList;



/** 
 * @author luochengcheng 
 *  两种方式实现单链表的反转(递归、普通) 
 *  新手强烈建议旁边拿着纸和笔跟着代码画图(便于理解) 
 */  
public class ReverseSingleList {  
	
	
	public static Node reverseListWilliam(Node head){
		return null;
	}
	
	public static Node reverseList(Node head) {
	    if (head == null || head.nextNode == null)
	        return head;
	    Node newHead = reverseList(head.nextNode);
	    head.nextNode.nextNode = head;
	    head.nextNode = null;
	    return newHead;
	}
    /**  
     * 递归，在反转当前节点之前先反转后续节点  
     */  
    public static Node reverse(Node head) {  
        if (null == head || null == head.getNextNode()) {  
            return head;  
        }  
        Node reversedHead = reverse(head.getNextNode());  
        head.getNextNode().setNextNode(head);  
        head.setNextNode(null);  
        return reversedHead;  
    }  
    
    
    
  
    /**  
     * 遍历，将当前节点的下一个节点缓存后更改当前节点指针  
     *   
     */  
    public static Node reverse2(Node head) {  
        if (null == head) {  
            return head;  
        }  
        Node pre = head;  
        Node cur = head.getNextNode();  
        Node next;  
        while (null != cur) {  
            next = cur.getNextNode();  
            cur.setNextNode(pre);  
            pre = cur;  
            cur = next;  
        }  
        //将原链表的头节点的下一个节点置为null，再将反转后的头节点赋给head     
        head.setNextNode(null);  
        head = pre;  
          
        return head;  
    }  
    
    // By william 
    public static Node reverseWilliam(Node head) { 
    	if(head==null || head.nextNode==null){
    		return head;
    	}
    	Node reHead=null;
    	Node cur=head;
    	while(cur!=null){
    		Node preCur=cur;
    		cur= cur.nextNode;
    		preCur.nextNode=reHead;
    		reHead=preCur;
    	}
    	
    	return reHead;
    } 

  
    public static void main(String[] args) {  
        Node head = new Node(0);  
        Node tmp = null;  
        Node cur = null;  
        // 构造一个长度为10的链表，保存头节点对象head     
        for (int i = 1; i < 10; i++) {  
            tmp = new Node(i);  
            if (1 == i) {  
                head.setNextNode(tmp);  
            } else {  
                cur.setNextNode(tmp);  
            }  
            cur = tmp;  
        }  
        //打印反转前的链表  
        Node h = head;  
        while (null != h) {  
            System.out.print(h.getRecord() + " ");  
            h = h.getNextNode();  
        }  
        //调用反转方法  
      //  head = reverse2(head);  
      //    head = reverse(head);
      //    head = reverseList(head);
        head=  reverseWilliam(head);
        System.out.println("\n**************************");  
        //打印反转后的结果  
        while (null != head) {  
            System.out.print(head.getRecord() + " ");  
            head = head.getNextNode();  
        }  
    }  
}  
