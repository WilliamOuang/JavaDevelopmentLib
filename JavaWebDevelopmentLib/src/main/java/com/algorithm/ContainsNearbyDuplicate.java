package com.algorithm;

import java.util.HashSet;
import java.util.Set;

public class ContainsNearbyDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,2,4,5,2};
		
		System.out.println(containsNearbyDuplicate(arr,4));
		
	    Set<Integer> set = new HashSet<>();
	    set.add(1);
	    set.add(2);
	    set.add(3);
	    set.add(4);
	    set.add(5);
	    System.out.println(set.toString());
	    set.remove(3);
	    System.out.println(set.toString());

	}

	public static boolean containsNearbyDuplicate(int[] nums, int k) {
		
		
	    Set<Integer> set = new HashSet<>();
	    for (int i = 0; i < nums.length; i++) {
	        if (!set.add(nums[i]))
	            return true;
	        // keep the size of set not larger than k
	        if (set.size() >  k)  
	            set.remove(nums[i-k]);
	    }
	    return false;
		
		
		
		// William Version
//		 if(k>n.length){
//             return false;
//         }
//         for(int i=0;i<n.length-1;i++){
//             for(int j=i+1;j<n.length;j++){
//                 if(j-i<=k&&n[i]==n[j]){
//                    return true;
//                 }
//             }
//         }
//         return false;
	}
}
