package com.dataStructure.linkList;

public class TestLinkList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleLinkedList<String> linkedList= new SingleLinkedList();
			linkedList.addToTail("1");
			linkedList.addToTail("2");
			linkedList.addToTail("3");
			linkedList.addToHead("5");
			//linkedList.removeFirst();
			//linkedList.removeLast();
			
			linkedList.addNote("2", "8");
		    linkedList.printList();
	
	}

}
