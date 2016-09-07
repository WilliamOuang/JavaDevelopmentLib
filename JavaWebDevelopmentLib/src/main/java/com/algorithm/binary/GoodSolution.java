package com.algorithm.binary;

import com.sun.xml.internal.messaging.saaj.packaging.mime.util.QDecoderStream;

public class GoodSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(binarySearch(new int[]{1, 2, 3, 3, 4, 5, 10},3));

	}
	public static int binarySearch(int nums[], int target){
	
		if(	nums ==	null || nums.length == 0 ){
			return -1;
		}
		
		int start=0;
		int end=nums.length - 1;
		int mid;
		while(start + 1 < end){
			mid = start + (end-start) / 2;
			if(nums[mid] == target){
				//end=mid;
				 start = mid;
			} else if (nums[mid] < target) { 
				start = mid;
			} else if( nums[mid] > target){
				end = mid;
			}
		}
		
	
		if(nums[start] == target){
			return start;
		}
		if(nums[end] == target){
			return end;
		}
		
		return -1;
		
	}

}
