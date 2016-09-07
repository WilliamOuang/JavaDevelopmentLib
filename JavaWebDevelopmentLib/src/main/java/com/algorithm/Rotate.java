package com.algorithm;

public class Rotate {

//	Problem: Rotate an array of n elements to the right by k steps. For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4]. How many different ways do you know to solve this problem?
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[]{1,2,3,4,5,6,7};
		for(int i :arr){
			System.out.print(i+"\t");
		}
		rotate(arr,3);
		System.out.println();
		for(int i :arr){
			System.out.print(i+"\t");
		}
	}
	
	public static int[] rotate(int[] arr,int order){
		
//		for(int i=k-1;i>=0;i--){
//			int temp=array[i];
//			array[i]=array[array.length-k+i];
//			array[array.length-k+i]=temp;
//		}
		
		for (int i = 0; i < order; i++) {
			for (int j = arr.length - 1; j > 0; j--) {
				int temp = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = temp;
			}
//			System.out.println("");
//			for(int q :arr){
//				System.out.print(q+"\t");
//			}
		}
		
		
		return arr;
	}

}
