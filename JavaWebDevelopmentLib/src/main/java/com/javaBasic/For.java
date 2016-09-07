package com.javaBasic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList();
		list.add(1);
		list.add(3);
		list.add(5);
		for(int i:list){
			System.out.println(i);
		}
		
		for(int i=0;i<list.size();i++){
			System.out.println("for =_= " +list.get(i));
		}
		
		Iterator<Integer> iter = list.iterator(); 
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
	}

}
