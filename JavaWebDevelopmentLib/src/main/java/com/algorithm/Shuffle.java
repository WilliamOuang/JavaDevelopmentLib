package com.algorithm;

import java.util.Random;

public class Shuffle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]  = new int[]{1,2,3,4,5,6,7,8,9,10};
		for(int k:a){
			System.out.print(k+" ");
		}
		System.out.println();
		int b[]  = shuffleArray(a);
		for(int k:b){
			System.out.print(k+" ");
		}
		
		//Random rand =new Random();
		//System.out.println(rand.nextInt(2));
	}
	
	static	int[] shuffleArray(int a[]){
		Random rand =new Random();
		for(int i=0;i<a.length-1;i++){
		int temp=	i+rand.nextInt(a.length-i);
			int t=a[i];
			a[i]=a[temp];
			a[temp]=t;
		}
		return a;	
	}

}
