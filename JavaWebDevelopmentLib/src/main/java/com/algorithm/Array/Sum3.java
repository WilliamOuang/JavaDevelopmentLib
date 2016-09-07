package com.algorithm.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum3 {

	public static void main(String[] args) {

		
		int[] arr= {-1, 0, 1, 2, -1, -4};
		
		//System.out.println(Arrays.toString(threeSum(arr).toArray()));
		System.out.println(Arrays.toString(threeSumVersion(arr).toArray()));

		print(new int[]{1},0);
	}

	public  static void print(int[]arr,int target){
		
	} 
	
	
	public static List<List<Integer>> threeSumVersion(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums.length < 3) return result;
        Arrays.sort(nums);
        int i = 0;
        while(i < nums.length - 2) {
            if(nums[i] > 0) break;
            int j = i + 1;
            int k = nums.length - 1;
            while(j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0) result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                if(sum <= 0) while(nums[j] == nums[++j] && j < k);
                if(sum >= 0) while(nums[k--] == nums[k] && j < k);
            }
            while(nums[i] == nums[++i] && i < nums.length - 2);
        }
        return result;
    }
	
	static List<List<Integer>>  threeSum(int[] nums) {
        
    List<List<Integer>> result = new ArrayList<>();
    int n = nums.length;
    if(n < 3) return result;

    Arrays.sort(nums);

    int i = 0;

    while(i < n - 2)
    {
        int start = i + 1, end = n - 1;
        while(start < end)
        {
            int sum = nums[i] + nums[start] + nums[end];
            if(sum == 0)
            {
                result.add(Arrays.asList(nums[i], nums[start], nums[end]));
                do
                {
                    end--;
                }while(end > start && nums[end] == nums[end + 1]);
                do
                {
                    start++;
                }while(start < end && nums[start] == nums[start - 1]);
            }
            else if(sum > 0)
            {
                do
                {
                    end--;
                }while(end > start && nums[end] == nums[end + 1]);
            }
            else
            {
                do
                {
                    start++;
                }while(start < end && nums[start] == nums[start - 1]);
            }
        }
        do
        {
            i++;
        }while(i < n - 2 && nums[i] == nums[i - 1]);
    }

    return result;
        
    }
}
