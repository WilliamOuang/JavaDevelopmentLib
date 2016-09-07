package com.algorithm.DP;

import java.time.chrono.MinguoChronology;

import com.sun.javafx.image.IntPixelGetter;

public class MaxSubArray {

	public static void main(String[] args) {
		
		int n=9;
		
		int arr[]={-2,1};

		System.out.println(getMaxSubArray1(arr));
		System.out.println(subArray(arr));

	}
	public static int subArray(int array[]){
		int total = Integer.MIN_VALUE;
		int sum   = Integer.MIN_VALUE;
		for(int i=0;i<array.length;i++){
			total=Math.max(array[i], array[i]+total);
			sum=Math.max(total, sum);
		}
		return sum;
		
	}
	
	
	
	
	
	
	
	
	
	
	static int getMaxSubArray1(int[] array){
		
		int total=Integer.MIN_VALUE;
		int sum =Integer.MIN_VALUE;
		for(int i=0;i<array.length;i++){
			total=Math.max(array[i], array[i]+total);
			sum=Math.max(total,sum);
		}
		return sum;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	static int getMaxSubArray(int arr[]){
		
		int big= Integer.MIN_VALUE;
		int total=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			total=Math.max(arr[i], arr[i]+total);
			big=Math.max(total, big);
		}
		return big;
	}

}
