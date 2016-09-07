package com.algorithm.Array;

public class FindAdjacentElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,1,4,6,7,8,70,69,-4,3};
		findAdjacentElements(arr);
	}
	
	public static void findAdjacentElements(int[] arr){
		if(arr==null || arr.length==0|| arr.length==1){
			System.out.println("None Adj");
			return;
		}else{
			for(int i=1;i<arr.length;i++){
				if(Math.abs(arr[i]-arr[i-1])==1){
					System.out.println(arr[i-1]+" " +arr[i]);
				}
			}
		}
	}

}
