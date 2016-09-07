package com.javaBasic;

public class CreateLinkList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Note{
	int data;
	Note next;
	
	public void putNote(Note note){
		
	}
	public void putValue(int note){
		Note aNote= new Note();
			aNote.data=note;
		Note note2=this;	
		while(note2.next!=null){
			note2=note2.next;
		}
		note2.next=aNote;
	}
	
	
	
}