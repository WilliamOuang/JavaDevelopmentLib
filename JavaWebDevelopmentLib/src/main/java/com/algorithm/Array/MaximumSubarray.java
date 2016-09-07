package com.algorithm.Array;

public class MaximumSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,-1,1};
		System.out.println(maxSubArray(arr));
	}

	
	 public static int maxSubArray(int[] nums) {
	        if(nums.length==1){
	            return nums[0];
	        }
	        
	        int max=nums[0];
	        int temp=nums[0];
	        System.out.println( max);
	        for(int i=1;i<nums.length;i++){
		       temp=Math.max(nums[i],nums[i]+temp);
		       max=Math.max(max,temp);
		    }
	        return max;
	        
	        
	    }
	
	
}
