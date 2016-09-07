package com.designPattern.Singleton;

public class Person {
	private static Person p;
	
	private Person(){
		p=new Person();
		
	}
	public static Person getPersonInstance(){
		if(p==null){
			p=new Person();
			return p;
		}else{
			return p;
		}
		
	}
	

}
