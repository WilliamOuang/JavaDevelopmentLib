package com.javaBasic;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		//http://blog.sina.com.cn/s/blog_6189bd4d0100fbb1.html
	
		System.out.println(Arrays.binarySearch(new int[]{1,2}, 3));
		//Arrays.
		System.out.println("===========");
		
		
		
		String[] arr= new String[3];
		int aaa[]={1,2,3};
		int [] bbb= new int[]{1,2,4};
			
			arr[0]="1";
			arr[1]="2";
			arr[2]="3";
		
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		
		String [][] test=new String[2][2];
		for(int i=0;i<test.length;i++){
			for(int j=0;j<test[i].length;j++){
				test[i][j]=i+"_"+j;
				System.out.println(test[i][j]);
			}
			
		}
		
		int[][] numseven=new int[][]{{10,20,30},{40,50,2},{60,2,1}}; //没什么好说的如果你在看不懂 那就别学了！
		System.out.println(numseven[0][2]);
		System.out.println(numseven[1][1]);
		System.out.println(numseven[0][0]);
		System.out.println(numseven[2][2]);
		
		
		
		
		float[][] numthree;             //定义一个float类型的2维数组
		numthree=new float[5][5];       //为它分配5行5列的空间大小
		numthree[0][0]=1.1f;            //通过下标索引去访问     1行1列=1.1
		numthree[1][0]=1.2f;                                  // 2行1列=1.2
		numthree[2][0]=1.3f;                                  // 3行1列=1.3
		numthree[3][0]=1.4f;                                  // 4行1列=1.4
		numthree[4][0]=1.5f;                                  // 5行1列=1.5
		System.out.println(numthree[0][0]); //打印换行输出喽
		System.out.println(numthree[1][0]);
		System.out.println(numthree[2][0]);
		System.out.println(numthree[3][0]);
		System.out.println(numthree[4][0]);
		
		
		
		 short[][] numfour=new short[5][8]; //定义一个short类型的数组同时为它分配5行8列的空间大小
		   numfour[0][7]=10;
		   numfour[1][6]=20;
		   numfour[2][5]=30;
		   numfour[3][4]=40;
		   numfour[4][3]=50;
		   System.out.println(numfour[0][7]);
		   System.out.println(numfour[1][6]);
		   System.out.println(numfour[2][5]);
		   System.out.println(numfour[3][4]);
		   System.out.println(numfour[4][3]);
		
		   long[][] numfive=new long[5][];     //定义一个long类型的不规则数组
		   numfive[0]=new long[5];             //为第1行分配5列
		   numfive[1]=new long[6];             //为第2行分配6列
		   numfive[2]=new long[7];             //为第3行分配7列
		   numfive[3]=new long[8];             //为第4行分配8列
		   numfive[4]=new long[9];             //为第5行分配9列
		   numfive[0][4]=10000000000L;         //1行5列=10000000000
		   numfive[1][5]=20000000000L;         //2行6列=20000000000
		   numfive[2][6]=30000000000L;         //3行7列=30000000000
		   numfive[3][7]=40000000000L;         //4行8列=40000000000
		   numfive[4][8]=50000000000L;         //5行9列=50000000000
		   System.out.println(numfive[0][4]); //打印换行输出喽
		   System.out.println(numfive[1][5]);
		   System.out.println(numfive[2][6]);
		   System.out.println(numfive[3][7]);
		   System.out.println(numfive[4][8]);
		   System.out.println(numfive[4][7]); //打印输出一个没有定义数组元素的数组 java会自动将他初始化值为0
		   
		   
		   int[][] numten=new int[][]{{10,20,30},{40,50},{60}}; //没什么好说的如果你在看不懂 那就别学了！
		   System.out.println(numten[0][2]);
		   System.out.println(numten[1][1]);
		   System.out.println(numten[0][0]);
		   
		   int[][] numeight={{100,200,300,400},{500,600,700,800},{900,1000,1100,1200,1300}};
		   System.out.println(numeight[0][2]);
		   System.out.println(numeight[1][2]);
		   System.out.println(numeight[2][1]);
		
	}

}





