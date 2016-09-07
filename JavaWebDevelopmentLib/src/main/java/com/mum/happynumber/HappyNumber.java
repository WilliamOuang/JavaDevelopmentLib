package com.mum.happynumber;

import java.util.HashMap;
import java.util.Map;



public class HappyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.out.println(isHappy(18));
//System.out.println(isHappyNumber(19));
//System.out.println("1234".charAt(2)-'0');

//System.out.println(containsDuplicate(new int[]{1,2,3,4,6,6}));
System.out.println(containsDuplicate1(new int[]{1,2,1,4,6,6},1));
	}
	
	public static boolean containsDuplicate1(int[] nums,int k) {
		
		        Map<Integer, Integer> map = new HashMap<>();
		        for(int i = 0; i < nums.length; ++i) {
		            if(map.containsKey(nums[i]) && (i - map.get(nums[i])) <= k) return true;
		            map.put(nums[i], i);
		        }
		        return false;
	
		
    }
	
	public static boolean containsDuplicate(int[] nums) {
		Map<Integer,Integer> val= new HashMap<Integer,Integer>();
		for(int i=0;i<nums.length;i++){
			if(val.containsKey(nums[i])){
				return true;
			}else{
				val.put(nums[i], 1);
			}
		}
	return false;
		
    }
	
	public static boolean isHappyNumber(int number){
		
		int value=number;
		String strVal;
		do{
			
			strVal=Integer.toString(value);
			value = 0;
			for(int i=0;i<strVal.length();i++){
				  //System.out.println("___"+strVal.charAt(i) - "0"+"");
				value+=Math.pow(strVal.charAt(i)-'0', 2);
			}
		}while(value>9);
		
		return value==1;
	}
	
	
	
	public static boolean isHappy(int n) {
	    int value = n;
	    String strVal;
	    do {
	        strVal = Integer.toString(value);
	        System.out.println(strVal);
	        value = 0;
	        for (int i = 0; i < strVal.length(); i++) {
	        	  System.out.println(strVal.charAt(i)+'0');
	            value += Math.pow(strVal.charAt(i) - '0', 2);
	           // System.out.println("value==="+value);
	        }
	    } while (value > 9);

	    return value == 1;
	}

}
