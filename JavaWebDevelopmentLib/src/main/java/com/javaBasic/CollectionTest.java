package com.javaBasic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class CollectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//http://blog.sina.com.cn/s/blog_6189bd4d0100fbol.html
		
		//{{1,5},{2,3},{6,5}},   {{4,2},{2,6},{5,7}} 
		int a[][]={{1,5},{2,3},{6,5}};
		int []cc= new int[3];
		for(int d:cc){
			System.out.println(d);
		}
		
		int cc1[]= new int[4];
		
		int b[][]={{4,2},{2,6},{5,7}};
		System.out.println(mergerArray(a,b).toString());
		
		List<Integer> list= new ArrayList();
		list.add(2);
		list.add(5);
		list.add(9);
		accessCollectionByIterator(list);
		
		
		LinkedList<Integer> linked = new LinkedList<Integer>();
		linked.add(3);
		
		
		List<Integer> list1= new ArrayList();
		list1.add(2);
		list1.add(5);
		list1.add(9);
		list1.add(6);
		
		Collections.sort(list1);
		for(Integer i:list1){
			System.out.println(i);;
		}
		
	}
	
	private static void accessCollectionByIterator(Collection<Integer> collection)
	{
	    Iterator<Integer> iterator = collection.iterator();
	    System.out.println("The value in the list:");
	    while(iterator.hasNext())
	    {
	        System.out.println(iterator.next());
	    }
	}
	

	public static int[][]  mergerArray(int [][] a,int[][] b){
		int c[][] = new int[a.length][b.length];
		
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				c[i][j]=a[i][j]+b[i][j];
				//System.out.println(c[i][j]);
			}
		}
		
		return c;
	}
	
}
