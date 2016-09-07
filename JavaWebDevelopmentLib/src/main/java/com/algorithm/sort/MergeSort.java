package com.algorithm.sort;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1={1,2,6,7,8,9};
		int[] arr2={4,5,10};

	//	int[] merge=arrayMerge(arr1,arr2);
		int[] merge=WilliamMerger(arr1,arr2);

		System.out.println(Arrays.toString(merge));
	}

	
	public static int[] WilliamMerger(int arr1[], int arr2[]){
		if(arr1==null){
			return arr2;
		}
		if(arr2==null){
			return arr1;
		}
		int reArr[]= new int [arr1.length+arr2.length];
		
		int left=0;
		int right=0;
		int mid=0;
		while(left <arr1.length&& right<arr2.length){
			if(arr1[left]<arr2[right]){
				reArr[mid++]=arr1[left++];
			}else{
				reArr[mid++]=arr2[right++];
			}
		}
		if(left<arr1.length){
			reArr[mid++]=arr1[left++];
		}
		if(right<arr2.length){
			reArr[mid++]=arr2[right++];
		}
		
		return reArr;
		
	}
	
	
	
	
	
	
	
	
	
	
	public static int[] arrayMerge(int[] arr1,int [] arr2){
		int[] arr= new int[arr1.length+arr2.length];
		int left=0;
		int right=0;
		int middle=0;
		while(left<arr1.length&& right<arr2.length){
			if(arr1[left]<arr2[right]){
				arr[middle++]=arr1[left++];
			}else{
				arr[middle++]=arr2[right++];
			}
		}
		
		if(left<arr1.length){
			arr[middle++]=arr1[left++];
		}
		if(right<arr2.length){
			arr[middle++]=arr2[right++];
		}
		
		return arr;
	}
	
	
}
