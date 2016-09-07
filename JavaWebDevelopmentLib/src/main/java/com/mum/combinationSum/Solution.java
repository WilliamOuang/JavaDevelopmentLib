package com.mum.combinationSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	
	public static void main(String[] args) {
		combinationSum(new int []{2,3,6,7}, 5);
	}
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        int m = candidates.length;
        if(m == 0) return  res;
        Arrays.sort(candidates);
        List<Integer> item = new ArrayList<Integer>();
        dfs(candidates, target, 0, item, res);
        return res;
    }
    
    public static void dfs(int[] candidates, int target, int start, List<Integer> item, List<List<Integer>> res){
        if(target == 0){
            res.add(new ArrayList<Integer>(item));
            return;
        }
        if(target < 0) return;
        for(int i = start; i < candidates.length; i++){
            if(i > start && candidates[i] == candidates[i-1]) continue;// avoid duplicate solutions
            //System.out.println(candidates[i]);
            item.add(candidates[i]);
            
            dfs(candidates, target - candidates[i], i, item, res);
            item.remove(item.size() - 1);
        }
    }
}