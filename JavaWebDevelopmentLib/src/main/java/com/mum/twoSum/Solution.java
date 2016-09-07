package com.mum.twoSum;

import java.util.Arrays;

public class Solution {
    /**
     * @param nums: an array of integer
     * @param target: an integer
     * @return: an integer
     */
	
//	这道题非常类似two sum ,。我们可以用类似于两个指针的方式， 来做这道题目。
//
//	先把数组排序了后， 然后两个指针一个指向头head，一个指向尾巴tail，然后判定a。如果A[head]+A[tail]> target 那么所有head右边的元素和tail 的组合的和都是大于target的,所以我们更新答案，tail减一继续扫b。如果A[head]+A[tail]<=target,那么tail左边的所有的元素和head的组合的和都是小于等于target的，所以我们不用考虑了， head加一继续扫描。这样到最后，head和tail相遇，停止整个扫描就阔以得到答案。
//    
//	http://www.jiuzhang.com/solutions/two-sum-ii/	
	
	public static int twoSum2(int[] nums, int target) {
        // Write your code here
        Arrays.sort(nums);
        int left = 0, right = nums.length - 1;
        int ans = 0;
        while(left < right) {
            if(nums[left] + nums[right] > target) {
            	System.out.println("--"
            			+ ""
            			+ ""
            			+ ""
            			+ ""
            			+ ""
            			+ ""
            			+ ""+(right - left));
                ans = ans + (right - left);
                right --;
            } else {
                left ++;
            }
        }
        return ans;
    }
    
 
    
    public static void main(String[] args) {
    	System.out.println(twoSum2(new int[]{1,2,3,4},2));
    }
}
