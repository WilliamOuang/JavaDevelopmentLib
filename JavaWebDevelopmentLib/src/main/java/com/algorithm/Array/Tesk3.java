package com.algorithm.Array;

import java.util.Arrays;

public class Tesk3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(s(new int[]{1,1,2,3},new int[]{4,5}));
		System.out.println(s(new int[]{1,2,3,1},new int[]{4,2,5,3,2}));
		//System.out.println(s(new int[]{},new int[]{}));

		System.out.println(s(new int[]{2,1},new int[]{3,3}));

	}

	static int  s(int[] A,int[] B){
		int n=A.length;
		int m=B.length;
		Arrays.sort(A);
		Arrays.sort(B);

		int i=0;
		for(int k=0;k<n;k++){
			if(i<m-1 && B[i]<A[k]){
				i+=1;
			}
			if(A[k]==B[i])
				return A[k];
		}
		
		return -1;
		
	}

}
