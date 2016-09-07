package com.javaBasic.InnerClass;

public class TestAnonymounsInner {

	public void displayMessage(Message m){
	      System.out.println(m.greet() +", This is an example of anonymous inner calss as an argument");	   
	   }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnonymousInner inner = new AnonymousInner(){
	         public void mymethod(){
	            System.out.println("This is an example of anonymous inner class");    	  
	         }	    
	      };
	      inner.mymethod();	

	      
	      TestAnonymounsInner obj = new TestAnonymounsInner();
			
	      //Passing an anonymous inner class as an argument
	      obj.displayMessage(new Message(){
	         public String greet(){
	            return "Hello";  		   
	         }
	      });
		
	}

}
