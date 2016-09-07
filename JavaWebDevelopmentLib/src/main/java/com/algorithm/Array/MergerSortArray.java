package com.algorithm.Array;

public class MergerSortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mergeSortedArray(new int[]{1,2,3},3,new int[]{4,5},2);
	}
	 public static void mergeSortedArray(int[] A, int m, int[] B, int n) {
	        //write your code here
	        int total=m+n;
	        int g=m-1;
	        int k=n-1;
	        for( int i=total-1;i>0;i--){
	            if(A[g] >= B[k]){
	                A[i] = A[g];
	                g--;
	            }else{
	                A[i] = B[k];
	                k--;
	            }
	        }
	        
	        
//	           int i = m - 1, j = n - 1;
//	         while(i >= 0 && j >= 0){
//	             if(A[i] >= B[j]){
//	                 A[i+j+1] = A[i];
//	                 i--;
//	             } else {
//	                  A[i+j+1] = B[j];
//	                  j--;
//	             }
//	         }
//	         while(j >= 0){
//	             A[j] = B[j];
//	             j--;
//	         }
	        
	    }
}
