package com.oo;

public class TestPolymorphic {
	 public static void main(String args[]){
		    
	        Animal animal = new Animal("animal");
	        Cat cat = new Cat("cat","blue");
	        Dog dog = new Dog("dog","black");
	        
	        Lily l1 = new Lily("l1",cat);
	        Lily l2 = new Lily("l1",dog);
	        
	        l1.myAnimalEnjoy();
	        l2.myAnimalEnjoy();
	    }
}
