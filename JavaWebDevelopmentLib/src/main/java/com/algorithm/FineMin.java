package com.algorithm;

public class FineMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,2,4,5,6};
		System.out.println(min(arr));
	}
	public static int min(int[] arr){
		if(arr.length==1){
			return arr[0];
		}else if(arr.length==2){
			return Math.min(arr[0], arr[1]);
		}else{
			int first=arr.length/2;
			int sec=arr.length-first;
			int[] fi= new int[first];
			int[] se= new int[sec];
			for(int i=0;i<first;i++){
				fi[i]=arr[i];
			}
			for(int j=first;j<arr.length;j++){
				se[j-first]=arr[j];
			}
			
			return Math.min(min(fi), min(se));
			
		}
	}
		
	
	
	
	
}
