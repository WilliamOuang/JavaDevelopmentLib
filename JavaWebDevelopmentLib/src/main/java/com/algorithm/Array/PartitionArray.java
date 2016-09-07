package com.algorithm.Array;

public class PartitionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int test[]={9,9,9,8,9,8,7,9,8,8,8,9,8,9,8,8,6,9};
		int test1[]={6,2,2,1};

		
		
		//System.out.println(partitionArray(test,10));
		System.out.println(partitionArray(test1,2));
			
	}
	public static int partitionArray(int[] nums, int k) {
	    //write your code here
//	    int copy[] = new int[nums.length];
//	    int left=0;
//	    int right=nums.length-1;
//         for(int i = 0; i<nums.length;i++ ){
//             if(nums[i]<k){
//                 copy[left++]=nums[i];
//             }else{
//                 copy[right--]=nums[i];
//             }
//         }	    
//	    return left;
		
		
		
	    
	     int less = 0, great = nums.length-1;
	     while(less < great){
	          while(less <= great && nums[less] < k){
	              less++;
	          }   
	          while(great >= less && nums[great] >= k){
	              great--;
	          } 
	          if(less <= great){
	              int temp = nums[less];
	              nums[less] = nums[great];
	              nums[great] = temp;
	              less++;
	              great--;
	          }
	      }
	      return less;
	    
	    
	    
	    
	    
	    
	    
	    
	    
		}
}
