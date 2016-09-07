package com.dataStructure.linkList;

public class Note1<T> {
	T nodeValue;
	Note1<T> next;
	public Note1(T nodeValue, Note1<T> next) {
		
		this.nodeValue = nodeValue;
		this.next = next;
	}
	
	public Note1(T nodeValue1){
		this.nodeValue=nodeValue1;
		this.next=null;
	}
}
