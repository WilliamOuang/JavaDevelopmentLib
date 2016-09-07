package com.algorithm.Array;

public class Equilibriumindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int A[]=new int[8];
		 		  A[0] = -1;
				  A[1] =  3;
				  A[2] = -4;
				  A[3] =  5;
				  A[4] =  1;
				  A[5] = -6;
				  A[6] =  2;
				  A[7] =  1;
				  
				  System.out.println(solution(A));
				  
	}
	int equi(int arr[], int n) {
	    if (n==0) return -1; 
	     long sum = 0;
	    int i; 
	    for(i=0;i<n;i++) sum+=(long ) arr[i]; 

	     long sum_left = 0;    
	    for(i=0;i<n;i++) {
	         long sum_right = sum - sum_left - (long ) arr[i];
	        if (sum_left == sum_right) return i;
	        sum_left += (long ) arr[i];
	    } 
	    return -1; 
	} 
	public static int solution(int[] A) {
		int ret=-1;
		for(int i=1;i<A.length-1;i++){
			int sump=Integer.MIN_VALUE;
			int suml=Integer.MIN_VALUE;;
			for(int j=0;j<i;j++){
				sump+=A[j];
			}
			for(int k=i+1;k<A.length;k++){
				suml+=A[k];
			}
			if(sump==suml){
				return i;
			}
			
			
		}
		return -ret;
        // write your code in Java SE 8
    }
}
