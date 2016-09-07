package com.javaBasic;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //TreeSet<Integer> s1 = new TreeSet<>();  
		//Set<Integer> s1= new HashSet();
		Set<Integer> s1= new LinkedHashSet();

        
		 s1.add(3);
        s1.add(1);
        s1.add(2);
       
        s1.add(4);
       // s1.add(4);
        Iterator i=   s1.iterator();
        while(i.hasNext()){
        	System.out.println(i.next());
        }
	}

}
