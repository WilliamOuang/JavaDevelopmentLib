package com.algorithm;

import java.util.Arrays;


public class Person {

	int age;
		
	public Person(int age) {
		super();
		this.age = age;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1= new Person(14);
		Person p2= new Person(12);
		Person p3= new Person(15);
		Person[] pArray = {p1, p2, p3};  
		printDogs(pArray);
		Arrays.sort(pArray,new PersonCompartor());
		printDogs(pArray);

	}
	 public static void printDogs(Person[] dogs){  
	        for(Person d: dogs)  
	            System.out.print(d.age + " " );  
	   
	        System.out.println();  
	    } 
}




