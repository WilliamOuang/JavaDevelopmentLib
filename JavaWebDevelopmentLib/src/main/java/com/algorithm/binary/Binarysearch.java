package com.algorithm.binary;

import javax.xml.stream.events.StartDocument;

public class Binarysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Binary search is a famous question in algorithm.
		//For a given sorted array (ascending order) and a target number, find the first index of this number in O(log n) time complexity. If the target number does not exist in the array, return -1. 
//		Example If the array is [1, 2, 3, 3, 4, 5, 10], for given target 3, return 2.
		
		
		
		
		System.out.println(binarySearch(new int[]{1, 2, 3, 3, 4, 5, 10},3));
		
				
	}
	
	public static int binarySearch(int nums[], int target){
		
//		 	int lo = 0;
//	        int hi = nums.length - 1;
//	        while (lo <= hi) {
//	            // Key is in a[lo..hi] or not present.
//	            int mid = lo + (hi - lo) / 2;
//	            if      (target < nums[mid]) hi = mid - 1;
//	            else if (target > nums[mid]) lo = mid + 1;
//	            else return mid;
//	        }
//	        return -1;
	        
		if (nums == null || nums.length == 0) {
            return -1;
        }
		int ret=-1;
		int begin=0;
		int end=nums.length-1;
		int mid;
		while(begin<=end){
			mid= begin + (end-begin)/2;
			if(nums[mid] == target){
				ret= mid;
				return ret;
			}else if( nums[mid] > target ){
				begin = mid + 1;
			}else if( nums[mid] < target ){
				end = mid-1;
			}
			
		}
		
		System.out.println("End:"+end);
		return ret;
		
		
		
//		 if (nums == null || nums.length == 0) {
//	            return -1;
//	        }
//	        
//	        int start = 0, end = nums.length - 1;
//	        while (start + 1 < end) {
//	            int mid = start + (end - start) / 2;
//	            if (nums[mid] == target) {
//	                return mid;
//	            } else if (nums[mid] < target) {
//	                start = mid;
//	            } else {
//	                end = mid;
//	            }
//	        }
//
//	        if (nums[start] == target) {
//	            return start;
//	        }
//	        if (nums[end] == target) {
//	            return end;
//	        }
//	        return -1;
		
		
	
		
		
		
		
		
	}

	

}
