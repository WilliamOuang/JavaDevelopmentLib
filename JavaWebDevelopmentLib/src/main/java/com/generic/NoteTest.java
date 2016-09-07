package com.generic;

import java.util.ArrayList;
import java.util.List;

import org.junit.validator.PublicClassValidator;

public class NoteTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Note<String> note= new Note<>();
		Note<Integer> note1= new Note<>();

		note.setV("ww");
		note1.setV(8);
		System.out.println(get(note));
		getData(note1);
		
		List<Object> objectList= new ArrayList<Object>();
		List<String> stringList = null;
		
		//	stringList=objectList;
		//	objectList=stringList;
		
		
	}
	public static <T> T get(Note<T> n){
		return n.getV();
	}
	public static void getData(Note<? extends Number> data) {
		        System.out.println("data :" + data.getV());
	}

}
