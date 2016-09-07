package com.algorithm.sort;

import java.util.Arrays;

public class SelectSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = { 9, 2, 4, 7, 3, 8, 10 };
		System.out.println(Arrays.toString(x));
		//selectSort(x);
		selectSortWilliam(x);
		System.out.println(Arrays.toString(x));
	}
	
	public static void selectSortWilliam(int[] arr){
		
		for(int i=0;i<arr.length;i++){
			int min = i;
			int minnumber=arr[i];
			for(int j=1+i;j<arr.length;j++){
				if(arr[j]<minnumber){
					min=j;
					minnumber=arr[j];
				}
			}
			if(min!=i){
				int temp=arr[i];
				arr[i]=arr[min];
				arr[min]=temp;
			}
			
		//	System.out.println(i+" __ "+Arrays.toString(arr));

		}
		
		
	}

public static void selectSort(int[]a)
{
    int minIndex=0;
    int temp=0;
    if((a==null)||(a.length==0))
        return;
    for(int i=0;i<a.length-1;i++)
    {
        minIndex=i;//无序区的最小数据数组下标
        for(int j=i+1;j<a.length;j++)
        {
            //在无序区中找到最小数据并保存其数组下标
            if(a[j]<a[minIndex])
            {
                minIndex=j;
            }
        }
        if(minIndex!=i)
        {
            //如果不是无序区的最小值位置不是默认的第一个数据，则交换之。
            temp=a[i];
            a[i]=a[minIndex];
            a[minIndex]=temp;
        }
    }
}


}
