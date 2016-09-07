package com.javaBasic.InnerClass;

class Outer_Demo{
	   int num;
	   //inner class
	   private class Inner_Demo{
	      public void print(){	   
	         System.out.println("This is an inner class");
	      }
	   }
	   //Accessing he inner class from the method within
	   void display_Inner(){
	      Inner_Demo inner = new Inner_Demo();
	      inner.print();
	   }
	 //private variable of the outer class
	   private int num1= 175;  
	   //inner class   
	   public class Inner_Demo1{
	      public int getNum(){
	         System.out.println("This is the getnum method of the inner class");
	         return num1;
	      }
	   }
	}