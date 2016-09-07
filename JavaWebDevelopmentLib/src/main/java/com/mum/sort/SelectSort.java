package com.mum.sort;

public class SelectSort {

	//2,4,3,5,8,6,3 
	//  http://blog.csdn.net/yangliuy/article/details/43834913
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int aar[]=	selectSort(new int[]{2,4,3,5,8,6,3});
		System.out.println();
		for(int aa:aar){
			System.out.print("\t"+aa);
		}
	}
	public static int[] selectSort(int arr[]){
		
		for(int i=0;i<arr.length;i++){
			int min=arr[i];
			int minIdex=i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]<min){
					minIdex=j;
				}
			}
			arr[i]=arr[minIdex];
			arr[minIdex]=min;
			
		}
		for(int aa:arr){
			System.out.print("\t"+aa);
		}
		return arr;
	}
}
