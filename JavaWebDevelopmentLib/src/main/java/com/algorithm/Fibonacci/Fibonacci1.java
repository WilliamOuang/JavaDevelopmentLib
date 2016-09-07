package com.algorithm.Fibonacci;

public class Fibonacci1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long m = fib(40);
		long m1 = fib1(40);

		System.out.println("Fibonacci(40) is " + m);
		System.out.println("Fibonacci(40) is " + m1);
		System.out.println("Fibonacci(40) is " + fibwilliam(40));


	}
	
	public static int fibwilliam(int n){
		if(n==1|| n==2){
			return 1;
		}else{
			int a=1;
			int b=1;
			int i=3;
			int sum=0;
			while(i<=n){
				sum=a+b;
				b=a;
				a=sum;
				i++;
			}
			
			return sum;  
	
		}
				
		
	}
	
	
	
	
	
	
	
	
	
	
	public static long fib1(int n) {
		if(n <= 1) {
		                    return n;
		          } else {
		                    return fib(n-1) + fib(n-2);
		          }
		}
	
	public static long fib(int n) {
		long f1 = 1, f2 = 1;
		long m = 0;
		if (n <= 2) {
			return 1;
		} else {
			for (int i = 3; i <= n; i++) {
				m = f1 + f2;
				f2 = f1;
				f1 = m;
			}
			return m;
		}
	}
}
