package com.algorithm;

public class InserSort {

	public static void insertIntoSorted(int[] ar) {
        for(int i=ar.length-1;i>=1;i--){
            
            if(ar[i]<ar[i-1]){
            	int temp=ar[i];
               // System.out.println(temp);
               ar[i]=ar[i-1];
                //System.out.println(ar[i]);
               printArray(ar);
                ar[i-1]=temp;
            }else{
            	
            }
          
           
            
        }
        // Fill up this function  
    }
    
    
/* Tail starts here */
    public static void main(String[] args) {
        int s = 5;
        int[] ar = new int[]{2,4,6,8,3};
        printArray(ar);
        insertIntoSorted(ar);
        System.out.println();
       printArray(ar);
    }
    
    
    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }

}
