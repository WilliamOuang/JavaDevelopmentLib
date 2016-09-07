package com.algorithm;

import java.util.ArrayList;
import java.util.List;

public class Combinations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> result=combine2(4,2);
		System.err.println(result.toString());
		
		
	List<Integer> list=	new ArrayList<>();
	List<Integer> list1=	new ArrayList<Integer>();
	new ArrayList<Integer>();

	}

	public static List<List<Integer>> combine2(int n, int k) {
		List<Integer> nums= new ArrayList<>();
		List<List<Integer>> res= new ArrayList<>();

		for(int i=1;i<=n;i++){
			nums.add(i);
		}
		dfs1(nums,k,0,new ArrayList<>(),res );
		
		return res;
	}
	private static void dfs1(List<Integer> nums, int k, int i, List<Integer> p2, List<List<Integer>> res) {
		if(k==0){
			res.add(new ArrayList<>(p2));
			return;
		}
		
		 for (int j = i; j < nums.size(); j++) {
	 	        List<Integer> p = new ArrayList<>(p2);
		        p.add(nums.get(j));
		        dfs1(nums, k-1, j+1, p, res);
		        p.remove(p.size()-1);
		    }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


	public static List<List<Integer>> combine(int n, int k) {
	    List<Integer> nums = new ArrayList<>();
	    for (int i = 1; i <= n; i++) {
	        nums.add(i);
	    }
	    List<List<Integer>> ret = new ArrayList<>();
	    dfs(nums, k, 0, new ArrayList<>(), ret);
	    return ret;
	}

	private static void dfs(List<Integer> nums, int k, int idx, List<Integer> path, List<List<Integer>> ret) {
	    if (k == 0) {
	        ret.add(path);
	        return; // backtracking
	    }
	    for (int i = idx; i < nums.size(); i++) {
 	        List<Integer> p = new ArrayList<>(path);
	        p.add(nums.get(i));
	        dfs(nums, k-1, i+1, p, ret);
	    }
	}

}
