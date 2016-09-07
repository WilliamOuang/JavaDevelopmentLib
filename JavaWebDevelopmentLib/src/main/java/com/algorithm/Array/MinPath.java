package com.algorithm.Array;

public class MinPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	public int minPathSum(int[][] grid) {
        if (grid == null || grid.length < 1 || grid[0].length < 1) {
           return 0;
       }
       
       int[][] result=new int[grid.length][grid[0].length];
       result[0][0]=0;
       // first row
       for(int i=1;i<result[0].length;i++){
           result[0][i]=result[0][i-1]+grid[0][i];
       }
       // first column
       for(int j=1;j<result.length;j++){
           result[j][0]=result[j-1][0]+grid[j][0];
       }
       
       for(int n=1;n<grid[0].length;n++){
           for(int m=1;m<grid.length;m++){
               result[n][m]=Math.min(grid[n-1][m],grid[n][m-1])+grid[n][m];
           }
           
       }
       return Math.min(result[grid.length][grid[0].length-1],result[grid.length-1][grid[0].length]);
   }
}
