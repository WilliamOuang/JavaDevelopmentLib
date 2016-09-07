package com.algorithm;

import java.util.ArrayList;
import java.util.List;

import com.sun.org.apache.bcel.internal.classfile.LineNumberTable;

public class CombinationWilliam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={4,5,6};
		List<List<Integer>> result=Conbination(arr,2);
		System.err.println(result.toString());
	}
	public static List<List<Integer>> Conbination(int arr[],int k){
		List<List<Integer>> res= new ArrayList();
		List<Integer> all=new ArrayList<>();
		for(int i:arr){
			all.add(i);
		}
		dfs(all,k,0,new ArrayList<>(),res);
		return res;
	}
	public static void dfs(List<Integer> all,int k,int start,List<Integer> pList,List<List<Integer>> res){
		if(k==0){
			res.add(pList);
			return;
		}
		
		for(int i=k;i<all.size();i++){
			List<Integer> p = new ArrayList<>(pList);
			p.add(all.get(i));
			dfs(all, k-1, i+1, p, res);
			
		}
		
		
		
		
		
		
		
		
		
//		if(k==0){
//			res.add(pList);
//			return;
//		}
//		for(int j=start;j<all.size();j++){
//			List<Integer> p = new ArrayList<>(pList);
//			p.add(all.get(j));
//			dfs(all,k-1,j+1,p,res);
//			
//		}
	}

}
