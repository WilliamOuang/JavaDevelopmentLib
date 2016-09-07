package com.algorithm.Array;

import java.util.Arrays;

import com.sun.swing.internal.plaf.metal.resources.metal;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[][] { { 1,2,3,4 }, { 5,6,7,8 }, { 9,0,1,2 }, { 3,4,5,6 } }; 
		for(int i=0;i<arr.length;i++){
			System.out.println(Arrays.toString(arr[i]));
		}
		//rotate(arr);
		//inPlacerotate(arr);
		int arr1[][]=rotateMatrixRight(arr);
		System.out.println();
		
		for(int i=0;i<arr1.length;i++){
			System.out.println(Arrays.toString(arr1[i]));
		}
	}
	
	public static int[][] rotateMatrixRight(int[][] matrix)
	{
	    /* W and H are already swapped */
	    int w = matrix.length;
	    int h = matrix[0].length;
	    int[][] ret = new int[h][w];
	    for (int i = 0; i < h; ++i) {
	        for (int j = 0; j < w; ++j) {
	            ret[i][j] = matrix[w - j - 1][i];
	        }
	    }
	    return ret;
	}
	// In-place Solution
	public static void inPlacerotate(int[][] matrix) {
		int n = matrix.length;
		for (int i = 0; i < n / 2; i++) {
			for (int j = 0; j < n / 2; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[n-1-j][i];
				matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
				matrix[n-1-i][n-1-j] = matrix[j][n-1-i];
				matrix[j][n-1-i] = temp;
			}
		}
	}
	
	
	public static void RotateArray(int[][] array){
		int returnArray[][]= new int[array.length][array.length];
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array.length;j++){
				returnArray[j][array.length-1-i]=array[i][j];
				
			}
			
		}
        int m = array.length;
        for(int i=0; i<m; i++){
	            for(int j=0; j<m; j++){
	            	array[i][j] = returnArray[i][j];
	            }
	        } 		
	}
	public static void rotate(int[][] matrix) {
        if(matrix == null || matrix.length==0)
            return ;
 
        int m = matrix.length;
 
        int[][] result = new int[m][m];
 
        for(int i=0; i<m; i++){
            for(int j=0; j<m; j++){
                result[j][m-1-i] = matrix[i][j];
            }
        } 
 
       for(int i=0; i<m; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = result[i][j];
            }
        } 
    }
}
