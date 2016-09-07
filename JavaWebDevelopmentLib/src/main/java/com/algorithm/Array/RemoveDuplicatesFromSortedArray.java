package com.algorithm.Array;

import java.util.Arrays;


public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		int a[]={1,1,2,3,3};
		int b[]={3,2,2,3};

		//removeDuplicate(a);
		removeElement(b,3);
	}
	
	 public static int removeElement(int[] nums, int val) {
	        int k=0;
	        for(int i=0;i<nums.length;i++){
	            if(nums[i]!=val){
	                nums[k++]=nums[i];
	            }
	        }
			System.out.println(Arrays.toString(nums));
	        System.out.println(k);
	        return k;
	}
	public static int[] removeDuplicate(int[]arr){
		if(arr==null|| arr.length<=1){
			return arr;
		}
		int k=0;
		for(int i=1;i<arr.length;i++){
			if(arr[k]!=arr[i]){
				k++;
				arr[k]=arr[i];
			}
		}
		System.out.println("k==="+k);

		System.out.println(Arrays.toString(arr));
		int  rearr[]= new int[k+1];
		for(int j=0;j<=k;j++){
			rearr[j]=arr[j];
		}
		System.out.println(Arrays.toString(rearr));


		return rearr;
		
	}
	
}
