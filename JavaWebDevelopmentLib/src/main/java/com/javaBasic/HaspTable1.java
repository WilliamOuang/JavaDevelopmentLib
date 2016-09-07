package com.javaBasic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HaspTable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1= new Student();
			s1.setId(1);
			s1.setName("William1");
		Student s2= new Student();
			s2.setId(2);
			s2.setName("William2");
		HaspTable1 aHaspTable1= new HaspTable1();
		
		HashMap aMap=	aHaspTable1.combin(new Student[]{s1,s2});
		
		Set set = aMap.entrySet();   
		aMap.keySet();
		
		
		Iterator aIterator=set.iterator();
		
		while(aIterator.hasNext()){      
		     Map.Entry<Integer, Student> entry1=(Map.Entry<Integer, Student>)aIterator.next();    
		     System.out.println(entry1.getKey()+"=="+entry1.getValue());    
		}  
		
	}
	
	public HashMap<Integer, Student> combin(Student[] s){
		HashMap<Integer, Student> hashMap=new HashMap<Integer, Student>();
		for(Student a:s){
			hashMap.put(a.getId(),a);
		}
		
		return hashMap;
	}
	public ArrayList conbinString(String[] a,String[] b){
		ArrayList list= new ArrayList();
		for(String c:a){
			list.add(c);
		}
		for(String d:b){
			list.add(d);
		}
		return list;
	}
	
}	
	
 class Student{
	 
	 public Student() {
		super();
	}
	private int id;
	 private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	 
 }


