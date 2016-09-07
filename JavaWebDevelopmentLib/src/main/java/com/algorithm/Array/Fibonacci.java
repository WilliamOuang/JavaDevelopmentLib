package com.algorithm.Array;

public class Fibonacci {
	public static void main(String[] args) {
		
		System.out.println(fibonacci(50));
		
	}
	 public static int fibonacci(int n) {
	        // write your code here
	       if(n <= 2) return n - 1;
	        int pre = 0, cur = 1;
	        for(int i = 3; i <= n; i++){
	            int temp = cur;
	            if(Integer.MAX_VALUE - pre < cur) return Integer.MAX_VALUE;
	            cur = pre +cur;
	            pre = temp;
	        }
	        return cur;
	    }
}
