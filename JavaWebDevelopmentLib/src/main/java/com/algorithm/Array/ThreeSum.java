package com.algorithm.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class ThreeSum {

	public static void main(String[] args) {
		
		int i=15;
		
		 if (i % 15 == 0) {
			 System.out.println("1"); 
         } else if (i % 5 == 0) {
        	 System.out.println("2"); 
         } else if (i % 3 == 0) {
        	 System.out.println("3"); 
         } else {
        	 System.out.println("4"); 
         }

		int arr[]={-1,0,1,2,-1,-4};
		threeSum(arr);
			
	}
    static ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
    
    public static ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        if (num == null || num.length < 3) return ret;
        
        Arrays.sort(num);
        
        int len = num.length;
        for (int i = 0; i < len-2; i++) {
            if (i > 0 && num[i] == num[i-1]) continue;
            find(num, i+1, len-1, num[i]); //寻找两个数与num[i]的和为0
        }
        
        return ret;
    }
    
    public static void find(int[] num, int begin, int end, int target) {
        int l = begin, r = end;
        while (l < r) {
            if (num[l] + num[r] + target == 0) {
                ArrayList<Integer> ans = new ArrayList<Integer>();
                ans.add(target);
                ans.add(num[l]);
                ans.add(num[r]);
                ret.add(ans); //放入结果集中
                while (l < r && num[l] == num[l+1]) l++;
                while (l < r && num[r] == num[r-1]) r--;
                l++;
                r--;
            } else if (num[l] + num[r] + target < 0) {
                l++;
            } else {
                r--;
            }
        }
    }
}
