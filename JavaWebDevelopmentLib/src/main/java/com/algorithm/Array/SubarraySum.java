package com.algorithm.Array;

import java.util.ArrayList;
import java.util.HashMap;

public class SubarraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums=null;
		System.out.println(subarraySum(new int[]{1,-3, 1, 2, -3, 4}).toString());
	}
	
	   public static  ArrayList<Integer> subarraySum(int[] nums) {
	        // write your code here
	        
	        
	     ArrayList<Integer> res = new ArrayList<Integer>();
	        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	        map.put(0, -1);
	        int sum = 0;
	        for(int i = 0; i < nums.length; i++){
	            sum += nums[i];
	            if(map.containsKey(sum)){
	                res.add(map.get(sum)+1);
	                res.add(i);
	                return res;
	            }
	            map.put(sum, i);
	        }
	        return res;
	    }

}
