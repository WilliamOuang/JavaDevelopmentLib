package com.javaBasic;

public class Bit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 8;
		System.out.println(i>>1);
		System.out.println(i<<1);
		
		
		
//		& is bitwise. && is logical.
//
//		& evaluates both sides of the operation.
//		&& evaluates the left side of the operation, if it's true, it continues and evaluates the right side.


		
		
		
		  int x = 25;
	        if(x < 50 && x > 0) {
	            System.out.println("OK");
	        }

	        if(x < 50 & x > 0) {
	            System.out.println("Yup");
	        }

//down vote
//&& is a logical operator
//
//& is a bit operator
//
//Apparently if you do a bit comparison of true to true, the answer is true, and if you do a bit comparison of true and false, the answer is false!

        
	        
	        int a = 4;
	        int b = 7;
	        System.out.println(a & b); // prints 4
	        //meaning in an 32 bit system
	        // 00000000 00000000 00000000 00000100
	        // 00000000 00000000 00000000 00000111
	        // ===================================
	        // 00000000 00000000 00000000 00000100
	        
	        System.out.println("============"); 
	        System.out.println("============"+(6>>1)); 

	        
	        int n=4;
	        int count=0;
		      while(n>0)
		      {   
		        	count+=(n&1);
		        	System.out.println(n);
		        	n=n>>1;
		      }
	        
		  System.out.println("============"+count); 

	}

}
