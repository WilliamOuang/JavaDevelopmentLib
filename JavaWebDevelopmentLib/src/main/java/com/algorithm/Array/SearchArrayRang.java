package com.algorithm.Array;

import java.util.Arrays;

public class SearchArrayRang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] in=new int[]{5, 7, 7, 8, 8, 10};
		int[] re=	searchRange(in,8);
//		int[] in=new int[]{1,3};
//		int[] re=	searchRange(in,1);
		System.out.println(Arrays.toString(re));
	}

	 public static int[] searchRange(int[] nums, int target) {
		 
		 int len = nums.length;

		    // Search for start index
		    int beginIndex = -1;
		    int start = 0;
		    int end = len - 1;

		    while (start < end) {
		        int mid = start + (end - start) / 2;
		        if (nums[mid] >= target) { // When nums[mid] == target, search towards the left
		            end = mid;
		        } else {
		            start = mid + 1;
		        }
		    }
		    System.out.println("start:"+start);
		    System.out.println("end:"+end);

		    // Take care the single item case, making the search for end easier
		    if (len == 1) {
		        return nums[0] == target? new int[] {0, 0} : new int[] {-1, -1};
		    }

		    // If target exist, start will be the starting point
		    if (nums[start] == target) {
		        beginIndex = start;
		    } else {
		        return new int[] {-1, -1};
		    }

		    // Search for end index
		    int endIndex = -1;
		    start = 0;
		    end = len - 1;

		    while (start < end) {
		        int mid = start + (end - start) / 2;
		        if (nums[mid] > target) { // When nums[mid] == target, search towards the right
		            end = mid;
		        } else {
		            start = mid + 1;
		        }
		    }
		    System.out.println("start:"+start);
		    System.out.println("end:"+end);
		    // If the target is all the way to the end of nums[], then the start/end should be pointing to the end of nums[], thus start/end/len - 1 should be the end index;
		    // otherwise, nums[start] should be the first value that's larger than target, therefore (start - 1) should be the end index of target.
		    endIndex = nums[start] == target? start : start - 1;
		    return new int[] {beginIndex, endIndex};
		 
		 
		 
		 
		 
		 
//	        int[] re=new int[2];
//	            re[0]=-1;
//	            re[1]=-1;
//	        int begin=0;
//	        int end=nums.length;
//	        int mid=(begin+end)/2;
//	        if(nums.length==1&&nums[0]==target){
//	        	 re[0]=0;
//		         re[1]=0;
//		         return re;
//	        }
//	        if(nums.length==2&&nums[0]==target&&nums[1]==target){
//	        	 re[0]=0;
//		         re[1]=1;
//		         return re;
//	        }
//	        
//	        
//	        while(begin<end){
//	            if(nums[mid]<target){
//	                begin=mid+1;
//	            }else if(nums[mid]>target){
//	                end=mid-1;
//	            }else if(nums[mid]==target&&nums[mid+1]==target){
//	                re[0]=mid;
//	                re[1]=mid+1;
//	                break;
//	            }
//	            
//	        }
//	        return re;
	    }
}
