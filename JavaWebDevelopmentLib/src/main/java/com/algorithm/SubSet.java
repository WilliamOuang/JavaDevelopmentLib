package com.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SubSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	    List<String> result = new LinkedList<String>();
//	    
//	    result.add("qqq");
//	    result.add("1111");
//	    System.out.println(result.toString());
		"ss".toCharArray();
		"s".length();
		
		int[] arr={8,1,2,3,4};
		List<List<Integer>> list=subset(arr);
		System.out.println(list.toString());
	}
	public static List<List<Integer>> subset(int[] array){
		Arrays.sort(array);
		List<Integer> nums= new ArrayList<>();
		List<List<Integer>> res= new ArrayList<>();
		res.add(new ArrayList<>());
		for(int i=0;i<array.length;i++){
			nums.add(array[i]);
		}
	
		for(int k=1;k<=array.length;k++){
			dfs1(nums,k,0,new ArrayList<>(),res );
		}
		
		return res;
		
	}
	private static void dfs1(List<Integer> nums, int k, int i, List<Integer> p2, List<List<Integer>> res) {
		if(k==0){
			res.add(p2);
			return;
		}
		 for (int j = i; j < nums.size(); j++) {
	 	        List<Integer> p = new ArrayList<>(p2);
		        p.add(nums.get(j));
		        dfs1(nums, k-1, j+1, p, res);
		    }
	}

}
