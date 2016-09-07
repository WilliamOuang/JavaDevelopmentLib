package com.algorithm;

import java.util.ArrayList;
import java.util.List;

public class MajorityElement {
	//Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times. The algorithm should run in linear time and in O(1) space.


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,2,4,4,2,6,6,6};
		System.out.println(majorityElement(arr).toString());
	}
	public static List<Integer> majorityElement(int[] nums) {
	    if (nums == null || nums.length == 0)
	        return new ArrayList<Integer>();
	    List<Integer> result = new ArrayList<Integer>();
	    int number1 = nums[0], number2 = nums[0], count1 = 0, count2 = 0, len = nums.length;
	    for (int i = 0; i < len; i++) {
	        if (nums[i] == number1)
	            count1++;
	        else if (nums[i] == number2)
	            count2++;
	        else if (count1 == 0) {
	            number1 = nums[i];
	            count1 = 1;
	        } else if (count2 == 0) {
	            number2 = nums[i];
	            count2 = 1;
	        } else {
	            count1--;
	            count2--;
	        }
	    }
	    count1 = 0;
	    count2 = 0;
	    for (int i = 0; i < len; i++) {
	        if (nums[i] == number1)
	            count1++;
	        else if (nums[i] == number2)
	            count2++;
	    }
	    if (count1 > len / 3)
	        result.add(number1);
	    if (count2 > len / 3)
	        result.add(number2);
	    return result;
	}
}
