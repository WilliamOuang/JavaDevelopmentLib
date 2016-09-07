package com.algorithm;

import java.util.Arrays;

public class MoveZeroes {

	public static void main(String[] args) {

		
		int arr[]={1,0,3,0,4,5,0,12};
		//moveZeroes(arr);
		moveZ(arr);
	}
	
	
	
	public static void moveZ(int[] arr){
		int count=0;
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]==0){
				count++;
			}
			if(arr[i]!=0&&count>1){
				arr[i-count]=arr[i];
				arr[i]=0;
			}
            System.out.println(Arrays.toString(arr));

		}
		
	}
	
	
	 public static void moveZeroes(int[] nums) {
	        
	        int count=0;
	        for (int i = 0; i < nums.length; i++) {
	            if(nums[i]==0)
	            count++;
	            if(count!=0&&nums[i]!=0){
	                nums[i-count]=nums[i];
	                nums[i]=0;
	            }
	            System.out.println(Arrays.toString(nums));
	        }
	  }

}
