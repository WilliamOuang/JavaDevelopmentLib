package com.algorithm.DP;

public class Fib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	long l[] = new long[20];
	l[0]=0;
	l[1]=1;
	l[2]=1;
	for(int i=3;i<l.length;i++){
		l[i]=l[i-1]+l[i-2];
	}
	for(long ll:l){
		System.out.println(ll);
	}
	}

}
