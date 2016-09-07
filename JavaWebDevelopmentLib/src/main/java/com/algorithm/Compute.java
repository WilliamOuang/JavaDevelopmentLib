package com.algorithm;

import java.lang.management.ManagementPermission;
import java.math.BigInteger;

public class Compute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int one=0;
		int two=1;
		int three=5;
		//System.out.println(getNumber(one,two,8));
		//System.out.println(Math.pow(6, 2));
		
		
		
		BigInteger a = BigInteger.valueOf(0);
		BigInteger b = BigInteger.valueOf(1);
		int n=10;
		for(int i=2;i<n;i++){
			BigInteger temp=b;
			b=b.multiply(b).add(a);
			a=temp;
		}

System.out.println(b);
			
	}
	
	public static long getNumber(long one,long two, long n){
		if(n==1){ 
			return one;
		}else if(n==2) {
			return two;
		}else{
			return (long)Math.pow(getNumber(one,two,  n-1), 2)+getNumber(one,two,n-2);
		}
		
		
	}

}
