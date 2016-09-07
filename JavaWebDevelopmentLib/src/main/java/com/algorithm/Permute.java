package com.algorithm;

import java.util.ArrayList;
import java.util.List;

public class Permute {

	public static void main(String[] args) {

		
		permute(new int[]{1,2,3});
		
	}
	public static List<List<Integer>> permute(int[] nums) {
	        List<List<Integer>> res= new ArrayList<>();
	        if(nums == null || nums.length<=0){
	            return res;
	        }
	        
	        List<Integer> list = new ArrayList<>();
	       helper(nums,list,res);
	        
	        return res;
	    }
	    private static void helper(int nums[],List<Integer> list,List<List<Integer>> res){
	        
	        if(list.size()==nums.length){
	            res.add(new ArrayList<Integer>(list));
	            return;
	        }
	        for(int i=0;i<nums.length;i++){
	            if(list.contains(nums[i])){
	                continue;
	            }
	            list.add(nums[i]);
	            helper(nums,list,res);
	            list.remove(list.size()-1);
	        }
	        
	    } 
}
