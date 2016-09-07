package com.mum.sort;

public class InsertSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int aar[]=	insertSort(new int[]{2,4,3,5,8,6,3});
	System.out.println();
	for(int aa:aar){
		System.out.print("\t"+aa);
	}
	
	}
	
	public static int[] insertSort(int arr[]){
		
		for(int i=0;i<arr.length;i++){
			int temp=arr[i];
			int j=i-1;
			while(j>=0&&arr[j]<temp){
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
		for(int aa:arr){
			System.out.print("\t"+aa);
		}
		
		return arr;
		
	}

}
