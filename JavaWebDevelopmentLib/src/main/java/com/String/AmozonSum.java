package com.String;

public class AmozonSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int arr[]={1,2,3,1,4,2};
			for(int aa:arr){
				System.out.print("\t"+aa);
			}
		int arr1[]=	countNum(arr);
		System.out.println();
		for(int aa:arr1){
			System.out.print("\t"+aa);
		}
	}
	
	static int[] countNum(int[] arr){
	
		int returnarr[] = new int[arr.length];
		int re=0;
		for(int i=0;i<arr.length;i++){
			int count=0;
			for(int j=0;j<arr.length;j++){
				if(arr[i]==arr[j]){
					count++;
				}
			}
			if(count==1){
				returnarr[re]=arr[i];
				re++;
			}
		}
		int returnarr1[]= new int[re];
		for(int k=0;k<re;k++){
			
			returnarr1[k]=returnarr[k];
		}
		
		return returnarr1;
	}

}
