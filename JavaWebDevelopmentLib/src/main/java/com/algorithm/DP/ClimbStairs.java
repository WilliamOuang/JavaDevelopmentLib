package com.algorithm.DP;

import java.math.BigInteger;

public class ClimbStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(climbStairs(4));
		
		System.out.println(climbStairs100(30));

	}
	public static int climbStairs(int n) {
		if(n == 1)
		return 1;
		if(n == 2)
		return 2;

		return climbStairs(n - 1) + climbStairs(n - 2);
	}
	
	public static int climbStairs100(int n) {
		
		int a = 0;
	    int b = 1;
	    int sum = 0;

	    for(int i = 1; i <= n; i++){
	        sum = a + b;
	        a = b;
	        b = sum;
	    }
	    
	    return sum;
	}
	
}
