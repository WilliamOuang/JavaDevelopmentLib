package com.String;

import java.util.HashMap;
import java.util.Map;

public class FindSubString {

	public static void main(String[] args) {
		
		
		System.out.println(splitArray(new int[]{1,2,4,5,6,9,8},3).length);
		
		
	}
	
	/*
	 * 
	 * Split a array to SubArray 
	 * By william Feb 15,2016
	 * 
	 */
	public static int[] splitArray(int arr[],int k){
		int arrSize;
		if(arr.length%k==0){
			arrSize=arr.length/k;
		}else{
			arrSize=arr.length/k+1;
		}
		int[]  retArr= new int[arrSize];
		for(int i=0;i<arrSize;i++){
			int temp = 0;
			int len=k*i+k;
			while(len>arr.length){
				len--;
			}
			for(int j=k*i;j<len;j++){
				temp+=arr[j];
			}
			retArr[i]=temp;
			System.out.println(temp);
		}
		
		return retArr;
		
	}
	
	
	public static String returnSubString(String str){
		
		char c[]=str.toCharArray();
		String returnString="";
		Map<Integer,String> map=new HashMap<Integer,String>();
		for(int i=0;i<c.length;i++){
		StringBuffer stf=new StringBuffer();
		int key=0;
			for(int j=i;j<c.length;j++){
				if(stf.indexOf(""+c[j])==-1){
					stf.append(c[j]);
					key++;
				}else{
					map.put(key, ""+stf);
				}
			}
		}
		
		int max=0;
		for(Map.Entry<Integer, String> entry:map.entrySet()){    
		     System.out.println(entry.getKey()+"--->"+entry.getValue());
		     if(entry.getKey()>max){
		    	 max=entry.getKey();
		     }
		}  
		
		return map.get(max);
		
		
	}

}
