package com.dataStructure.linkList;

class Note<T> {
	T nodeValue;
	Note<T> next;
	public Note(T nodeValue, Note<T> next) {
		
		this.nodeValue = nodeValue;
		this.next = next;
	}
	
	public Note(T nodeValue1){
		this.nodeValue=nodeValue1;
		this.next=null;
	}
}


public class SingleLinkedList<T> {
	private Note<T> head,tail;

	public SingleLinkedList() {
		
		this.head = null;
		this.tail = null;
	}
	public boolean isEmpty(){
		return head== null;
	}
	
	public void addToHead(T item){
	Note note=	new Note(item);
		note.next=head;
		head=note;
	}
	
	public void addToTail(T item){
		if(!isEmpty()){
			tail.next=new Note(item);
			tail =tail.next;
		}else{
			head=tail=new Note(item);
		}
	}
	
	public void addNote(T node,String item){
		Note<T> curr=head;
		while(curr.next!=null){
			if(curr.nodeValue.equals(node)){
				Note<T> addNote= new Note(item);
				addNote.next=curr.next;
				curr.next=addNote;
				return;
			}
			curr=curr.next;
			
		}
		
	}
	
	public void removeFirst(){
		if(!isEmpty()){
			head=head.next;
		}
	}
	
	public void removeLast(){
		Note<T> pre=null;
		Note<T> curr=head;
		while(curr.next!=null){
			pre=curr;
			curr=curr.next;
			
		}
		if(curr.next==null){pre.next=null; }
	}
	
	
	public void printList(){
		if(isEmpty()){
			
		}else{
			for(Note<T> p=head;p!=null;p=p.next){
				System.out.println(p.nodeValue);
			}
		}
	}
	
	public static void main(String[] args) {
		Integer.parseInt("");
		// TODO Auto-generated method stub
		SingleLinkedList<String> linkedList= new SingleLinkedList();
			linkedList.addToTail("1");
			linkedList.addToTail("2");
			linkedList.addToTail("3");
			linkedList.addToTail("4");
			linkedList.addToTail("5");

			
			
			//linkedList.addToHead("5");
			//linkedList.removeFirst();
			//linkedList.removeLast();
			
			//linkedList.addNote("2", "8");
		    linkedList.printList();
	
		    
		    solution(linkedList.head, 2);
		    linkedList.printList();
	}
	
	
	
    // S = AB S' =ATBT
    public static Note solution(Note phead, int k){
    	Note p = phead;
        int i = 1; // A 部分反转次数
        int j = 1; // B部分反转次数
        if(p!=null){
            // A 部分反转
        	Note q = p.next;
            p.next = null;
            while(q != null && i< k ){              
            	Note r = q.next;
                q.next = p;
                p = q;
                q = r;
                i++;
            } // A部分反转结束，p指向结果的头指针，q指向B部分的第一个元素

            // B 部分反转
            Note qnext = q.next;
            q.next = null;
            while(qnext != null && j< 6-k){             
            	Note r = qnext.next;
                qnext.next = q;
                q = qnext;
                qnext = r;
                j++;
            }// B部分反转结束，q指向结果的头指针
            //连接AB两部分
            phead.next = q;
        }

        return p;
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
