package com.algorithm.sort;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[]{3,2,5,4,6,8,1};
		System.out.println();
		for(int aa:arr){
			System.out.print("\t"+aa);
		}
		//insertSort(arr);
		BubbleSort(arr);
		
		System.out.println();
		for(int aa:arr){
			System.out.print("\t"+aa);
		}
		
		System.out.println(binarySearch(arr,2));
		System.out.println(binarySearch1(arr,2));

	}
	
	
	public static int binarySearch1(int[] srcArray, int des) {
	    int low = 0;
	    int high = srcArray.length - 1;
	 
	    while ((low <= high) && (low <= srcArray.length - 1)&& (high <= srcArray.length - 1)) {
	        int middle = (high + low)/2;
	        if (des == srcArray[middle]) {
	            return middle;
	        } else if (des < srcArray[middle]) {
	            high = middle - 1;
	        } else {
	            low = middle + 1;
	        }
	    }
	    return -1;
	}
	static boolean binarySearch(int arr[],int x){
		
		int low=0;
		int hight=arr.length-1;
		
		while((low<=hight)&&(low<=arr.length-1)&&(hight<=arr.length-1)){
	        int middle = (low + hight)/2;

			if(arr[middle]==x){
				return true;
				
			//  } else if (x < arr[middle]) {
			}else if(arr[middle]<x){
				 // arr
				low=middle+1;

			}else{
				  hight=middle-1;

			}
		}
		return false;
	}
	
	public static void  BubbleSort(int arr[]){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length-i-1;j++){
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			
		}
	}
	
	public static void insertSort(int arr[]){
		for(int i=1;i<arr.length;i++){
			int current=arr[i];
			int point = i;
			for(int j=i-1;j>=0;j--){
				if(arr[j]>current){
					arr[j+1]=arr[j];
					point--;
				}
				else{
					break;
				}
			}
			arr[point]=current;
		}
		
	}

}
