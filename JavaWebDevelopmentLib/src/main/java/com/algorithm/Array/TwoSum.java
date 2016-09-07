package com.algorithm.Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr={2,10,8,9,1,3,11};
		
		System.out.println(Arrays.toString(twoSum(arr,21)));
		System.out.println(Arrays.toString(twoSumWilliam(arr,21)));
		System.out.println(Arrays.toString(twoSumV2(arr,21)));

	}
	
	public static int[] twoSumV2(int[] numbers, int target) {
        int [] res = new int[2];
        if(numbers==null||numbers.length<2)
            return res;
        
        //copy original list and sort
        int[] copylist = new int[numbers.length];  
        System.arraycopy(numbers, 0, copylist, 0, numbers.length);  
        Arrays.sort(copylist);    
        
        int low = 0;
        int high = copylist.length-1;
        
        while(low<high){
            if(copylist[low]+copylist[high]<target)
                low++;
            else if(copylist[low]+copylist[high]>target)
                high--;
            else{
                res[0]=copylist[low];
                res[1]=copylist[high];
                break;
            }
        }
        
        //find index from original list
        int index1 = -1, index2 = -1;  
        for(int i = 0; i < numbers.length; i++){  
            if(numbers[i] == res[0]&&index1==-1)
                index1 = i+1;
            else if(numbers[i] == res[1]&&index2==-1)
                index2 = i+1;
       } 
        res[0] = index1;
        res[1] = index2;
        Arrays.sort(res);
        return res;
    }
	
	
	
	
	
	
	
	
	
	
	public static int[] twoSumWilliam(int []arr,int target){
		int[] ret= new int[2];
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++){
			if(!map.containsKey(target-arr[i])){
				map.put(arr[i],i);
			}else{
				ret[1]=i+1;
				ret[0]=map.get(target-arr[i])+1;
				break;
			}
		}		
		return ret;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public static int[] twoSum(int[] numbers, int target) {
        int [] res = new int[2];
        if(numbers==null||numbers.length<2)
            return res;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0; i < numbers.length; i++){
            if(!map.containsKey(target-numbers[i])){
                map.put(numbers[i],i);
            }else{
                res[0]= map.get(target-numbers[i])+1;
                res[1]= i+1;
                break;
            }
        }
        return res;
    }

}
