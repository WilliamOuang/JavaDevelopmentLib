package com.algorithm.Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.javaBasic.Array;


public class Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1={1};
		int[] arr2={1,1};
		System.out.println(Arrays.toString(intersect(arr1,arr2)));
		
 	}
	public static int[] intersect(int[] n1, int[] n2) {
		
		int[] result= new int[n1.length>n2.length?n1.length:n2.length];
		
        Map<Integer, Integer> map=new HashMap();
        for(int i=0;i<n1.length;i++){
        	if(map.get(n1[i])==null){
        		map.put(n1[i], 1);
        	}else{
        		map.put(n1[i], map.get(n1[i])+1);
        	}
        }
        int count=0;
        for(int j=0;j<n2.length;j++){
        	if(map.containsKey(n2[j])&&map.get(n2[j])>=1){
        		result[count]=n2[j];
        		map.put(n2[j], map.get(n2[j])-1);
        		count++;
        	}
        }
        int[] res= new int[count];
        for(int k=0;k<res.length;k++){
        	res[k]=result[k];
        }
        return res;
    }
}
